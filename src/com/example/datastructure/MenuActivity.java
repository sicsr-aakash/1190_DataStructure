package com.example.datastructure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MenuActivity extends Activity {

	Button stack, queue, selSort, bubSort;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		stack = (Button) findViewById(R.id.btnStack);
		queue = (Button) findViewById(R.id.btnQueue);
		selSort = (Button) findViewById(R.id.btnSelSort);
		bubSort = (Button) findViewById(R.id.btnBubSort);
		
		stack.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in = new Intent(getApplicationContext(), StackActivity.class);
				startActivity(in);
			}
		});
		
		queue.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in = new Intent(getApplicationContext(), QueueActivity.class);
				startActivity(in);
			}
		});
		
		selSort.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent in = new Intent(getApplicationContext(), SelectionSort.class);
			startActivity(in);
			}
		});
		
		bubSort.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(getApplicationContext(), BubbleSorting.class);
				startActivity(in);
			}
		});
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

}
