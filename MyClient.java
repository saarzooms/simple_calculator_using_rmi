import java.rmi.*;
public class MyClient{
	public static void main(String args[]){
		try{
			Adder stub=(Adder)Naming.lookup("rmi://172.16.2.59:5555/rku");
			System.out.println(stub.add(34,4));
			System.out.println(stub.sub(34,4));
			System.out.println(stub.mul(34,4));
			System.out.println(stub.div(34,4));
		}catch(Exception e){}
	}
}