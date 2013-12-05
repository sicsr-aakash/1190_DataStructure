package com.example.datastructure;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class QueueAnimation extends Activity {

	public ImageView iv1,iv2,iv3,iv4,iv5;
	Animation anim;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_queue_animation);
		
		iv1=(ImageView) findViewById(R.id.imageView1);
		iv2=(ImageView) findViewById(R.id.imageView2);
		iv3=(ImageView) findViewById(R.id.imageView3);
		iv4=(ImageView) findViewById(R.id.imageView4);
		iv5=(ImageView) findViewById(R.id.imageView5);
		
		anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.qmove1);
		anim.setStartOffset(500);
		iv1.startAnimation(anim);
		
		anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.qmove2);
		anim.setStartOffset(1500);
		iv2.startAnimation(anim);
		
		anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.qmove3);
		anim.setStartOffset(1500);
		iv3.startAnimation(anim);
		
		anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.qmove4);
		anim.setStartOffset(3000);
		iv4.startAnimation(anim);
		
		anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.qmove5);
		anim.setStartOffset(3000);
		iv5.startAnimation(anim);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.queue_animation, menu);
		return true;
	}

}
