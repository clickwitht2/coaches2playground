package com.t2graphy.root.clubs;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.t2graphy.coaches.R;

import java.util.Collections;
import java.util.List;

public class ClubsViewAdapter extends RecyclerView.Adapter<ClubsViewHolder> {
    public static String TAG = "clubsViewAdapter";

    List<ClubsData> clubsDataList = Collections.emptyList();
    private final Context mContext;

    public ClubsViewAdapter(List<ClubsData> list, Context context, View.OnClickListener listener) {
        clubsDataList = list;
        mContext = context;

    }

    @NonNull
    @Override
    public ClubsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.i(TAG, "OnCreateView");
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View clubsView = inflater.inflate(R.layout.item_clubs_card_view_holder, parent, false);
        ClubsViewHolder viewHolder = new ClubsViewHolder(clubsView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ClubsViewHolder viewHolder, int position) {

        viewHolder.clubsImage.setImageResource(clubsDataList.get(position).clubsImage);
        viewHolder.clubsName.setText(clubsDataList.get(position).clubsName);
        viewHolder.clubHeadCoaches.setText(clubsDataList.get(position).clubHeadCoaches);
        viewHolder.totalStudentTrained.setText(clubsDataList.get(position).totalStudentTrained);
        viewHolder.activeStudentsAtClub.setText(clubsDataList.get(position).activeStudentsAtClub);
        viewHolder.clubFacility.setText(clubsDataList.get(position).clubFacility);

        // set the gif image of specific clubs

        if (position % 2 == 0) {
            Glide.with(viewHolder.clubsIntroGIFPath).load(R.drawable.coach_hasan).into(viewHolder.clubsIntroGIFPath);
        } else {
            Glide.with(viewHolder.clubsIntroGIFPath).load(R.drawable.coach_sekhar_gif).into(viewHolder.clubsIntroGIFPath);
        }


        Log.i("", "OnBIndVIew...");

    }

    @Override
    public int getItemCount() {
        return clubsDataList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        Log.i(TAG, "OnAttachedView");
    }
}