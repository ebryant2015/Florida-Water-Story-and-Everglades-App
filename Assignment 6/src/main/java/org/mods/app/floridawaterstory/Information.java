package org.mods.app.floridawaterstory;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.app.ActionBar;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by brycecaro on 7/10/15.
 */
public class Information extends Activity implements OnClickListener {
    private static final String TAG = "FLWaterStory";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.information);
        View manBut = findViewById(R.id.mmw);
        manBut.setOnClickListener(this);
        View surfBut = findViewById(R.id.ssf);
        surfBut.setOnClickListener(this);
        View subBut = findViewById(R.id.sa);
        subBut.setOnClickListener(this);
        View hydBut = findViewById(R.id.hc);
        hydBut.setOnClickListener(this);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mmw:
                Intent ii = new Intent(this, MMW.class);
                startActivity(ii);
                Log.d(TAG, "clicked on Man's Manipulation of Water button");
                break;
            case R.id.ssf:
                Intent i = new Intent(this,SSF.class);
                startActivity(i);
                Log.d(TAG, "clicked on Surface Sheet Flow button");
                break;
            case R.id.sa:
                Intent iii = new Intent(this,SA.class);
                startActivity(iii);
                Log.d(TAG, "clicked on Subterranean Aquifer button");
                break;
            case R.id.hc:
                Intent iv = new Intent(this,HC.class);
                startActivity(iv);
                Log.d(TAG, "clicked on Hydrologic Cycle button");
                break;
        }
    }
}
