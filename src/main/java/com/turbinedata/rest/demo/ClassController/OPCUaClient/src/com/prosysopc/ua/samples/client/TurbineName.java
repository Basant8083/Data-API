package com.turbinedata.rest.demo.ClassController.OPCUaClient.src.com.prosysopc.ua.samples.client;

public class TurbineName {
	
	static String turbineNames = "BLG054,BLG055,BLG069,BLG071,BLG097,BLG098,BLG135";
	static String[] spliturbineName = turbineNames.split(",");
	public static String[] getAllTurbineName()
	{
		return spliturbineName;
		
	}

}
