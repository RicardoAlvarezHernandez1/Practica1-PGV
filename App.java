import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import net.salesianos.launcher.ProcessLauncher;
import net.salesianos.utils.utils;

public class App {
    public static void main(String[] args) throws Exception {

        String contenido = utils.fileContent("./lorem_ipsum.txt");
        ArrayList<Process> allProcesses = new ArrayList<>();
        
        String[] vocals = {"A" , "E" , "I" , "O" , "U"};
        Integer vocalCounter = 0;


        for (String vocal : vocals) {
            String outputFileName = "outputText"+ vocal + ".txt";
            Process javaProcess = ProcessLauncher.initVocalCounterProcess(vocal, contenido.toUpperCase() , outputFileName);
            allProcesses.add(javaProcess);
        }

        for (Process process : allProcesses) {
            try {
              process.waitFor();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
        }

        System.out.println("Según el texto : " + "\n" + contenido);
        for (String vocal : vocals) {
            try {
                BufferedReader br = new BufferedReader(new FileReader("./net/salesianos/outputs/outputText"+ vocal + ".txt"));
                String line;
                while((line=br.readLine())!=null){
                    System.out.println("El fichero tiene : " + line + " vocales " + vocal);
                    vocalCounter += Integer.parseInt(line);
                }
                br.close();         
            }
            catch(Exception e){
                e.printStackTrace();
            }
        } 
        System.out.println("El fichero tiene " + vocalCounter + " vocales en total");

    }
}
