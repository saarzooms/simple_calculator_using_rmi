import java.rmi.*;
import java.rmi.registry.*;
public class MyServer{
	public static void main(String args[]){
		try{
			Adder stub=new AdderRemote();
			Naming.rebind("rmi://172.16.2.59:5555/rku",stub);
			System.out.println("Server started");
		}catch(Exception e){System.out.println(e);}
	}
}
