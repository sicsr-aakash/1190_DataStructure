package com.example.datastructure;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class StackAnimation extends Activity {

	public ImageView iv1,iv2,iv3,iv4,iv5;
	Animation anim;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stack_animation);
		
		iv1=(ImageView) findViewById(R.id.imageView1);
		anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
		anim.setStartOffset(500);
		iv1.startAnimation(anim);
		Toast.makeText(getApplicationContext(), "Value Pushed In!!", Toast.LENGTH_SHORT).show();
		
		iv2=(ImageView) findViewById(R.id.imageView2);
		anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move1);
		anim.setStartOffset(1500);
		iv2.startAnimation(anim);
		Toast.makeText(getApplicationContext(), "Value Pushed In!!", Toast.LENGTH_SHORT).show();
		
		iv3=(ImageView) findViewById(R.id.imageView3);
		anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move2);
		anim.setStartOffset(4000);
		iv3.startAnimation(anim);
		Toast.makeText(getApplicationContext(), "Value Pushed In!!", Toast.LENGTH_SHORT).show();
		Toast.makeText(getApplicationContext(), "Value Popped Out!!", Toast.LENGTH_SHORT).show();
		
		iv4=(ImageView) findViewById(R.id.imageView4);
		anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move3);
		anim.setStartOffset(7300);
		iv4.startAnimation(anim);
		Toast.makeText(getApplicationContext(), "Value Pushed In!!", Toast.LENGTH_SHORT).show();
		
		iv5=(ImageView) findViewById(R.id.imageView5);
		anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move4);
		anim.setStartOffset(9800);
		iv5.startAnimation(anim);
		Toast.makeText(getApplicationContext(), "Value Pushed In!!", Toast.LENGTH_SHORT).show();
		Toast.makeText(getApplicationContext(), "Value Popped Out!!", Toast.LENGTH_SHORT).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.stack_animation, menu);
		return true;
	}

}
