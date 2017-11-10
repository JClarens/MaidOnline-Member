package com.example.jclarens.maidonline.lib.api;

import com.example.jclarens.maidonline.lib.database.SharedPref;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by michael on 4/26/17.
 */

public class SessionInterceptor implements Interceptor {

    private static final String TAG  = "OkHttp-Session";

    @Override
    public Response intercept(Chain chain) throws IOException {
        Response response;

        if(!SharedPref.getValueString(SharedPref.ACCESS_TOKEN).isEmpty()){
            Request request = chain.request().newBuilder().addHeader(
                    APIManager.AUTHORIZATION_HEADER,
                    "Bearer " + SharedPref.getValueString(SharedPref.ACCESS_TOKEN))
                    .build();
            response = chain.proceed(request);
        }else{
            response = chain.proceed(chain.request());
        }
        return response;
    }
}