package com.example.jclarens.maidonline.Model.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jclarens.maidonline.R;

/**
 * Created by jclarens on 15/11/17.
 */

public class RecyclerAdapterPesanMasuk extends RecyclerView.Adapter<RecyclerAdapterPesanMasuk.ViewHolder> {

    private Context context;
    class ViewHolder extends RecyclerView.ViewHolder {
        public TextView itemnama, itemtanggal, itemjam, itemsubject;
        public ImageView imageView;

        public ViewHolder(final View itemview){
        super(itemview);

        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_pesan,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 0;
    }

}