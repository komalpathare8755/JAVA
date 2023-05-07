//Numeric priorty in Java
//Default Priority is "5" 

class ThreadDemo6
{
	public static void main(String A[])throws InterruptedException
	{
		System.out.println("Inside main thread");
	    Demo obj1=new Demo();
        Demo obj2=new Demo();

        Thread t1=new Thread(obj1);
        Thread t2 =new Thread(obj2);

        t1.setName("First");
        t2.setName("Second");
		
		System.out.println("Priority of t1 is :"+t1.getPriority());
 		System.out.println("Priority of t2 is :"+t2.getPriority());

        t1.start();
        t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("End of  main Thread");
	}
	
}

class Demo extends Thread
{
   public void run()
   {
        int i=0;
      try{
		  for(i=1;i<=10;i++)
        {
	       System.out.println(Thread.currentThread().getName()+" :"+i);
		   Thread.sleep(500);
		}

        }
		catch( InterruptedException obj)
		{}
		
		 System.out.println("Priority of main is :"+Thread.currentThread().getPriority());

		}
 
}