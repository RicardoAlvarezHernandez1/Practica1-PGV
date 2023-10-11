package net.salesianos.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class utils {
    
    public static String fileContent(String fileroute) throws IOException{
        FileReader fr = null;
        String content = "";
        try {
            fr = new FileReader(fileroute);
            int caract = fr.read();
            while(caract != -1) {
                content += ((char)caract);
                caract = fr.read();
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
