package com.example.test2seekbar;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
 
public class PrefActivity extends PreferenceActivity {
 
    private static final String KEY_COL1 = "col1";
    private static final int DEF_COL1 = Color.rgb(0, 0, 0);
    RgbDialogPreference col1;
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        addPreferencesFromResource(R.xml.pref);
 
        col1 = (RgbDialogPreference)findPreference(KEY_COL1);
        col1.setDefault(DEF_COL1);
    }
 
    public static int getCol1(Context con) {
        return PreferenceManager.getDefaultSharedPreferences(con).getInt(
                KEY_COL1, DEF_COL1);
    }
}