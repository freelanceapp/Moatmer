package com.semicode.moatmer.adapter;

import android.app.Activity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import com.semicode.moatmer.ui.moatmerDetails.fragment.PersonalInformationFragment;
import com.semicode.moatmer.ui.moatmerDetails.fragment.UmaratFragment;



public class ViewPagerWithFragmentAdapter extends FragmentPagerAdapter {


    public ViewPagerWithFragmentAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);

    }



    // Returns total number of pages
    @Override
    public int getCount() {
        return 2;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position)
    {
        switch(position) {

            case 1: return UmaratFragment.newInstance();

            default: return PersonalInformationFragment.newInstance();
        }
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {

            case 1: return "Umarat";

            default: return "Personal Information";
        }
    }
}
