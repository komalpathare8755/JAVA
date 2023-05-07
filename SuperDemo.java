/*
class Base
{
	public int A,B;
	public Base(int No1,int No2)
	{
		this.A = No1;
		this.B = No2;
	}
	public void fun()
	{
		System.out.println("Inside Base fun");
		System.out.println("Value of A from fun method is :"+this.A);
	}
}

class Derived extends Base
{
	public int X,Y;
	public Derived (int No1,int No2,int k,int l)
	{
		super(k,l);    //case1
		this.X=No1;
		this.Y=No2;
	}
	public void gun()
	{
       System.out.println("Value of A from gun method is :"+super.A);  //case2
        super.fun();  //case3
	}

}
	
class SuperDemo
{
   public static void main(String a[])
   {
      Derived dobj = new Derived(22,44,55,12);
      dobj.gun();  
  }	   
}
*/


class Base
{
     public int A,B;
     public Base(int No1,int No2)
     {
          this.A = No1;
          this.B = No2;
     }
     public void fun()
     {
          System.out.println("Inside Base fun");
          System.out.println("Value of A from fun method is :"+this.A);
     }
}
class Derived extends Base
{
     public int X,Y;
     public Derived(int i,int j,int k, int l)
     {
          super(k,l);          // 1 usecase       Base(51,101)
          this.X = i;
          this.Y = j;
     }
     public void gun()
     {
          System.out.println("Value of A from gun method is :"+super.A);   // 2 usecase
          super.fun();        // 3 usecase
     }
}
class SuperDemo
{
     public static void main(String a[])
     {
          Derived dobj = new Derived(11,21,51,101);
          dobj.gun();
     }
}