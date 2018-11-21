/**
 * 
 */

/**
 * @author jvfca
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVReader {
    public void read()throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/"));
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            System.out.print(scanner.next()+"|");
        }
        scanner.close();
    }

}
