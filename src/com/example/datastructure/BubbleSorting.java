package com.example.datastructure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BubbleSorting extends Activity {

	EditText getValue;
	TextView display, insSort;
	Button submit, btnSort, ani;
	BubbleSort1 bs;
	int [] myList;
	int i;
	int j;
	public CustomKeyboard mCustomKeyboard;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bubble_sort);
		
		getValue = (EditText) findViewById(R.id.edTxt1);
		display = (TextView) findViewById(R.id.txtDisplay);
		insSort = (TextView) findViewById(R.id.txtSort);
		submit = (Button) findViewById(R.id.btnSubmit1);
		btnSort = (Button) findViewById(R.id.btnSort1);
		ani = (Button) findViewById(R.id.btan);
		
		bs = new BubbleSort1 ();
		myList = new int [5];
		i = 0;
		j = 0;
		
		mCustomKeyboard= new CustomKeyboard(this, R.id.keyboardview, R.xml.number );
        mCustomKeyboard.registerEditText(R.id.edTxt1);
		
        ani.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(getApplicationContext(), BubbleAnimation.class);
				startActivity(in);
			}
		});
        
		submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				display.setText(display.getText().toString()+" "+getValue.getText().toString());				
				try {
					if(getValue.getText().toString().equals(""))
					{
						insSort.setText("Enter some value!!");
					}
					else
					{
						myList [i] = Integer.parseInt(getValue.getText().toString());
						i++;
					}
				} catch (Exception e) {
					insSort.setText(e.getMessage());
				}
				getValue.setText("");
			}
		});
		
		btnSort.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				insSort.setText("Bubble Sort: \n");
				if(display.getText().toString().equals(""))
				{
					insSort.setText("No values to sort");
				}
				else
				{
					while (!bs.isSorted(myList, i))
					{
						myList = bs.nextIteration(myList,j);
						j++;
						if (j == i-1)
						{
							j = 0;
						}
						for (int k=0; k<i; k++)
						{
							insSort.setText(insSort.getText().toString()+myList[k]+" ");
						}
						insSort.setText(insSort.getText().toString()+"\n");
					}
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.insertion_sort, menu);
		return true;
	}

}
