

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileScanInteractive {

    public int countTokens(String file, String search) throws IOException {
        int instanceCount = 0;
        try (FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                Scanner s = new Scanner(br)) {
            s.useDelimiter("\\W");
            while (s.hasNext()) {
                if (search.equalsIgnoreCase(s.next().trim())) {
                    instanceCount++;
                }
            }
        } // try-with-resources will close the connections
        return instanceCount;
    }

    public static void main(String[] args) {
        // Your code goes here
        if (args.length < 1) {
            System.out.println("There are no arguments passed in!");
            System.exit(-1);
        }

        FileScanInteractive fileScan = new FileScanInteractive();
        String searchString = "";
        String firstArg = args[0];

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            while (true) {
            System.out.println("Enter search string or q to exit: ");
            searchString = reader.readLine().trim();
            
            if (searchString.trim().equalsIgnoreCase("q"))
                break;

            int count = fileScan.countTokens(firstArg, searchString);
            System.out.println("The search token appeared " + count + " times in the file");
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            System.exit(-1);
        }
    }
}