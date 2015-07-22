/***
 * Excerpted from "Hello, Android",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/eband3 for more book information.
***/
package org.mods.app.floridawaterstory;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.app.ActionBar;
import android.graphics.Typeface;

public class FLWaterStory extends Activity implements OnClickListener {
   private static final String TAG = "FLWaterStory";

   /** Called when the activity is first created. */
   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.main);
      // Set up click listeners for all the buttons
      View continueButton = findViewById(R.id.map);
      continueButton.setOnClickListener(this);
      View newButton = findViewById(R.id.information);
      newButton.setOnClickListener(this);
      View aboutButton = findViewById(R.id.games);
      aboutButton.setOnClickListener(this);
      View thanksButton = findViewById(R.id.thanks);
      thanksButton.setOnClickListener(this);
       Typeface type = Typeface.createFromAsset(getAssets(),"fonts/Ribambelle.ttf");
   }

   // ...
   
   public void onClick(View v) {
      switch (v.getId()) {
      case R.id.information:
         Intent i = new Intent(this, Information.class);
         startActivity(i);
          Log.d(TAG, "clicked on information button");
         break;
      // More buttons go here (if any) ...
      case R.id.games:
         openNewGameDialog();
          Log.d(TAG, "clicked on games button");
         break;
      case R.id.map:
         Intent u = new Intent(this, Map.class);
         startActivity(u);
          Log.d(TAG, "clicked on map button");
         break;
      case R.id.thanks:
         Uri uri = Uri.parse("http://www.mods.org/home.html");
         Intent d = new Intent(Intent.ACTION_VIEW, uri);
         startActivity(d);
         Log.d(TAG, "clicked on thanks button");
         break;
      }
   }
   
   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      super.onCreateOptionsMenu(menu);
      MenuInflater inflater = getMenuInflater();
      inflater.inflate(R.menu.menu, menu);
      return true;
   }

   @Override
   public boolean onOptionsItemSelected(MenuItem item) {
      switch (item.getItemId()) {
      case R.id.settings:
         startActivity(new Intent(this, Prefs.class));
         return true;
      // More items go here (if any) ...
      }
      return false;
   }

   /** Ask the user what difficulty level they want */
   private void openNewGameDialog() {
      new AlertDialog.Builder(this)
           .setTitle(R.string.new_game_title)
           .setItems(R.array.difficulty,
            new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialoginterface,
                     int i) {
                  startGame(i);
               }
            })
           .show();
   }
   
   /** Start a new game with the given difficulty level */
   private void startGame(int i) {
      Log.d(TAG, "clicked on game");
      // Start game here...
      switch(i){
         case 0:
            Intent trivia = new Intent(this, question1.class);
            startActivity(trivia);
             Log.d(TAG, "clicked on trivia");
             break;
      }


   }
}
