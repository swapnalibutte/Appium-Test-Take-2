package PageObjects;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class AppConfiguaration {

	private static Properties properties;
	private final String propertyFilePath="D://Appium Automation//AppiumTest//src//test//java//Resources//configuration.properties";
    
	public AppConfiguaration()
	{
		BufferedReader reader;
		try{
			reader=new BufferedReader(new FileReader(propertyFilePath));
			properties=new Properties(); 
		try{
			properties.load(reader);
			reader.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
		catch(FileNotFoundException e){
		 e.printStackTrace();
		 throw new RuntimeException("AppConfiguaration file not found at"+propertyFilePath);
			
		}		
	}
	
	public static String getDeviceName()
	{
		String deviceName=properties.getProperty("devicename");
		if(deviceName!=null)
			return deviceName;
		else
			throw new RuntimeException("Device Name is not specified in Properties file");	
	}	
}
