package com.example.ratingbar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity 
{
	//Define the rating bar
	RatingBar rb;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 rb= (RatingBar)findViewById(R.id.ratingBar1);

		//Set the listener and create object for rating bar
		rb.setOnRatingBarChangeListener(new OnRatingBarChangeListener()
		{
		@Override
		public void onRatingChanged(RatingBar arg0, float rating, boolean arg2)
		//public abstract void onRatingChanged (RatingBar ratingBar, float rating, boolean fromUser)
		/**
		ratingBar	The RatingBar whose rating has changed.
		rating	The current rating. This will be in the range 0..numStars.
		fromUser	True if the rating change was initiated by a user's touch gesture or arrow key/horizontal trackbell movement.
		**/
		{
		// TODO Auto-generated method stub

		// Set the toast message for the rating bar
		Toast.makeText(getBaseContext(), " Your  Rating : "+ rating ,Toast.LENGTH_SHORT).show();
		}
		});
	}


}
