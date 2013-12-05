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

public class SelectionSort extends Activity {

	EditText getValue;
	Button submit, sort, ani;
	TextView display, finalValues;
	public CustomKeyboard mCustomKeyboard;
	
	SelectionSort1 ss;
	int [] myList;
	int i;
	int j;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_selection_sort);
		
		getValue = (EditText) findViewById(R.id.edTxt1);
		submit = (Button) findViewById(R.id.btn1);
		sort = (Button) findViewById(R.id.btn2);
		display = (TextView) findViewById(R.id.txt1);
		finalValues = (TextView) findViewById(R.id.txt2);
		ani=(Button)findViewById(R.id.btan);
		
		ss = new SelectionSort1 ();
		myList = new int [5];
		i = 0;
		j = 0;
		
		mCustomKeyboard= new CustomKeyboard(this, R.id.keyboardview, R.xml.number );
        mCustomKeyboard.registerEditText(R.id.edTxt1);
		
        ani.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(getApplicationContext(), SelectionAnimation.class);
				startActivity(in);
			}
		});
        
		submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				display.setText(display.getText().toString()+" "+getValue.getText().toString());
				try 
				{
					if(getValue.getText().toString().equals(""))
					{
						finalValues.setText("Enter some value!!");
					}
					else
					{
						//display.setText("");
						myList [i] = Integer.parseInt(getValue.getText().toString());
						i++;
					}
				} catch (Exception e) {
					finalValues.setText(e.getMessage());
				}
				getValue.setText("");
			}
		});
		
		sort.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(display.getText().toString().equals(""))
				{
					finalValues.setText("No values to Sort");
				}
				else
				{
					finalValues.setText("Sorted values : \n");
					while (!ss.isSorted(myList, i))
					{
						myList = ss.nextIteration(myList,j,i);
						j++;
						if (j == i-1){
							j = 0;
						}
						
						for (int k=0; k<i; k++){
							finalValues.setText(finalValues.getText().toString()+myList[k]+" ");
						}
						finalValues.setText(finalValues.getText().toString()+"\n");
					}
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.selection_sort, menu);
		return true;
	}

}
