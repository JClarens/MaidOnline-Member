package com.example.jclarens.maidonline.View.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jclarens.maidonline.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentStatus.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentStatus#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentStatus extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View _view = inflater.inflate(R.layout.fragment_status,container,false);

        return _view;
    }
}
