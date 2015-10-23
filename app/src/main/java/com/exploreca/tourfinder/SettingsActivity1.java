package com.exploreca.tourfinder;

import android.os.Bundle;

/**
 * Created by 10081069 on 22/10/2015.
 */
public class SettingsActivity1 extends SettingsActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Use Fragment API for future versions of Android !
        addPreferencesFromResource(R.xml.settings);
    }
}
