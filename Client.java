imoprt java.net.*;
imoprt java.io.*;

class Client
{
	public static void main(String A[])
	{
		System.out.println("Client application is runnning ...");
		
		Socket s=new Socket("localhost",2100);
		System.out.println("Client is waiting for the server to accept the request");
		
	}
	
}