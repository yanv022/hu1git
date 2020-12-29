package socketdemesajout;

import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[] args) throws IOException     {
	
		 Server server=new Server();
	        server.start(6667);
		
	}



	private BufferedReader in;
	private PrintWriter out ;
	private ServerSocket serverSocket;
    private Socket clientSocket;
	
	
	
	
	public  void  start(int port) throws IOException {
		ServerSocket serverSocket = new  ServerSocket(port);
		Socket clientSocket = serverSocket.accept();
		System.out.println("client connected");
		
		//lire le message
		
		
		out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String greeting = in.readLine();
        if ("hello server".equals(greeting)) {
            out.println("hello client");
        }
        else {
            out.println("unrecognised greeting");
        }
		}

}
