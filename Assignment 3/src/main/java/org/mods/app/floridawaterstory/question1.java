package org.mods.app.floridawaterstory;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.Toast;
/**
 * Created by Erika on 7/15/15.
 */
public class question1 extends Activity implements View.OnClickListener {
    private static final String TAG = "FLWaterStory";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);
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
                CharSequence text = "Incorrect! Try again";
                Toast t = Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT);
                t.setGravity(Gravity.TOP | Gravity.CENTER, 0,0);
                t.show();

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
                CharSequence w = "Correct! Moving on to the next question.";
                Toast ww = Toast.makeText(getApplicationContext(),w,Toast.LENGTH_SHORT);
                ww.setGravity(Gravity.TOP | Gravity.CENTER, 0,0);
                ww.show();
                Intent d = new Intent(this, question2.class);
                        startActivity(d);
                Log.d(TAG, "clicked on answerd");
                break;
        }
    }
}
