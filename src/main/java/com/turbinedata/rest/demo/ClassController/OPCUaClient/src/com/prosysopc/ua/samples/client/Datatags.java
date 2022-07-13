package com.turbinedata.rest.demo.ClassController.OPCUaClient.src.com.prosysopc.ua.samples.client;

public class Datatags {
	
	static String DataTags =  	"ActivePower_kW,CurrentL1,CurrentL2,CurrentL3,Frequency_Hz,GenSpeed_RPM,"
								+ "PitchAngle,ReactivePower_kVAr,Total_Operating_hrs,TurbineState,"
								+ "VoltageL1,VoltageL2,VoltageL3,WindSpeed_ms,ErrorState,ErrorState_ext";
	static String[] stringSplit = DataTags.split(",");
	public static String[] AllDatatags()
	{		
		return stringSplit;		
	}
	
}
