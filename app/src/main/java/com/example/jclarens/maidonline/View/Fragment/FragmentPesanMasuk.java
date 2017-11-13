package com.example.jclarens.maidonline.View.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jclarens.maidonline.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPesanMasuk extends Fragment {


    public FragmentPesanMasuk() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View _view = inflater.inflate(R.layout.fragment_pesan_masuk, container, false);

        return _view;
    }

}
