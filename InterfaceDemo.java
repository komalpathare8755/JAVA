// Interface is a blueprint which contains ALL abstract in it
//100% abstraction

interface Circle
{
	float PI=3.14f;
	
	float Area (float Radius);
	float Circumference(float Radius);
}
class Marvellous implements Circle
{
	public float Area (float Radius)
	{
		return PI*Radius*Radius;
	}
	public float Circumference(float Radius)
	{
		return 2*PI*Radius;
    }
}
class InterrfaceDemo
{
   public static void main(String Arr[])
   {
	System.out.println("Value of PI is :"+Circle.PI);
	//Circle.PI=7.12f;
	Circle cobj=new Marvellous();
	Ret=cobj.Area(10.5f);
	System.out.println("Area is :"+Ret);
	Ret=cobj.Circumference(10.5f);
	System.out.println(
   }
}