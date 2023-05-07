class Maths
{
    public int iNo1;  //Characcteristic
    public int iNo1;   //Characteristic

    public Maths()     //Default constructor
    {
        System.out.println("Inside the Default constructor");
    }
    public Maths (int a ,int b)  //Parameterrised constructor
    {
         System.out.println("Inside the parameterised constructor");
         iNo1=a;
         iNo2=b;
    }
    public int Addition()    //Behaviour
    {
        int iAns=0;
        iAns=iNo1+iNo2;
        return iAns;
    }
    public int Substraction(int i)  //Behavoiur
    {
        int iAns= 0;
        iAns = iNo1-iNo2;
        return iAns;
    }
}//End of MAths class

class Demo
{
   public static void main (String arr[])
   {
         System.out.println("Inside main function");

         Maths mobj1 = new Maths();
         Maths mobj2 = new Maths(10,11);

         int iRet = 0;
         iRet=mobj1.Addition();
         System.out.println("Addtion is :"+iRet);

         iRet=mobj2.Addition();
         System.out.println("Addtion is :"+iRet);
    }
}