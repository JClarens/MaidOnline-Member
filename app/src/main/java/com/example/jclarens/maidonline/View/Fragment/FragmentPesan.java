package com.example.jclarens.maidonline.View.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jclarens.maidonline.Model.Adapter.PagerAdapterPesan;
import com.example.jclarens.maidonline.R;


public class FragmentPesan extends Fragment {
    private TabLayout tabLayoutPesan;
    private ViewPager viewPagerPesan;
    private PagerAdapter pagerAdapterPesan;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View _view = inflater.inflate(R.layout.fragment_pesan, container, false);

        tabLayoutPesan = (TabLayout) _view.findViewById(R.id.tl_pesan);
        viewPagerPesan = (ViewPager) _view.findViewById(R.id.vp_pesan);
        pagerAdapterPesan = new PagerAdapterPesan(getChildFragmentManager(),getContext());
        viewPagerPesan.setAdapter(pagerAdapterPesan);
        tabLayoutPesan.setupWithViewPager(viewPagerPesan);

        viewPagerPesan.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {


                pagerAdapterPesan.notifyDataSetChanged();
                viewPagerPesan.setCurrentItem(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        return _view;
    }
}
