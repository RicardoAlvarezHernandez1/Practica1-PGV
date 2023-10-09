package net.salesianos.processes;

public class vocalCounter {
    public static void main(String[] args) {
        int counter = 0; 
        String letter = args[0];
        String text = args[1];

        char letterChar = letter.charAt(0);

        for(int x = 0 ; x < text.length() ; x++) {
            if((text.charAt(x)== letterChar)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
