import java.net.InetAddress;
import java.net.UnknownHostException;

public class GestoreClient {
	
	public static void main(String[] args) {
		try {
			Client cli = new Client(InetAddress.getLocalHost(), 2000);
			String str= cli.leggi();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}
}

