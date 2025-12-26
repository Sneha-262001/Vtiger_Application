package GenericUtility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class FileUtility {
	
	
	
		/**
		 * This method is used to read data from property file
		 * @author Sneha
		 * @param key
		 * @return
		 * @throws IOException
		 */
		public String readDataFromPropertyFile(String key) throws IOException{//parameteised method accepting String key
			FileInputStream fis = new FileInputStream(Ipath.filePath);//interface stored path bcoz path will be static until we change
			Properties pObj=new Properties();
			pObj.load(fis);
			 String value = pObj.getProperty(key);//key can be anything 
			 return value;
			
		

	}


}
