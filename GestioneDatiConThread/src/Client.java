import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client{
	
	Socket so; 
	BufferedReader tastiera;
	BufferedReader br;
	BufferedWriter bw; 
	
	DataOutputStream out; 
	
	public Client (InetAddress ip, int porta) {
		try {
			so= new Socket(ip, porta); 	//
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		
	public String scrivi() {
		
		String msg = "";
		try {
			msg=  br.readLine();
			out.writeBytes(msg);
			so.close();
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return msg ;
	}
	
	public void leggi() {
		//String messaggio; 
		try {
			tastiera = new BufferedReader(new InputStreamReader(System.in));
			out = new DataOutputStream(so.getOutputStream());
			br = new BufferedReader(new InputStreamReader(so.getInputStream()));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
}

