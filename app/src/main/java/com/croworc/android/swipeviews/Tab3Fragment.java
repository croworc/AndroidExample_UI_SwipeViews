package com.croworc.android.swipeviews;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ingo on 9/30/16.
 */

public class Tab3Fragment extends Fragment{

    /**
     * the fragment initialization parameter, i.e. the section/page number
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * the page/section number
     */
    private int mSectionNumber;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param sectionNumber The page/section number of this fragment
     * @return A new instance of fragment Tab2Fragment.
     */
    public static Tab3Fragment newInstance(int sectionNumber) {
        Tab3Fragment fragment = new Tab3Fragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab3, container, false);
        return rootView;
    }
}
