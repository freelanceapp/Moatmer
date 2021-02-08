package com.semicode.moatmer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.semicode.moatmer.R;
import com.semicode.moatmer.data.model.moatmer.MoatmerModelData;
import com.semicode.moatmer.databinding.ItemRvMoatmerBinding;

import java.util.List;


public class MoatmerAdapter extends RecyclerView.Adapter<MoatmerAdapter.MoatmerViewHolder> {

    private List<MoatmerModelData> dataList;
    private LayoutInflater mInflater;
    OnMoatmerClick onMoatmerClick ;
    Context context;

    //    -------------   -------------   -------------   -------------   -------------   -------------   -------------
    public MoatmerAdapter(List<MoatmerModelData> categoryDate, Context context, OnMoatmerClick onItemClick) {
        this.dataList = categoryDate;
        this.context = context;
        mInflater = LayoutInflater.from(context);
        this.onMoatmerClick = onItemClick;

//        Paper.init(context);
//        lang = Paper.book().read("lang", java.util.Locale.getDefault().getLanguage());

    }

    @NonNull
    @Override
    public MoatmerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRvMoatmerBinding binding = DataBindingUtil.inflate(mInflater, R.layout.item_rv_moatmer, parent, false);
        return new MoatmerViewHolder(binding, onMoatmerClick);
    }

    @Override
    public void onBindViewHolder(@NonNull MoatmerViewHolder holder, int position) {
        MoatmerViewHolder moatmerViewHolder = (MoatmerViewHolder) holder;
        moatmerViewHolder.binding.setMoatmerModel(dataList.get(position));
        moatmerViewHolder.itemView.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                onMoatmerClick.onMoatmerClick(moatmerViewHolder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class MoatmerViewHolder extends RecyclerView.ViewHolder {
        public ItemRvMoatmerBinding binding;
        OnMoatmerClick onItemClick;

        public MoatmerViewHolder(@NonNull ItemRvMoatmerBinding binding, OnMoatmerClick onItemClick) {
            super(binding.getRoot());
            this.binding = binding;
            this.onItemClick = onItemClick;

        }
    }

    public interface OnMoatmerClick {
        void onMoatmerClick(int position);

    }
}