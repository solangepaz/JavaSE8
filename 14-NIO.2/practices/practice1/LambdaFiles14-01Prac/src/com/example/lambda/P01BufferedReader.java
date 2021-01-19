import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

/**
 *
 * @author oracle
 */
public class P01BufferedReader {
    
    public static void main(String[] args) {
       // System.out.println(Path.of(".").toAbsolutePath());
        try{
            BufferedReader bReader = 
                new BufferedReader(new FileReader("hamlet.txt"));
            
            System.out.println("=== Entire File ===");
            //print out file here
            bReader.lines().forEach(lines -> System.out.println(lines));
                        
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    } 
}
