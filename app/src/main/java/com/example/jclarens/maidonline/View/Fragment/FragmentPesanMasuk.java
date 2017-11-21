package com.example.jclarens.maidonline.View.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.jclarens.maidonline.Model.Adapter.RecyclerAdapterPesanMasuk;
import com.example.jclarens.maidonline.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPesanMasuk extends Fragment {
    private RecyclerView recyclerViewPesanMasuk;
    private RecyclerView.LayoutManager recyclerViewLayoutManager;
    private RecyclerAdapterPesanMasuk recyclerAdapterPesanMasuk;
//    private List<MyMessage> myMessages = new ArrayList<>();
    private SwipeRefreshLayout swipeRefreshLayout;
    private LinearLayout linearLayoutNoList, linearLayoutLoading, linearLayoutNoConnection;

    public FragmentPesanMasuk() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View _view = inflater.inflate(R.layout.fragment_pesan_masuk, container, false);

        swipeRefreshLayout = (SwipeRefreshLayout) _view.findViewById(R.id.srl_pesanmasuk);
        linearLayoutNoList = (LinearLayout) _view.findViewById(R.id.ll_nolistpm);
        linearLayoutLoading = (LinearLayout) _view.findViewById(R.id.ll_loadingpm);
        linearLayoutNoConnection = (LinearLayout) _view.findViewById(R.id.ll_noconnectionpm);
        recyclerViewPesanMasuk = (RecyclerView) _view.findViewById(R.id.rcv_pesanmasuk);

        recyclerViewLayoutManager = new LinearLayoutManager(getContext());
        recyclerViewPesanMasuk.setLayoutManager(recyclerViewLayoutManager);
        recyclerAdapterPesanMasuk = new RecyclerAdapterPesanMasuk();
        recyclerViewPesanMasuk.setAdapter(recyclerAdapterPesanMasuk);
      //  recyclerAdapterPesanMasuk.setcontext(getActivity());




        return _view;
    }

}
