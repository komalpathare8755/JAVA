import java.util.*

class AgeInvalidException extends Exception
{
 AgeInvalidException(String str)
    {
        super(str);
    }	

}

class UserDefined
{
	public static void main(String arg[])
	{
    Scanner sobj=new Scanner(System.in);
    System.out.println("Enter your age:");
int iAge =sobj.nextln();

try
{
  if (iAge<15)
  {
	  throw new AgeInvalidException("Your age is less than 15");
	}
else
{
	System.out.println("Age is valid");
}	

	}
     catch
     {
  System.out.println(obj);
}	
}