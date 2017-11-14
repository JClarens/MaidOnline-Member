package com.example.jclarens.maidonline.Model.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.jclarens.maidonline.R;
import com.example.jclarens.maidonline.View.Fragment.FragmentStatusDisetujui;
import com.example.jclarens.maidonline.View.Fragment.FragmentStatusPending;
import com.example.jclarens.maidonline.View.Fragment.FragmentStatusPenawaran;
import com.example.jclarens.maidonline.View.Fragment.FragmentStatusRiwayat;

/**
 * Created by jclarens on 14/11/17.
 */
public class PagerAdapterTransaksi extends FragmentPagerAdapter {
    private Context thiscontext;
    public PagerAdapterTransaksi(FragmentManager fm, Context context){
        super(fm);
        thiscontext = context;
    }

    @Override
    public int getCount() {

        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentStatusPenawaran();
            case 1:
                return new FragmentStatusPending();
            case 2:
                return new FragmentStatusDisetujui();
            case 3:
                return new FragmentStatusRiwayat();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return thiscontext.getResources().getString(R.string.pager_status_penawaran);
            case 1:
                return thiscontext.getResources().getString(R.string.pager_status_pending);
            case 2:
                return thiscontext.getResources().getString(R.string.pager_status_disetujui);
            case 3:
                return thiscontext.getResources().getString(R.string.pager_status_riwayat);
            default:
                return null;
        }
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
}
