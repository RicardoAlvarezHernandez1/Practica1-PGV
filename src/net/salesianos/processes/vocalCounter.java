package net.salesianos.processes;

public class vocalCounter {
    public static void main(String[] args) {
        int counter = 0; 
        String line = args[0];
        for(int x = 0 ; x < line.length() ; x++) {
            if ((line.charAt(x)=='a') || (line.charAt(x)=='e') || (line.charAt(x)=='i') || (line.charAt(x)=='o') || (line.charAt(x)=='u')){ 
               counter++;
            }
        }
        System.out.println(counter);
    }
}
