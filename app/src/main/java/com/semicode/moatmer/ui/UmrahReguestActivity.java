package com.semicode.moatmer.ui;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.semicode.moatmer.adapter.AzkarAdapter;
import com.semicode.moatmer.adapter.MoatmerAdapter;
import com.semicode.moatmer.data.model.azkar.AzkarData;
import com.semicode.moatmer.data.model.moatmer.MoatmerModelData;
import com.semicode.moatmer.databinding.ActivityAzkarBinding;
import com.semicode.moatmer.databinding.ActivityUmrahRequestBinding;
import com.semicode.moatmer.mvp.UmrahRequestActivity.ActivityUmrahRequestPresenter;
import com.semicode.moatmer.mvp.UmrahRequestActivity.ActivityUmrahRequestView;
import com.semicode.moatmer.mvp.azkarActivit.ActivityAzkarPresenter;
import com.semicode.moatmer.mvp.azkarActivit.ActivityAzkarView;
import com.semicode.moatmer.share.HelperMethod;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UmrahReguestActivity extends AppCompatActivity implements MoatmerAdapter.OnMoatmerClick, ActivityUmrahRequestView {
    ActivityUmrahRequestBinding binding;
    ActivityUmrahRequestPresenter presenter;
    MoatmerAdapter moatmerAdapter;

    List<MoatmerModelData> moatmerDataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUmrahRequestBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init();


    }

    private void init() {
        moatmerAdapter = new MoatmerAdapter(moatmerDataList, this, this);
        presenter = new ActivityUmrahRequestPresenter(this, this);
        binding.umrahRequestRv.setAdapter(moatmerAdapter);
        binding.umrahRequestEtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                presenter.getMoatmers(s.toString());

            }
        });

    }


    @Override
    public void onMoatmerClick(int position) {
        HelperMethod.makeTextToast(this, "you click position :" + position);

    }

    @Override
    public void onload() {
        binding.umrahRequestLoadingProgrss.setVisibility(View.VISIBLE);
        binding.umrahRequestRv.setVisibility(View.GONE);

    }

    @Override
    public void onLoadMoatmer(List<MoatmerModelData> data) {
        moatmerDataList.clear();
        moatmerDataList.addAll(data);
        moatmerAdapter.notifyDataSetChanged();

    }

    @Override
    public void onFailed(String message) {
        HelperMethod.makeTextToast(this, message);
    }

    @Override
    public void onFailure(String message) {
        HelperMethod.makeTextToast(this, message);

    }

    @Override
    public void onFinish() {
        binding.umrahRequestRv.setVisibility(View.VISIBLE);
        binding.umrahRequestLoadingProgrss.setVisibility(View.GONE);

    }
}