package com.semicode.moatmer.ui.moatmerDetails.fragment;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.semicode.moatmer.R;
import com.semicode.moatmer.databinding.FragmentPersonalInformationBinding;


public class PersonalInformationFragment extends Fragment {
    FragmentPersonalInformationBinding binding;

    public static PersonalInformationFragment newInstance() {
        PersonalInformationFragment fragment = new PersonalInformationFragment();

        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_personal_information, container, false);
        return binding.getRoot();
    }
}