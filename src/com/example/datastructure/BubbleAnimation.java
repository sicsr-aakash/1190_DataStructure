package com.example.datastructure;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class BubbleAnimation extends Activity {

	public TextView t1,t2,t3,t4,t5;
	public Animation anim;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bubble_animation);
		
		t1=(TextView) findViewById(R.id.tv1);
		t2=(TextView) findViewById(R.id.tv2);
		t3=(TextView) findViewById(R.id.tv3);
		t4=(TextView) findViewById(R.id.tv4);
		t5=(TextView) findViewById(R.id.tv5);
		
		anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bbmove1);
		anim.setStartOffset(1000);
		t2.startAnimation(anim);
		
		anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bbmove2);
		anim.setStartOffset(1000);
		t3.startAnimation(anim);
		
		anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bbmove3);
		anim.setStartOffset(3000);
		t4.startAnimation(anim);
		
		anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bbmove4);
		anim.setStartOffset(4000);
		t5.startAnimation(anim);
		
		anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bbmove5);
		anim.setStartOffset(5000);
		t1.startAnimation(anim);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bubble_animation, menu);
		return true;
	}

}
