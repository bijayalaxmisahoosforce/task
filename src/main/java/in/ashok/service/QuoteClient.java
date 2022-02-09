package in.ashok.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteClient {

	public String invokeRandomQuoteApp() {

	//	String apiURL = "https://quoters.apps.pcfone.io/api/random";
		String apiURL = "https://api.binance.com/api/v3/trades?symbol=ETHUSDT&limit=1000";

		RestTemplate rt = new RestTemplate();

		ResponseEntity<String> responseEntity = rt.getForEntity(apiURL, String.class);

		int statusCode = responseEntity.getStatusCodeValue();

		if (statusCode == 200) {
			String body = responseEntity.getBody();
			return body;
		}

		return null;
	}
}
