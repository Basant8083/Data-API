package com.turbinedata.rest.demo.ClassController;

import java.util.ArrayList;
import java.util.Arrays;

public class TurbineInfo {

	String str = "CurrentL1,CurrentL2,CurrentL3,Frequency_Hz,GenSpeed_RPM,PitchAngle,ReactivePower_kVAr,_Address,Total_Operating_hrs,TurbineState,VoltageL1,VoltageL2,VoltageL3,WindSpeed_ms" ;
	//String[] strSplit = str.split(",");
	ArrayList<String> datatags = new ArrayList<String>(Arrays.asList(str.split(",")));
	/**
	 * @param currentL1
	 * @param currentL2
	 * @param currentL3
	 * @param frequency_Hz
	 * @param genSpeed_RPM
	 * @param pitchAngle
	 * @param reactivePower_kVAr
	 * @param _Address
	 * @param total_Operating_hrs
	 * @param turbineState
	 * @param voltageL1
	 * @param voltageL2
	 * @param voltageL3
	 * @param windSpeed_ms
	 */
//	public TurbineInfo(String currentL1, String currentL2, String currentL3, String frequency_Hz, String genSpeed_RPM,
//			String pitchAngle, String reactivePower_kVAr, String _Address, String total_Operating_hrs,
//			String turbineState, String voltageL1, String voltageL2, String voltageL3, String windSpeed_ms) {
//		super();
//		CurrentL1 = currentL1;
//		CurrentL2 = currentL2;
//		CurrentL3 = currentL3;
//		Frequency_Hz = frequency_Hz;
//		GenSpeed_RPM = genSpeed_RPM;
//		PitchAngle = pitchAngle;
//		ReactivePower_kVAr = reactivePower_kVAr;
//		this._Address = _Address;
//		Total_Operating_hrs = total_Operating_hrs;
//		TurbineState = turbineState;
//		VoltageL1 = voltageL1;
//		VoltageL2 = voltageL2;
//		VoltageL3 = voltageL3;
//		WindSpeed_ms = windSpeed_ms;
//	}	
	
	
		
}
	
