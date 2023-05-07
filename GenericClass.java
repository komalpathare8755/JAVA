class Demo <T>
{
	public T no1;
	public T no2;
	
	public Demo (T a,T b)
	{
		no2=a;
		no1=b;
	}
	
	public void Dispaly()
	{
		System.out.println(no1);
		System.out.println(no2);
	}
}

class GenericClass
{
	public static void main(String Arr[])
	{
		Demo <Integer> iobj=new <Integer>(11,21);
		iobj.Dispaly();
	}
}