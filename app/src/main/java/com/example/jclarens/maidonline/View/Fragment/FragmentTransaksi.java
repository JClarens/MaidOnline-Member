package com.example.jclarens.maidonline.View.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jclarens.maidonline.Model.Adapter.PagerAdapterTransaksi;
import com.example.jclarens.maidonline.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentTransaksi.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentTransaksi#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentTransaksi extends Fragment {
    private TabLayout tabLayoutTransaksi;
    private ViewPager viewPagerTransaksi;
    private PagerAdapter pagerAdapterTransaksi;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View _view = inflater.inflate(R.layout.fragment_transaksi,container,false);

        tabLayoutTransaksi = (TabLayout) _view.findViewById(R.id.tl_transaksi);
        viewPagerTransaksi = (ViewPager) _view.findViewById(R.id.vp_transaksi);
        pagerAdapterTransaksi = new PagerAdapterTransaksi(getChildFragmentManager(),getContext());
        viewPagerTransaksi.setAdapter(pagerAdapterTransaksi);
        tabLayoutTransaksi.setupWithViewPager(viewPagerTransaksi);
        tabLayoutTransaksi.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPagerTransaksi.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                pagerAdapterTransaksi.notifyDataSetChanged();
                viewPagerTransaksi.setCurrentItem(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        return _view;
    }
}
