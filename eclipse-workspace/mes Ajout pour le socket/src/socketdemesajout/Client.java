package socketdemesajout;

import java.io.*;
import java.net.*;
public class Client {
	
	private PrintWriter out;
	private BufferedReader in;

	
	public static void main(String[] args) throws IOException     {
		Client client = new Client();
		client.startConnection(6666);
		client.sendMessage("hello client");
	
	}
	//connection 
	
	 public void startConnection(int port) throws UnknownHostException, IOException {
		Socket clientSocket = new  Socket("localhost",port); // verbinden
		 out = new PrintWriter(clientSocket.getOutputStream(), true);
	     in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	 }
	 // enter un message
	 public String sendMessage(String msg) throws IOException {
	        out.println(msg);
	        String resp = in.readLine();
	        return resp;
	    }

}
