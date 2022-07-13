package com.turbinedata.rest.demo.ClassController.OPCUaClient.src.com.prosysopc.ua.samples.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prosysopc.ua.ServiceException;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.client.UaClient;
import com.prosysopc.ua.stack.builtintypes.DataValue;
import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.stack.builtintypes.NodeId;

@Service
public class getData {
	static String[] splitTags  = Datatags.AllDatatags();
    static int length = splitTags.length;
    static Map<String, String> dataMap = new HashMap<String , String>();
    
	public static String fetchAllData(UaClient client, String turbineAddress) throws ServiceException, StatusException, JsonProcessingException
	{	
	    NodeId[] node = new NodeId[length];	
	    ExpandedNodeId[] expandedNodeId = new ExpandedNodeId[length];
	    
	    for(int j=0; j<length; j++)
		{		
			node[j] = new NodeId(2, turbineAddress + splitTags[j].trim());
			expandedNodeId[j] = new ExpandedNodeId(node[j]);
		}	    
		DataValue[] datavalue = new DataValue[length];
		
		datavalue = client.readValues(expandedNodeId);
		String json = "";
//		ArrayList<Data> strarr = new ArrayList<>(Arrays.asList(client.readValues(expandedNodeId).clone()));
			for(int i=0; i<length; i++)
			{
				//System.out.println(splitTags[i] + ":" + datavalue[i].getValue().toString());
				dataMap.put(splitTags[i], datavalue[i].getValue().toString());
				
			}
			dataMap.put("TurbineName", turbineAddress);
			json = new ObjectMapper().writeValueAsString(dataMap);
			
			return json;
	}
	
}
			












//			client.readAttributes(expandedNodeId, UnsignedInteger.ONE);
//		    long startTime = System.currentTimeMillis();
//			System.out.println(json);
		
//			long stopTime = System. currentTimeMillis();		
//			System.out.println("Elapsed Time : " + (stopTime - startTime));
		    
