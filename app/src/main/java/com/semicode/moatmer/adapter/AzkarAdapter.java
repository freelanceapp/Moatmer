package com.semicode.moatmer.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.semicode.moatmer.R;
import com.semicode.moatmer.data.model.azkar.AzkarData;

import java.util.List;


public class AzkarAdapter extends RecyclerView.Adapter<AzkarAdapter.azkarViewHolder> {


    private List<AzkarData> DataList;
    private LayoutInflater mInflater;


    // data is passed into the constructor
    public AzkarAdapter(Activity activity, List<AzkarData> data) {
        this.mInflater = LayoutInflater.from(activity);
        this.DataList = data;
    }

    @Override
    public azkarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_rv_azkar, parent, false);
        return new azkarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(azkarViewHolder holder, int position) {
        setData(holder, position);


    }



    private void setData(azkarViewHolder holder, int position) {
        holder.textView.setText(DataList.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return DataList.size();
    }


    public class azkarViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        azkarViewHolder(View itemView) {

            super(itemView);

            textView = itemView.findViewById(R.id.item_rv_tv_description);

        }

    }
}