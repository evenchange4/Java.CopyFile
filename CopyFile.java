import java.io.*;

public class CopyFile {
   public static void main(String args[]) throws IOException
   {
      FileInputStream in   = new FileInputStream("input.xml");
      FileOutputStream out = new FileOutputStream("output.xml");
         
      int c;
      while ((c = in.read()) != -1) {
      	out.write(c);
      }
      in.close();
      out.close();
   }
}


