//package com.turbinedata.rest.demo.ClassController.OPCUaClient.src.com.prosysopc.ua.samples.client;
//import java.io.IOException;
//import java.net.UnknownHostException;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Locale;
//import java.util.Map;
//
//import com.prosysopc.ua.ApplicationIdentity;
//import com.prosysopc.ua.SecureIdentityException;
//import com.prosysopc.ua.client.UaClient;
//import com.prosysopc.ua.client.nodes.UaNodeImpl;
//import com.prosysopc.ua.stack.builtintypes.DataValue;
//import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
//import com.prosysopc.ua.stack.builtintypes.LocalizedText;
//import com.prosysopc.ua.stack.builtintypes.NodeId;
//import com.prosysopc.ua.stack.core.ApplicationDescription;
//import com.prosysopc.ua.stack.core.ApplicationType;
//import com.prosysopc.ua.stack.transport.security.SecurityMode;
//
//public class OPCclient extends ExtendThread{
//	 @SuppressWarnings("unused")
//	public static void main(String[] args) throws Exception {
//		    UaClient client = new UaClient("opc.tcp://192.168.39.198:49320");
//		    client.setSecurityMode(SecurityMode.NONE);
//		    initialize(client);
//		    client.connect();
//		    OPCclient thread = new OPCclient();
////		    String NodeAddress = "Channel2.Device1.Bellugappa-PPC-TurbineValues.PPC.BLG071.Fast., Channel2.Device1.Bellugappa-PPC-TurbineValues.PPC.BLG054.Fast., Channel2.Device1.Bellugappa-PPC-TurbineValues.PPC.BLG055.Fast., Channel2.Device1.Bellugappa-PPC-TurbineValues.PPC.BLG069.Fast., Channel2.Device1.Bellugappa-PPC-TurbineValues.PPC.BLG097.Fast., Channel2.Device1.Bellugappa-PPC-TurbineValues.PPC.BLG098.Fast., Channel2.Device1.Bellugappa-PPC-TurbineValues.PPC.BLG135.Fast.";
//		    
//		    String[] strsplit1 = TurbineAddress.AllturbineName(); //Fetching all the turbine address from TubineAddress class
//		    
////		    Storing turbine name into ArrayList
//		    ArrayList<String> turbineAddressList = new ArrayList<String>();
//		    for(int i=0; i<strsplit1.length; i++)
//		    {
//		    	turbineAddressList.add(strsplit1[i].trim());
//		    }
////		    System.out.println(turbineAddressList);
//		    
//
//		    ArrayList<String> completeNode= new ArrayList<String>();
//		    
//		    HashMap<String, Map<String, String>>  map = new HashMap<>();
//		    
////		    ReactivePower_kVAr._Address,
////		    String DataTags =  "CurrentL1, CurrentL2, CurrentL3,Frequency_Hz,GenSpeed_RPM,PitchAngle,ReactivePower_kVAr,Total_Operating_hrs,TurbineState,VoltageL1,VoltageL2,VoltageL3,WindSpeed_ms, ErrorState, ErrorState_ext ";	
//		    
//		    String[] splitTags  = Datatags.AllDatatags(); //Datatags taking from Datatags class
//		    String[] trubineName = TurbineName.getAllTurbineName();
//		    
//		    int length = splitTags.length;
//		    while(true)
//		    {
//		    	for(int i=0; i<strsplit1.length; i++)
//			    {
//			    	getData.fetchAllData(client, strsplit1[i], trubineName[i]);
//			    }
//		    	Thread.sleep(1000);
//		    }
//		    
//		    
//	 }
//	 protected static void initialize(UaClient client) throws SecureIdentityException, IOException, UnknownHostException {    
//		    ApplicationDescription appDescription = new ApplicationDescription();
//		    appDescription.setApplicationName(new LocalizedText("OPCclient", Locale.ENGLISH));
//		    appDescription.setApplicationUri("urn:localhost:UA:OPCclient");
//		    appDescription.setProductUri("urn:prosysopc.com:UA:OPCclient");
//		    appDescription.setApplicationType(ApplicationType.Client);
//		    final ApplicationIdentity identity = new ApplicationIdentity();
//		    identity.setApplicationDescription(appDescription);
//		    client.setApplicationIdentity(identity);
//	 }    
//		    
//}	    
////		    System.out.println(length);
//		    
//			/*
//			 * NodeId[] node = new NodeId[length]; ExpandedNodeId[] expandedNodeId = new
//			 * ExpandedNodeId[length]; // for(int i=0; i< arrList.size(); i++) // { for(int
//			 * j=0; j<length; j++) {
//			 * 
//			 * node[j] = new NodeId(2, turbineAddressList.get(0) + splitTags[j].trim());
//			 * expandedNodeId[j] = new ExpandedNodeId(node[j]); } // }
//			 * 
//			 * // for(int i=0; i< length; i++) // { //
//			 * System.out.println(expandedNodeId[i]); // }
//			 * 
//			 * // client.readValues(node); // ArrayList<Integer> arr = new
//			 * ArrayList<>(Arrays.asList(1,3,4)); long startTime = System.
//			 * currentTimeMillis(); DataValue[] datavalue = new DataValue[length]; datavalue
//			 * = client.readValues(expandedNodeId);
//			 * 
//			 * // ArrayList<Data> strarr = new
//			 * ArrayList<>(Arrays.asList(client.readValues(expandedNodeId).clone()));
//			 * 
//			 * for(int i=0; i<length; i++) { System.out.println(splitTags[i] + ":" +
//			 * datavalue[i].getValue()); }
//			 * 
//			 * long stopTime = System. currentTimeMillis();
//			 * 
//			 * System.out.println("Elapsed Time : " + (stopTime - startTime));
//			 */
//				
//				
//				
////				System.out.println(datavalue.getClass());
//				
//		    
//				
//		    
//				
////		    New
////		    ArrayList<NodeId> nodeList = new ArrayList<NodeId>();
////		    for(int i=0; i< turbineAddressList.size(); i++)
////		    {
////		    	ArrayList<NodeId> temp = new ArrayList<NodeId>();
////				for(int j=0; j<length; j++)
////				{
////					temp.add(node[j] = new NodeId(2, turbineAddressList.get(i) + splitTags[j].trim()));
////				}	
////				nodeList.addAll(temp);
////				temp.clear();
////		    }
//		    
////		    
//		    
//		    
//				/*
//				 * int k =0; for (String Node1 : splitTags) {
//				 * 
//				 * completeNode.add(turbineAddressList.get(k)+Node1.trim()); //Generating &
//				 * storing the comeplete address of the node...
//				 * 
//				 * }
//				 * 
//				 * DataValue[] datavalue = new DataValue[length];
//				 * 
//				 * for(int i=0 ; i< length ; i++) { datavalue[i] = new DataValue();
//				 * 
//				 * }
//				 * 
//				 * 
//				 * 
//				 * 
//				 * // String turbineAdd = "BLG054,BLG055,BLG069,BLG071,BLG097,BLG098,BLG135";
//				 * String[] turbineName = TurbineName.getAllTurbineName(); while(true) {
//				 * 
//				 * ArrayList<String> dataOfNodes = new ArrayList<String>();
//				 * 
//				 * Map<String, String > tagAndValMap = new HashMap<>(); tagAndValMap.clear();
//				 * for(int i=0; i<turbineName.length; i++ ) {
//				 * 
//				 * dataOfNodes.clear(); tagAndValMap.clear(); long startTime = System.
//				 * currentTimeMillis(); for(int j=0; j<length; j++) {
//				 * 
//				 * datavalue[j] = client.readValue(null); //node[i] // datavalue[i] =
//				 * client.readValue(nodeList.get(i)); //
//				 * System.out.println(datavalue[i].toString()+ " ");
//				 * dataOfNodes.add(datavalue[j].getValue().toString());
//				 * tagAndValMap.put(splitTags[j] , datavalue[j].getValue().toString() ); // int
//				 * index = completeNode.get(i).indexOf(turbineName[i]); // int indexOfdot =0; //
//				 * for(indexOfdot=index; indexOfdot<completeNode.get(0).length(); indexOfdot++)
//				 * // { // if(completeNode.get(i).charAt(indexOfdot) == '.') // { // break; // }
//				 * // } // System.out.println(index +" "+ indexOfdot); //
//				 * completeNode.get(i).substring(index, index+turbineName.length); //
//				 * map.put(completeNode.get(i).substring(index, indexOfdot), dataOfNodes);
//				 * 
//				 * // map.put(turbineName[0], dataOfNodes);
//				 * 
//				 * } long stopTime = System. currentTimeMillis(); System.out.println(stopTime -
//				 * startTime);
//				 * 
//				 * map.put(turbineName[i], tagAndValMap); //System.out.println( map); }
//				 * 
//				 * System.out.println( map); // System. currentTimeMillis(); //
//				 * Thread.sleep(1000); // System.out.println(stopTime - startTime);
//				 * 
//				 * 
//				 * }
//				 */
//			   
//
//
//
//	 
