package com.exploreca.tourfinder;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by 10081069 on 14/10/2015.
 */
public class SettingsActivity extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Add preferences from resources
        addPreferencesFromResource(R.xml.preferences);
    }
}
