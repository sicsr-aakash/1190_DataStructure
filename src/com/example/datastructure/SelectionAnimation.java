package com.example.datastructure;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SelectionAnimation extends Activity {

	public TextView t1,t2,t3,t4,t5,t6;
	public Animation anim;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_selection_animation);
		
		t1=(TextView) findViewById(R.id.tv1);
		t3=(TextView) findViewById(R.id.tv3);
		t4=(TextView) findViewById(R.id.tv4);
		t5=(TextView) findViewById(R.id.tv5);
		t6=(TextView) findViewById(R.id.tv6);
		
		anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.semove1);
		anim.setStartOffset(3000);
		t1.startAnimation(anim);
		
		anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.semove2);
		anim.setStartOffset(7000);
		t3.startAnimation(anim);
		
		anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.semove3);
		anim.setStartOffset(11000);
		t4.startAnimation(anim);
		
		anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.semove4);
		anim.setStartOffset(15000);
		t5.startAnimation(anim);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.selection_animation, menu);
		return true;
	}

}
