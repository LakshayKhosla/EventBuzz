package com.softbird.eventbuzz.groups.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softbird.eventbuzz.R;
import com.softbird.eventbuzz.groups.views.adapters.GroupsInflateAdapter;
import com.softbird.eventbuzz.groups.DAL.models.GroupsInflateModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by laksh on 09-Dec-17.
 */

public class MainScreenFragment extends Fragment {

    static MainScreenFragment mainScreenFragment;
    View mainView = null;
    RecyclerView recyclerViewGroups;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mainView = inflater.inflate(R.layout.frag_main_screen,container,false);
        return mainView;
    }

    @Override
    public void onStart() {
        super.onStart();
        bindViews();
        setAdapterOnRecyclerView();
    }

    public void setAdapterOnRecyclerView(){
        recyclerViewGroups.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerViewGroups.setAdapter(new GroupsInflateAdapter(getDummyList(),getActivity()));
    }
    public void bindViews(){
        recyclerViewGroups = mainView.findViewById(R.id.recyclerViewGroups);
    }

    public static MainScreenFragment getMainScreenFragment(){
        if(mainScreenFragment == null){
            mainScreenFragment = new MainScreenFragment();
        }
        return mainScreenFragment;
    }

    public List<GroupsInflateModel> getDummyList(){
        List<GroupsInflateModel> mList = new ArrayList<GroupsInflateModel>();

        for (int i = 0; i < 6; i++){
            GroupsInflateModel model = new GroupsInflateModel("No", "Royal Beast Riders","6");
            mList.add(model);
        }
        return mList;
    }

}
