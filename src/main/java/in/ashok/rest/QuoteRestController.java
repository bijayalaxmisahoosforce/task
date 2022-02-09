package in.ashok.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashok.service.QuoteClient;

@RestController
public class QuoteRestController {
	
	@Autowired
	private QuoteClient quoteClient;
	
	@GetMapping("/quote")
	
	public String getQuote() {
		String quote = quoteClient.invokeRandomQuoteApp();		
		return quote;
		
		
	}

}
