package com.turbinedata.rest.demo.ClassController.OPCUaClient.src.com.prosysopc.ua.samples.client;

public class TurbineAddress {
		
		static String NodeAddress = "Channel2.Device1.Bellugappa-PPC-TurbineValues.PPC.BLG054.Fast.,"
									+ "Channel2.Device1.Bellugappa-PPC-TurbineValues.PPC.BLG071.Fast.,"
									+ "Channel2.Device1.Bellugappa-PPC-TurbineValues.PPC.BLG055.Fast.,"
									+ "Channel2.Device1.Bellugappa-PPC-TurbineValues.PPC.BLG069.Fast.,"
									+ "Channel2.Device1.Bellugappa-PPC-TurbineValues.PPC.BLG097.Fast.,"
									+ "Channel2.Device1.Bellugappa-PPC-TurbineValues.PPC.BLG098.Fast.,"
									+ "Channel2.Device1.Bellugappa-PPC-TurbineValues.PPC.BLG135.Fast.";
		static String[] splitNodeAddress = NodeAddress.split(",");
		public static String[] AllturbineName()
		{
			return splitNodeAddress;
			
		}
}
