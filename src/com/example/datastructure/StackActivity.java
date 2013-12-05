package com.example.datastructure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StackActivity extends Activity {

	Animation anim1;
	int stack_position = 0;
    int [] value = new int[5]; // Created a stack of size 5
    TextView display, operation;
    Button push,pop, stkanim;
    EditText getValue;
    public CustomKeyboard mCustomKeyboard;
     
    // Push method is used to add the value to our stack and places it at the top  
    public void push(int number)
    {
        value[stack_position] = number;
        operation.setText("Operation: Successfully Added New Value");
        stack_position++;
    }
     
    // Pop method is used to remove the last value entered in the stack
    public void pop()
    {
        stack_position--;
        operation.setText("Operation: Successfully Poped Out: " + value[stack_position]);
        value[stack_position] = 0; 
    }
     
    // Print_stack method is used to print the entire stack
    public void print_stack()
    {
    	/*anim1=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.ex);
    	anim1.setStartOffset(1000);
		display.startAnimation(anim1);*/
        String temp = "Stack";
        for(int i = stack_position-1;i >= 0 ; i--)
        {
            temp = temp + "\n" + value[i];
        }
        display.setText(temp);
    }
     
    // Displays error or success message
    public void print_error(String err)
    {      
        operation.setText("Operation: " + err);
    }
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stack);
		
		display = (TextView) findViewById(R.id.txt1);
        push = (Button) findViewById(R.id.btnPush);
        pop = (Button) findViewById(R.id.btnPop);
        getValue = (EditText) findViewById(R.id.ed1);
        operation = (TextView) findViewById(R.id.txt2);
        stkanim = (Button) findViewById(R.id.button1);
        
        mCustomKeyboard= new CustomKeyboard(this, R.id.keyboardview, R.xml.number );
        mCustomKeyboard.registerEditText(R.id.ed1);
        
        stkanim.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), StackAnimation.class);
				startActivity(i);
			}
		});
        
     // Handling the User Clicking Events
        push.setOnClickListener(new View.OnClickListener() {
             
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(!getValue.getText().toString().equals(""))
                {
                    if(stack_position < 5)
                    {
                        push(Integer.parseInt(getValue.getText().toString()));                     
                        print_stack();
                    }  
                    else
                    {
                         print_error("Stack is full");
                    }  
                    getValue.setText("");
                }
                else
                {
                    print_error("Enter some value in Text Field");
                }
            }
        });
         
        pop.setOnClickListener(new View.OnClickListener() {
             
            public void onClick(View v) {
                // TODO Auto-generated method stub
                 
                    if(stack_position > 0)
                    {
                        pop();                 
                        print_stack();                 
                    }  
                    else
                    {
                        print_error("Stack is Empty");
                    }                  
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.stack, menu);
		return true;
	}

}
