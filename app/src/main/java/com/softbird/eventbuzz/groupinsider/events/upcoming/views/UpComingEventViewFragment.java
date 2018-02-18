package com.softbird.eventbuzz.groupinsider.events.upcoming.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softbird.eventbuzz.R;

/**
 * Created by laksh on 11-Dec-17.
 */

public class UpComingEventViewFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_group_event_view,container,false);
        return view;
    }
}
