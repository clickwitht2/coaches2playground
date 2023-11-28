package com.t2graphy.root.coaches.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.t2graphy.coaches.R;
import com.t2graphy.coaches.databinding.ActivityCoachesDetailedBinding;

public class CoachesDetailedActivity extends AppCompatActivity {

    private ActivityCoachesDetailedBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_coaches_detailed);

        /*  This is being used to customized toolbar of Android
        // ToDo Better way : make your own bar. action bar and navigation bar.
        // They will use basic elements and basic actions.
        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getTitle());
        */





    }
}