package com.turbinedata.rest.demo;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.prosysopc.ua.ApplicationIdentity;
import com.prosysopc.ua.SecureIdentityException;
import com.prosysopc.ua.ServiceException;
import com.prosysopc.ua.SessionActivationException;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.client.ConnectException;
import com.prosysopc.ua.client.InvalidServerEndpointException;
import com.prosysopc.ua.client.UaClient;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.core.ApplicationDescription;
import com.prosysopc.ua.stack.core.ApplicationType;
import com.prosysopc.ua.stack.transport.security.SecurityMode;
import com.turbinedata.rest.demo.ClassController.ServiceDatatag;
import com.turbinedata.rest.demo.ClassController.OPCUaClient.src.com.prosysopc.ua.samples.client.TurbineAddress;
import com.turbinedata.rest.demo.ClassController.OPCUaClient.src.com.prosysopc.ua.samples.client.getData;
@SpringBootApplication
public class TurbinedataApplication extends SpringBootServletInitializer {
		public static void main(String[] args) throws UnknownHostException, SecureIdentityException, IOException, InvalidServerEndpointException, ConnectException, SessionActivationException, ServiceException {
		SpringApplication.run(TurbinedataApplication.class, args);
		
		UaClient client = new UaClient("opc.tcp://192.168.39.198:49320");
	    client.setSecurityMode(SecurityMode.NONE);
	    initialize(client);
	    client.connect();
	    String[] strsplit1 = TurbineAddress.AllturbineName(); //Fetching all the turbine address from TubineAddress class	  en  
//	    Storing turbine name into ArrayList
	    ArrayList<String> turbineAddressList = new ArrayList<String>();
	    for(int i=0; i<strsplit1.length; i++)
	    {
	    	turbineAddressList.add(strsplit1[i].trim());
	    }
	    
	    System.out.println(strsplit1[0]);
	    while(true)
	    {
	    	for(int i=0; i<strsplit1.length; i++)
		    {
		    	try {
					String data = getData.fetchAllData(client, strsplit1[i]);
					ServiceDatatag.setData1(strsplit1[i], data);
				} catch (ServiceException e) {

					e.printStackTrace();
				} catch (StatusException e) {

					e.printStackTrace();
				}
		    }
	    	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
	    }
	    
	    
 }
 protected static void initialize(UaClient client) throws SecureIdentityException, IOException, UnknownHostException {    
	    ApplicationDescription appDescription = new ApplicationDescription();
	    appDescription.setApplicationName(new LocalizedText("OPCclient", Locale.ENGLISH));
	    appDescription.setApplicationUri("urn:localhost:UA:OPCclient");
	    appDescription.setProductUri("urn:prosysopc.com:UA:OPCclient");
	    appDescription.setApplicationType(ApplicationType.Client);
	    final ApplicationIdentity identity = new ApplicationIdentity();
	    identity.setApplicationDescription(appDescription);
	    client.setApplicationIdentity(identity);
 }    
	    
}    
		
		
//		UaClient client = new UaClient("opc.tcp://192.168.39.198:49320");
//	    client.setSecurityMode(SecurityMode.NONE);
//	    initialize(client);
//	    try {
//			client.connect();
//		} catch (ServiceException e) {
//
//			e.printStackTrace();
//		}
//	    String NodeAddress = "Channel2.Device1.Bellugappa-PPC-TurbineValues.PPC.BLG071.Fast.";
//	    
//	    HashMap<String, String> map = new HashMap<>();
//	    
//	    Vector<String> NodeName= new Vector<String>();
//	    String DataTags =  "CurrentL1, CurrentL2, CurrentL3,Frequency_Hz,GenSpeed_RPM,PitchAngle,ReactivePower_kVAr, ReactivePower_kVAr._Address, Total_Operating_hrs,TurbineState,VoltageL1,VoltageL2,VoltageL3,WindSpeed_ms";
//	    
//	    
//	    
//	    String[] strSplit  = DataTags.split(",");
//	    int length = strSplit.length;
//	    
//	    for (String Node1 : DataTags.split(",")) 
//		{
//			  NodeName.add(NodeAddress+Node1.trim());		
//		}				 
//			
//		NodeId[] node = new NodeId[length];
//		
//		for(int i=0;i<length ; i++)
//		{
//			node[i] = new NodeId(2, NodeAddress + strSplit[i].trim());
//		}	   		   
//		DataValue[] datavalue = new DataValue[length];
//		   
//		for(int i=0 ; i< length ; i++)
//		{
//			datavalue[i] = new DataValue();
//			   
//		}	
//		
//		String json = "";
//		String turbineName = "BLG071.Fast.";
//		//System.out.println(length);
//		while(true)
//		{					int index =0;
//							int i=0;
//			   				for(DataValue data : datavalue)
//			   				{		
//			   					try {
//									data = client.readValue(node[index]);
//									//System.out.println(data);
//								} catch (ServiceException | StatusException e) {
//									e.printStackTrace();
//								}
//																																	   					
//			   					int substringIndex = NodeName.get(i).indexOf(turbineName);
//			   					map.put(NodeName.get(i).substring(substringIndex+turbineName.length(), NodeName.get(i).length()), data.getValue().toString());	
//			   					json = new ObjectMapper().writeValueAsString(map);
//			   					index++;
//			   					i++;
//			   					
//			   				}
//			   				System.out.println(json);
//			   				try {
//								Thread.sleep(1000);
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
//		}
//			
//		
// }
// protected static void initialize(UaClient client) throws SecureIdentityException, IOException, UnknownHostException {    
//	    ApplicationDescription appDescription = new ApplicationDescription();
//	    appDescription.setApplicationName(new LocalizedText("OPCclient", Locale.ENGLISH));
//	    appDescription.setApplicationUri("urn:localhost:UA:OPCclient");
//	    appDescription.setProductUri("urn:prosysopc.com:UA:OPCclient");
//	    appDescription.setApplicationType(ApplicationType.Client);
//	    final ApplicationIdentity identity = new ApplicationIdentity();
//	    identity.setApplicationDescription(appDescription);
//	    client.setApplicationIdentity(identity);
// }
	
	



