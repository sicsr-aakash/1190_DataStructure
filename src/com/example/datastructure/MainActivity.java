package com.example.datastructure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

	public Button start;
	public TextView tv;
	public ImageView iv;
	
	Animation anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = (Button) findViewById(R.id.button1);
        tv = (TextView) findViewById(R.id.textView1);
        iv = (ImageView) findViewById(R.id.imageView1);
        
        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        tv.startAnimation(anim);
        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.together);
        iv.startAnimation(anim);
        
        start.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(getApplicationContext(), MenuActivity.class);
				startActivity(in);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
