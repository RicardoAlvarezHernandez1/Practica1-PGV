package net.salesianos.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class utils {
    
    public static String fileContent(String fileroute) throws IOException{
        String content = "";
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileroute));
            String currentLine = br.readLine();
            while(currentLine != null){
                content += currentLine;
                currentLine = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    
    }
}
