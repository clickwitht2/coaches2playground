package com.t2graphy.root.coaches.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.t2graphy.coaches.R;
import com.t2graphy.root.coaches.model.CoachesGenericStaticData;

import java.util.Objects;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class CoachesQueryScreenActivity extends AppCompatActivity {

    public static String TAG = "CoachesQueryScreenActivity";
    TextView coachNameView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coaches_query_screen);
        coachNameView = findViewById(R.id.fullscreen_content_coach_name);

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
            coachNameView.setText("Coach : "+coachName);

        }
    }
}