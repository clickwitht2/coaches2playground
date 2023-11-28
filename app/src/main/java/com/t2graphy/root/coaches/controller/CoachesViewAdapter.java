package com.t2graphy.root.coaches.controller;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.t2graphy.coaches.R;
import com.t2graphy.root.coaches.activity.CoachesDetailedActivity;
import com.t2graphy.root.coaches.activity.CoachesQueryScreenActivity;
import com.t2graphy.root.coaches.model.CoachesData;
import com.t2graphy.root.coaches.model.CoachesGenericStaticData;

import java.util.Collections;
import java.util.List;

public class CoachesViewAdapter extends RecyclerView.Adapter<CoachesViewHolder> {

    List<CoachesData> coachesDataList = Collections.emptyList();
    private final Context mContext;

    public CoachesViewAdapter(List<CoachesData> list, Context context, View.OnClickListener listener) {
        coachesDataList = list;
        mContext = context;

    }

    @NonNull
    @Override
    public CoachesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.i("CoachesViewAdapter", "OnCreateView");
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View coachView = inflater.inflate(R.layout.item_coaches_card_view_holder, parent, false);
        CoachesViewHolder viewHolder = new CoachesViewHolder(coachView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CoachesViewHolder viewHolder, int position) {

        viewHolder.coachImage.setImageResource(coachesDataList.get(position).coachImage);
        viewHolder.coachName.setText(coachesDataList.get(position).coachName);
        viewHolder.coachSpeciality.setText(coachesDataList.get(position).coachSpeciality);
        viewHolder.fcCoachSpecialityAchievement.setText(coachesDataList.get(position).coachPersonalExperienceDetail);
        viewHolder.fcCoachSpecialityFutureEvents.setText(coachesDataList.get(position).coachTopFiveEvents);

        // set the gif image of specific coach

        if (position % 2 == 0) {
            Glide.with(viewHolder.fcCoachIntroGif).load(R.drawable.coach_hasan).into(viewHolder.fcCoachIntroGif);
        } else {
            Glide.with(viewHolder.fcCoachIntroGif).load(R.drawable.coach_sekhar_gif).into(viewHolder.fcCoachIntroGif);
        }


        // ToDo Look, you have added this but this function got more than one responsibility
        // Better way is to write activity launcher.
        // Why? this will help you to integrate with external party
        final int viewPosition = position;
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, CoachesDetailedActivity.class);
                intent.putExtra("FC_Coach_Image", coachesDataList.get(viewPosition).coachImage);
                intent.putExtra("FC_Coach_Name", coachesDataList.get(viewPosition).coachName);
                intent.putExtra("FC_Coach_Speciality", coachesDataList.get(viewPosition).coachSpeciality);
                intent.putExtra("FC_Coach_Special_Events", coachesDataList.get(viewPosition).coachPersonalExperienceDetail);
                intent.putExtra("FC_Coach_Future_Events", coachesDataList.get(viewPosition).coachTopFiveEvents);
                intent.putExtra("FC_Coach_Video_Link", coachesDataList.get(viewPosition).coachTopFiveEvents);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);
            }
        });


        viewHolder.itemView.findViewById(R.id.fc_coach_book_appointment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, CoachesQueryScreenActivity.class);
                intent.putExtra("FC_Coach_Image", coachesDataList.get(viewPosition).coachImage);
                intent.putExtra("FC_Coach_Name", coachesDataList.get(viewPosition).coachName);
                intent.putExtra("FC_Coach_Speciality", coachesDataList.get(viewPosition).coachSpeciality);
                intent.putExtra("FC_Coach_Special_Events", coachesDataList.get(viewPosition).coachPersonalExperienceDetail);
                intent.putExtra("FC_Coach_Future_Events", coachesDataList.get(viewPosition).coachTopFiveEvents);
                intent.putExtra("FC_Coach_Video_Link", coachesDataList.get(viewPosition).coachTopFiveEvents);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);
            }
        });


        viewHolder.itemView.findViewById(R.id.fc_coach_more_details).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, CoachesDetailedActivity.class);
                intent.putExtra(CoachesGenericStaticData.FC_COACH_IMAGE, coachesDataList.get(viewPosition).coachImage);
                intent.putExtra(CoachesGenericStaticData.FC_COACH_NAME, coachesDataList.get(viewPosition).coachName);
                intent.putExtra(CoachesGenericStaticData.FC_COACH_SPECIALITY, coachesDataList.get(viewPosition).coachSpeciality);
                intent.putExtra(CoachesGenericStaticData.FC_COACH_SPECIAL_EVENTS, coachesDataList.get(viewPosition).coachPersonalExperienceDetail);
                intent.putExtra(CoachesGenericStaticData.FC_COACH_TOP_FIVE_EVENTS, coachesDataList.get(viewPosition).coachTopFiveEvents);
                intent.putExtra("FC_Coach_Video_Link", coachesDataList.get(viewPosition).coachTopFiveEvents);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);
            }
        });


        Log.i("CoachesViewAdapter", "OnBIndVIew...");

    }

    @Override
    public int getItemCount() {
        return coachesDataList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        Log.i("CoachesViewAdapter", "OnAttachedView");
    }


}