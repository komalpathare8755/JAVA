import java.util.*;

class Collections3
{
    public static void main(String arg[])
    {
        LinkedList <Book>lobj= new LinkedList<Book>();

       Book boj1=new Book("Let us C",400);
	   Book boj2=new Book("Data Strctures",580);
	   Book boj3=new Book("C++ Programming",980);
	   Book boj4=new Book("Angular web development",790);
	   
        lobj.add(boj1);
        lobj.add(boj2);
        lobj.add(boj3);
        lobj.add(boj4);

        Iterator iobj = lobj.iterator();
        Book bref = null;

        System.out.println("Elements of linked list are : ");
        while(iobj.hasNext())
        {
            bref = (Book)iobj.next();
            bref.Display();
        }

        lobj.clear();
    }
}

class Book
{
    public String Name;
    public int Price;

    public Book(String s, int i)
    {
        this.Name = s;
        this.Price = i;
    }

    public void Display()
    {
        System.out.println("Book name : "+this.Name+" Price : "+this.Price);
    }
}

