package com.t2graphy.root.clubs;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;
import com.t2graphy.coaches.R;

public class ClubsViewHolder extends RecyclerView.ViewHolder {
    ShapeableImageView clubsImage;
    TextView clubsName;
    TextView clubHeadCoaches;
    TextView totalStudentTrained;
    TextView activeStudentsAtClub;
    TextView clubFacility;
    ImageView clubsIntroGIFPath;

    public ClubsViewHolder(@NonNull View itemView) {
        super(itemView);
        clubsImage = itemView.findViewById(R.id.fc_clubs_picture_circular);
        clubsName = itemView.findViewById(R.id.fc_clubs_name);
        clubHeadCoaches = itemView.findViewById(R.id.fc_clubs_speciality);
        totalStudentTrained = itemView.findViewById(R.id.message_from_clubs_to_students);
        activeStudentsAtClub = itemView.findViewById(R.id.fc_clubs_speciality_achievement);
        clubFacility = itemView.findViewById(R.id.fc_clubs_speciality_future_events);
        clubsIntroGIFPath = itemView.findViewById(R.id.fc_clubs_intro_gif);

    }
}