package com.semicode.moatmer.ui.moatmerDetails.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.semicode.moatmer.R;
import com.semicode.moatmer.databinding.FragmentPersonalInformationBinding;
import com.semicode.moatmer.databinding.FragmentUmratBinding;


public class UmaratFragment extends Fragment {
    FragmentUmratBinding binding;

    public static UmaratFragment newInstance() {
        UmaratFragment fragment = new UmaratFragment();

        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_umrat, container, false);
        return binding.getRoot();
    }
}