class GenericMethod
{
	public static <T> void Display(T Arr[])
	{
		for (int i=0;i<Arr.length;i++)
		{
			System.out.println(Arr[i]);
		}
	}
	
	public static void main(String Ar[])
	{
		Integer Arr[]={10,20,30,40};
		Display(Arr);
		
		Character cArr[]={'a','s','g','h'};
		Display(cArr);
	}
}