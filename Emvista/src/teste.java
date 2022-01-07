import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;




public class teste {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://pss-api.prevyo.com/pss/api/v1/sentiments");
		HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
		httpConn.setRequestMethod("POST");

		httpConn.setRequestProperty("accept", "application/json");
		httpConn.setRequestProperty("Content-Type", "application/json");
		httpConn.setRequestProperty("Poa-Token", "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJwc3MiLCJ1c2VyTG9naW4iOiJrYWZhbmRvLnJvZHJpcXVlQGdtYWlsLmNvbSIsInVzZXJJZCI6Mjg5LCJpdGEiOjE2NDEyOTE2NzE2MTgsInJvbGVzIjoiUk9MRV9VU0VSIn0.MmZJdRTWosv2m8R1poiEXWdoedjb7Wh9WkmM9tamDKgn-hYpDWNNQvkHCnv77vqn77QhSKukl8_A86DV1TvS_w");

		httpConn.setDoOutput(true);
		OutputStreamWriter writer = new OutputStreamWriter(httpConn.getOutputStream());
		//writer.write("{\"text\": \"Paul aime le lait riche en proteine.\"}", "{\"lang\": \"fr\"}");
		//writer.write("{\"text\": \"Paul n'aime pas la très bonne pomme de Marie.\", \"parameters\": \"[{\"name\": \"lang\", \"value\": \"fr\"}]}");
		writer.write("{\"text\": \"Alice s'est bien reveillé ce matin.\", \"parameters\": [{\"name\": \"lang\", \"value\": \"fr\"}]}");

		writer.flush(); 
		writer.close();
		httpConn.getOutputStream().close();

		InputStream responseStream = httpConn.getResponseCode() / 100 == 2
				? httpConn.getInputStream()
				: httpConn.getErrorStream();
		Scanner s = new Scanner(responseStream).useDelimiter("\\A");
		String response = s.hasNext() ? s.next() : "";
		System.out.println(response);
	}
}