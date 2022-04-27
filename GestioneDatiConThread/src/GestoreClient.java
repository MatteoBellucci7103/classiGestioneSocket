import java.net.InetAddress;
import java.net.UnknownHostException;

public class GestoreClient {
	
	public static void main(String[] args) {
		try {
			Client cli = new Client(InetAddress.getLocalHost(), 2000);
			cli.leggi();
			cli.scrivi();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}
}

