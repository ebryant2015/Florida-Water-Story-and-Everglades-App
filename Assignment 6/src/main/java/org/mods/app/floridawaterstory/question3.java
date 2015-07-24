package org.mods.app.floridawaterstory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

/**
 * Created by Erika on 7/15/15.
 */
public class question3 extends Activity implements View.OnClickListener {
    private static final String TAG = "FLWaterStory";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.question3);
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
                CharSequence u = "Correct! Moving on to the next question.";
                Toast uu = Toast.makeText(getApplicationContext(),u,Toast.LENGTH_SHORT);
                uu.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
                uu.show();
                Intent d = new Intent(this, question4.class);
                startActivity(d);
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
