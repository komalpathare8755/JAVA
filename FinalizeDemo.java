
class FinalizeDemo
{
	
	public static void main(String s[])
	{
	   Demo obj =new Demo(4);
        obj=null;	
       System.gc();		
	}
}

class Demo
{
	int Size ;
	int Arr[];
	
	public Demo(int No)
	{
		Size=No;
		Arr=new int[Size];
	}
	
	protected void finalize()
	{
		System.out.println("Inside finalize method");
		Arr=null;
	}
}