package com.cj.design.pattern.builder;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestUtil {

	public int executeRestRequest(RestRequest restRequest) {
		RestTemplate restTemplate = new RestTemplate();
		System.out.println("Executing rest call: " + restRequest.toString());
		ResponseEntity exchange = restTemplate.getForEntity(restRequest.getUrl(), String.class);
		System.out.println("received response: " + exchange.getBody());
		return exchange.getStatusCode().value();
	}

}
