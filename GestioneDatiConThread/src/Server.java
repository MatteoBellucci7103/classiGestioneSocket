import java.io.DataOutputStream;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server{
	
	ServerSocket ss; 
	Socket so;
	DataOutputStream out; 
	//Lanciare il thread e insieme al setsotimeout
	
	public Server(int porta) {
		
		try {
	        //1)Apertura alla porta, avvio del servizio
	        ss = new ServerSocket(porta);	//il server si mette in ascolto
	        System.out.println("Server in ascolto");
	        //ss.setSoTimeout(1000);
		}
		catch (IOException ex) {
	        System.err.println("Errore avvio server sulla porta 2000");
	        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
	    }
	}
		
	public void ascolto() {
		try {
			so=ss.accept();	//attende che il server risponde 
		} catch (IOException e) { 
			e.printStackTrace();
		}
		
	}
	
	public void scrivi(String messaggio) {
		try {
			out = new DataOutputStream(so.getOutputStream());
			out.writeUTF(messaggio);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	        
       
}
