package com.turbinedata.rest.demo.ClassController;

import org.springframework.stereotype.Service;

@Service
public class ServiceDatatag {
	static String data1 = "";
	static String turbineName="";
	static String json = "";
	
	public static void setData1(String turbineName, String data1) {
		ServiceDatatag.data1 = data1;
		//SpecificTurbineDataMap.put(turbineName, data1);
	}
	public static String getData1() {
		return data1;
	}

}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	static HashMap<String, String> SpecificTurbineDataMap = new HashMap<>();
	
//	public static String getData1(String turbineName) {
//		SpecificTurbineDataMap.get(turbineName);
//		
//		try {
//			json =  new ObjectMapper().writeValueAsString(SpecificTurbineDataMap);
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}
//		return json;
//	}
//	public static String getData1( ) {
//
//		
//		return data1;
//	}

	
//	public static void setData1(String data1) {
//		Datatag.data1 = data1;
//	}

//
//	int turbineId;
//	String windSpped_in_ms;
//	
//	public int getTurbineId() {
//		return turbineId;
//	}
//
//	@Qualifier("/turbinedata")
//	public void setTurbineId(int turbineId) {
//		this.turbineId = turbineId;
//	}
//
//
//	public String getWindSpped_in_ms() {
//		return windSpped_in_ms;
//	}
//
//
//	public void setWindSpped_in_ms(String windSpped_in_ms) {
//		this.windSpped_in_ms = windSpped_in_ms;
//	}

//	public static OPCclient getData2() {
//		return new OPCclient();
//	}

	
//	public static String[] getData3() {
//		return data3;
//	}
//
//	public static String[] getData2() {
//		// TODO Auto-generated method stub
//		return data2;
//	}

	
	

	
	
	//	List<String> list=new ArrayList<String>();
//	
//	TurbineInfo data1 = new TurbineInfo("129.45", "129.45","129.45", "129.45", "129.45","8879", "129.45", "129.45", "129.45","129.45", "129.45","129.45","129.45", "129.45");
//	TurbineInfo data2 = new TurbineInfo("130.372837", "2434354.0887","7879", "129.45", "54757","129.45", "129.45", "129.45", "129.45","129.45", "129.45","129.45","129.45", "129.45");
//	TurbineInfo data3 = new TurbineInfo("131.47093", "129.45","34647", "129.45", "129.45","876", "129.45", "129.45", "129.45","129.45", "129.45","129.45","129.45", "129.45");
//	public List<String> getList() {
//		return list;
//	}
//	
//	public TurbineInfo getData1() {
//		return data1;
//	}
//	public void setData1(TurbineInfo data1) {
//		this.data1 = data1;
//	}
//	public TurbineInfo getData2() {
//		return data2;
//	}
//	public void setData2(TurbineInfo data2) {
//		this.data2 = data2;
//	}
//	public TurbineInfo getData3() {
//		return data3;
//	}
//	public void setData3(TurbineInfo data3) {
//		this.data3 = data3;
//	}
//	@Override
//	public String toString() {
//		return "Datatag [list=" + list + ", data1=" + data1 + ", data2=" + data2 + ", data3=" + data3 + "]";
//	}
//	

