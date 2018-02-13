import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
      //FileInputStream in = null;
      //FileOutputStream out = null;

	   
	   FileReader in = null;
	   FileWriter out = null;
	   
      try {
         //in = new FileInputStream(".\\input.txt");
         
        // in = new FileInputStream("C:\\TRAINING\\SAMPLES3\\input.txt");
       //  out = new FileOutputStream("C:\\TRAINING\\SAMPLES3\\output.txt");
         
    	  
    	  in = new FileReader("C:\\TRAINING\\SAMPLES3\\input.txt");
    	  out = new FileWriter("C:\\TRAINING\\SAMPLES3\\output.txt");
    	  
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
         System.out.println("File Copied...");
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}