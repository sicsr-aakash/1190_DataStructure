package com.example.datastructure;


public class Queue1 {
	
	public int front = -1, rear = -1;
	public int[] value;
	public int a;
	public Queue1()
	{
		value = new int[5];
	}
	
	public void enqueue(int number)
	{
		if(front==-1 && rear==-1)
		{
			front++;
			rear++;
			value[rear]=number;
		}
		else if(rear<5)
		{
			rear++;
			value[rear]=number;
		}
		else
		{
			print_error("Stack Overflow");
		}
	}
   public int dequeue()
   {
	   if(front==0)
	   	{
		   print_error("stack underflow");
		   a=value[front];
		   front++;
		   return a;
	   	}
	   else 
	   {
		   a= value[front];
		   ++front;
		   return a;
	   }
   }
  public String print_error(String err)
  {
	  return err;
  }

}
