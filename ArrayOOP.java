
import java.util.Scanner;


class ArrayX
{
	public int Arr[];
	public int iSize;
	
	public ArrayX(int No)
	{
		this.iSize =No;
		this.Arr=new int[iSize];
	}
	
	public void Accept()
	{
		system.out.println("Enter the elements:");
		for (int iCnt=0;iCnt<iSize;iCnt++)
		{
        arr[iCnt]=sobj.nextInt();
		}
		
	}
	public void Display()
	{
		system.out.println("Enter the elements:");
		for (int iCnt=0;iCnt<iSize;iCnt++)
		{
           arr[iCnt]=sobj.nextInt();
		}
	}
	public int Addition()
	{
		int iSum=0;
		for (int iCnt=0;iCnt<iSize;iCnt++)
		{
             iSum=iSum+Arr[iCnt];
		}
		return iSum;
	}
	
}
class ArrayOOP
{
    public static  void main(String arg[])
	{
		ArrayX obj1=new ArrayX(5);
		obj1.accept();
		obj1.Display();
		
		int iRet=obj1.Addition();
		System.out.println("Addition is :"+iRet);
		}	
}


