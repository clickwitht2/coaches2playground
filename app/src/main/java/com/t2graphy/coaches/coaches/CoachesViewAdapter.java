package com.t2graphy.coaches.coaches;

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