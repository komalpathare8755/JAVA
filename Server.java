import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;


class CHATTING_APPFrame
{
    public CHATTING_APPFrame(String title)
    {
        Frame fobj = new Frame(title);
        fobj.setSize(500,500);
        fobj.setVisible(true);

        Button bobj =new Button("Send");
		fobj.add(bobj);
        fobj.addWindowListener(new CHATTING_APP());
    }
}

class CHATTING_APP extends WindowAdapter
{
    
    public void windowClosing(WindowEvent obj)
	{
		System.exit(0);
	}
}



public class Server
{
    public static void main(String A[]) throws Exception
    {
        CHATTING_APPFrame cobj=new CHATTING_APPFrame("😘CHATTING_APP😘");
		System.out.println("Server application is running...");

        ServerSocket ss = new ServerSocket(2100);
        System.out.println("Server is running at port no 2100 and waiting for client request");

        Socket s = ss.accept();
        System.out.println("Request of client gets accepted");

        PrintStream ps = new PrintStream(s.getOutputStream());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        
        String str1;
        String	str2;

        while((str1 = br1.readLine()) != null)
        {
            ps.println(str2);
            System.out.println("Client says : "+str1);
            str2 = br2.readLine();
            System.out.print("Enter message for client : ");
        }
    }
}