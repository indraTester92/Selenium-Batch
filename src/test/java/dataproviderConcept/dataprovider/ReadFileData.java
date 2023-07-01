package dataproviderConcept.dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFileData {
	
	public static Properties prop;
	public static FileInputStream fis;
	
	public static Properties readData() throws IOException {
		prop = new Properties();
		fis = new FileInputStream("/Users/indrajitchakraborty/eclipse-workspace/dataprovider/testData.properties");
		prop.load(fis);
		return prop;
		
	}

}
