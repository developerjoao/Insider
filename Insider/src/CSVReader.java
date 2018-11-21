/**
 * 
 */

/**
 * @author jvfca
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CSVReader {
	private Reader csvFile;
	private String line = "";
	private String cvsSplitBy = ",";
	
	public void read() {
		try(BufferedReader br = new BufferedReader(csvFile)){
			while ((line = br.readLine())!= null) {
				//do something
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
