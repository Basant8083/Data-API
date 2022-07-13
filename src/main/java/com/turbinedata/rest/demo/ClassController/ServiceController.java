package com.turbinedata.rest.demo.ClassController;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.prosysopc.ua.ServiceException;
import com.prosysopc.ua.StatusException;
//import com.prosysopc.ua.samples.client.OPCclient;
import com.turbinedata.rest.demo.TurbinedataApplication;
import com.turbinedata.rest.demo.ClassController.OPCUaClient.src.com.prosysopc.ua.samples.client.getData;



@SuppressWarnings("unused")


@RestController
public class ServiceController {
	
	
	
	@Autowired
	public ServiceDatatag datatag;
	
	@Autowired
	private getData GetData; 
	
	
	@GetMapping("/Data")
	@ResponseBody
	public String Data2()
	{
		//System.out.println(turbineName);
		return ServiceDatatag.getData1();
		
	}
	
	
//	@GetMapping("/turbine/{id}")
//	public String dataOfSpecificTurbine(String turbineName)
//	{
//		return param2;
//		
//	}
	

}

