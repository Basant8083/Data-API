package com.turbinedata.rest.demo.ClassController;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


//How User can fetch data from from REST API (TurbineData API)
public class RestClient {
	
	
	private static final String get_turbine_dataValue = "http://localhost:9091/Data1"; // Endpoint
	
	static RestTemplate restTemplate = new RestTemplate();
	public static void main(String[] args)
	{
		
		callGetAllValues();
		
	}
	
	private static void callGetAllValues() {
		HttpHeaders header = new HttpHeaders();
		header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<>("parameters", header);
		ResponseEntity<String> result = restTemplate.exchange(get_turbine_dataValue, HttpMethod.GET, entity, String.class);
		
		//ResponseEntity<String> new_result = restTemplate.exchange();
		System.out.println(result) ;
		//System.out.println(result);
		//return result;
	}
		
}
