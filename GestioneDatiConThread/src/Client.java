import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client{
	
	Socket so; 
	BufferedReader br;
	BufferedWriter bw; 
	
	public Client (InetAddress ip, int porta) {
		try {
			so= new Socket(ip, porta); 	//
			br = new BufferedReader(new InputStreamReader(so.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public String leggi() {
		
		String msg = "";
		try {
			msg=  br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return msg ;
	}
	
}

