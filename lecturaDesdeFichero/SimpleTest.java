import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleTest{

    public static void main(String[] args) throws IOException {
    	List<String> lineas = new ArrayList<>();
    	if (args.length != 1){
    		System.out.println("This program requires to be given one, and only one textfile!");
    		System.exit(1);
    	}
    	FileInputStream inputStream = null;
    	Scanner sc = null;
    	try {
    		final String filename = args[0];
    		System.out.printf("Starting read of %s%n", filename);
			inputStream = new FileInputStream(filename);
    	    sc = new Scanner(inputStream, "UTF-8");
    	    while (sc.hasNextLine()) {
    	        String line = sc.nextLine();
    	        if (line != "\n\r") System.out.printf("Reading %s%n", line);
    	        // System.out.println(line);
    	    }
    	    // note that Scanner suppresses exceptions
    	    if (sc.ioException() != null) {
    	        throw sc.ioException();
    	    }
    	} finally {
    	    if (inputStream != null) {
    	        inputStream.close();
    	    }
    	    if (sc != null) {
    	        sc.close();
    	    }
    	}
    }
}