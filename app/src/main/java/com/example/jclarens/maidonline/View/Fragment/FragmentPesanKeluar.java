package com.example.jclarens.maidonline.View.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jclarens.maidonline.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentPesanKeluar.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class FragmentPesanKeluar extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View _view = inflater.inflate(R.layout.fragment_pesan_keluar, container, false);

        return _view;
    }
}