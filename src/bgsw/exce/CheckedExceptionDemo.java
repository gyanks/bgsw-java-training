package bgsw.exce;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


//  checked Exception 

// compiler will thow error if exception not handled 

public class  CheckedExceptionDemo {

   public static void main(String args[]) throws FileNotFoundException {		
    
	   File file = new File("E://file.txt");
      FileReader fr = new FileReader(file); 
   }
}
