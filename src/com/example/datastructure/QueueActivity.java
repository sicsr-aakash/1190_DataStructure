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

public class QueueActivity extends Activity {

	TextView display, operation;
	Button enq, deq, ani;
	EditText getValue;
	public CustomKeyboard mCustomKeyboard;
	
	Queue1 q = new Queue1();
	int f=q.front;
	int r=q.rear;
	//String error1;
	
	public void print_value(String queueOpe)
	{
		String temp="Queue";
		//Log.i("value", "" + f);
		if(queueOpe.equals("Dequeue")){
			f=f+1;
		}
		for(int i=f;i<=r;i++)
		{
			temp = temp + "\n" + q.value[i];
		}
		
		display.setText(temp);
			
	}
	
	private void updateFrontAndRearValues(){
		f = q.front;
		r = q.rear;
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_queue);
		
		display = (TextView) findViewById(R.id.display);
		operation = (TextView) findViewById(R.id.operation);
		enq = (Button) findViewById(R.id.enq);
		deq = (Button) findViewById(R.id.deq);
		getValue = (EditText) findViewById(R.id.ed1);
		ani = (Button) findViewById(R.id.btan);
		
		mCustomKeyboard= new CustomKeyboard(this, R.id.keyboardview, R.xml.number );
        mCustomKeyboard.registerEditText(R.id.ed1);
		
        
        ani.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(getApplicationContext(), QueueAnimation.class);
				startActivity(in);
			}
		});
		enq.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				if(!getValue.getText().toString().equals(""))
                {      
					q.enqueue(Integer.parseInt(getValue.getText().toString()));
					updateFrontAndRearValues();
					if(r<5)
					{
	                    print_value("Enqueue");
	                    operation.setText("Operation: Successfully Added New Value");
					}
					else
					{
						operation.setText("Queue is Full");
						//operation.setText(error1);
					}
					getValue.setText("");
                }
                else
                {
                    operation.setText("Enter some value in Text Field");
                    //operation.setText("Operation :" +error1);
                }
            }	
		});
		
		deq.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				updateFrontAndRearValues();
				//if(!display.getText().toString().equals(""))
				//{
					if(r<5)
					{
						//q.dequeue();
						operation.setText("Value deleted" +q.dequeue());
						print_value("Dequeue");
					}
					else
					{
						operation.setText("Queue is empty");
					}
					
				/*}
				else
				{
					operation.setText("Enter some value in the Queue first");
				}*/
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.queue, menu);
		return true;
	}

}
