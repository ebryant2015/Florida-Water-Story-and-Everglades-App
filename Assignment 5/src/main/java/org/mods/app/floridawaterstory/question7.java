package org.mods.app.floridawaterstory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Erika on 7/15/15.
 */
public class question7 extends Activity implements View.OnClickListener{
    private static final String TAG = "FLWaterStory";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question7);
        View manBut = findViewById(R.id.answera);
        manBut.setOnClickListener(this);
        View surfBut = findViewById(R.id.answerb);
        surfBut.setOnClickListener(this);
        View subBut = findViewById(R.id.answerc);
        subBut.setOnClickListener(this);
        View hydBut = findViewById(R.id.answerd);
        hydBut.setOnClickListener(this);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.answera:
                CharSequence text = "Correct! Going back to the main page.";
                Toast t = Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT);
                t.setGravity(Gravity.TOP | Gravity.CENTER, 0,0);
                t.show();
                Intent d = new Intent(this, FLWaterStory.class);
                startActivity(d);
                Log.d(TAG, "clicked on answera");
                break;
            case R.id.answerb:
                CharSequence i = "Incorrect! Try again";
                Toast ii = Toast.makeText(getApplicationContext(),i,Toast.LENGTH_SHORT);
                ii.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
                ii.show();
                Log.d(TAG, "clicked on answerb");
                break;
            case R.id.answerc:
                CharSequence u = "Incorrect! Try again";
                Toast uu = Toast.makeText(getApplicationContext(),u,Toast.LENGTH_SHORT);
                uu.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
                uu.show();
                Log.d(TAG, "clicked on answerc");
                break;
            case R.id.answerd:
                CharSequence w = "Incorrect! Try again";
                Toast ww = Toast.makeText(getApplicationContext(),w,Toast.LENGTH_SHORT);
                ww.setGravity(Gravity.TOP | Gravity.CENTER, 0,0);
                ww.show();
                Log.d(TAG, "clicked on answerd");
                break;
        }
    }

}
