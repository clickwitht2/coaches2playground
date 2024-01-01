package com.t2graphy.root.coaches.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.imageview.ShapeableImageView;
import com.t2graphy.coaches.R;
import com.t2graphy.root.coaches.model.CoachesGenericStaticData;

import java.util.Objects;

public class CoachesDetailedActivity extends AppCompatActivity {

    public static String TAG = "CoachesDetailedActivity";
    ShapeableImageView coachImageView;
    TextView coachNameView;
    TextView coachSpecialityView;
    TextView fcCoachSpecialityAchievementView;
    TextView fcCoachTopFiveEventsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_coaches_detailed);
        coachImageView = (ShapeableImageView) findViewById(R.id.fc_coach_picture_circular);
        coachNameView = (TextView) findViewById(R.id.fc_coach_name);
        coachSpecialityView = findViewById(R.id.fc_coach_speciality);
        fcCoachTopFiveEventsView = findViewById(R.id.fc_coach_speciality_future_events);
        fcCoachSpecialityAchievementView = findViewById(R.id.fc_coach_speciality_achievement);

        /*  This is being used to customized toolbar of Android
        // ToDo Better way : make your own bar. action bar and navigation bar.
        // They will use basic elements and basic actions.
        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getTitle());
        */

        fillCoachesDetailsIfPresent();


    }


    private void fillCoachesDetailsIfPresent() {
        String coachName;
        Integer coachImageResourcePath;
        String coachSpeciality;
        String coachPersonalExperienceDetail;
        String coachTopFiveEvents;
        String coachDetailsPageVideoPath;

        Bundle extras = getIntent().getExtras();
        if (Objects.nonNull(extras)) {
            coachName = extras.getString(CoachesGenericStaticData.FC_COACH_NAME, "Malkeet Brawler");
            coachImageResourcePath = extras.getInt(CoachesGenericStaticData.FC_COACH_IMAGE);
            coachSpeciality = extras.getString(CoachesGenericStaticData.FC_COACH_SPECIALITY);
            coachTopFiveEvents = extras.getString(CoachesGenericStaticData.FC_COACH_TOP_FIVE_EVENTS);
            coachPersonalExperienceDetail = extras.getString(CoachesGenericStaticData.FC_COACH_SPECIAL_EVENTS);
            coachDetailsPageVideoPath = extras.getString(CoachesGenericStaticData.FC_COACH_NAME);
            Log.d(TAG,"coachName "+coachName + " coachImagePath "+coachImageResourcePath);
            coachNameView.setText(coachName);
            coachSpecialityView.setText(coachSpeciality);
            fcCoachTopFiveEventsView.setText(coachTopFiveEvents);
            fcCoachSpecialityAchievementView.setText(coachPersonalExperienceDetail);
            coachImageView.setImageResource(coachImageResourcePath);
        }
    }
}