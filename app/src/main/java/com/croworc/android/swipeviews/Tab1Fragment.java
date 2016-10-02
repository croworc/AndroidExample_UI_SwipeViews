package com.croworc.android.swipeviews;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A swipe page fragment containing a simple view.
 */
public class Tab1Fragment extends Fragment {
    /**
     * The fragment argument representing the section number (page number)
     * for this fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public Tab1Fragment() {
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param sectionNumber The page/section number of this fragment
     * @return A new instance of fragment Tab2Fragment.
     */
    public static Tab1Fragment newInstance(int sectionNumber) {
        Tab1Fragment fragment = new Tab1Fragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Set the layout.
        View rootView = inflater.inflate(R.layout.fragment_tab1, container, false);

        // Set the TextView's text to show the current section number.
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));

        return rootView;
    }
}
