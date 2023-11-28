package com.t2graphy.root.coaches.controller;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;
import com.t2graphy.coaches.R;


public class CoachesViewHolder extends RecyclerView.ViewHolder {
    ShapeableImageView coachImage;
    TextView coachName;
    TextView coachSpeciality;
    TextView greetingMessageFromCoach;
    TextView fcCoachSpecialityAchievement;
    TextView fcCoachSpecialityFutureEvents;
    ImageView fcCoachIntroGif;

    public CoachesViewHolder(@NonNull View itemView) {
        super(itemView);
        coachImage = itemView.findViewById(R.id.fc_coach_picture_circular);
        coachName = itemView.findViewById(R.id.fc_coach_name);
        coachSpeciality = itemView.findViewById(R.id.fc_coach_speciality);
        greetingMessageFromCoach = itemView.findViewById(R.id.message_from_coach_to_students);
        fcCoachSpecialityAchievement = itemView.findViewById(R.id.fc_coach_speciality_achievement);
        fcCoachSpecialityFutureEvents = itemView.findViewById(R.id.fc_coach_speciality_future_events);
        fcCoachIntroGif = itemView.findViewById(R.id.fc_coach_intro_gif);

    }
}