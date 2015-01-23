package com.example.test2seekbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
 
public class MainActivity extends Activity {
 
    private static final int SHOW_PREFERENCE = 1;  
     
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(getApplicationContext(), PrefActivity.class);
        startActivity(i);       
        int col1 = PrefActivity.getCol1(getApplicationContext());
        
		String msgtext ="COLOR value["+ col1 +"] to["+ col1 +"]";
		Log.d("TAGG", "msgtext: " + msgtext);
		Toast.makeText(getBaseContext(), msgtext, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
 

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        int id = item.getItemId();
 
        if (id == R.id.setting) {
 
            Intent i = new Intent(getApplicationContext(), PrefActivity.class);
            startActivityForResult(i,SHOW_PREFERENCE);
        }
 
        return true;
    }
    
    /* PrefActivity*/
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == SHOW_PREFERENCE) {
 
            int col1 = PrefActivity.getCol1(getApplicationContext());
         
        }
    }
}

