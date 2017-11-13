package com.example.jclarens.maidonline.Model.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.jclarens.maidonline.R;
import com.example.jclarens.maidonline.View.Fragment.FragmentPesanKeluar;
import com.example.jclarens.maidonline.View.Fragment.FragmentPesanMasuk;

/**
 * Created by jclarens on 13/11/17.
 */

public class PagerAdapterPesan extends FragmentPagerAdapter{
    private Context thiscontext;
    public PagerAdapterPesan(FragmentManager fm, Context context){
        super(fm);
        thiscontext = context;
    }

    @Override
    public int getCount() {

        return 2;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentPesanMasuk();
            case 1:
                return new FragmentPesanKeluar();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return thiscontext.getResources().getString(R.string.pager_pesan_masuk);
            case 1:
                return thiscontext.getResources().getString(R.string.pager_pesan_keluar);
            default:
                return null;
        }
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

}
