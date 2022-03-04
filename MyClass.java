import java.util.*;
import java.io.*;

public class MyClass {
    private static Scanner s = new Scanner(System.in);
    public static void main(String args[]) {
      
      do {
        System.out.println(parseInput());
      } while (s.hasNextLine());
      
    }
    
    public static String parseInput() {
      String line = s.nextLine();
      
      int hours = 00;
      int minutes = 00;
      int seconds = 00;
      
      for (int i = 0; i < line.length(); i++) {
          switch (line.substring(i,i+1)) {
            case "s": seconds = Integer.parseInt(line.substring(i-1,i)); break;
            case "h": hours = Integer.parseInt(line.substring(i-1,i)); break;
            case "m": minutes = Integer.parseInt(line.substring(i-1,i)); break;
          }
      }
      
      return String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds);
    }
}
