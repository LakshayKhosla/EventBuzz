package com.softbird.eventbuzz.groups.views.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.softbird.eventbuzz.R;
import com.softbird.eventbuzz.groupinsider.views.GroupsViewActivity;
import com.softbird.eventbuzz.groups.DAL.models.GroupsInflateModel;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by laksh on 09-Dec-17.
 */

public class GroupsInflateAdapter extends RecyclerView.Adapter<GroupsInflateAdapter.GroupsViewHolder>{

    List<GroupsInflateModel> mList;
    Context context;

    public GroupsInflateAdapter(List<GroupsInflateModel> mList, Context context) {
        this.mList = mList;
        this.context = context;
    }

    @Override
    public GroupsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.inflate_frag_main_screen,parent,false);
        return new GroupsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GroupsViewHolder holder, int position) {
        holder.tv_groupName.setText(mList.get(position).getGroupName());
        holder.tv_eventCount.setText("Total Events: " + mList.get(position).getCountOfEvents());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class GroupsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        CircleImageView civ_groupImage;
        TextView tv_groupName, tv_eventCount;

        public GroupsViewHolder(View view) {
            super(view);
            view.setOnClickListener(this);
            civ_groupImage = view.findViewById(R.id.civ_groupImage);
            tv_groupName = view.findViewById(R.id.tv_groupName);
            tv_eventCount = view.findViewById(R.id.tv_eventCount);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, GroupsViewActivity.class);
            context.startActivity(intent);
        }
    }
}
