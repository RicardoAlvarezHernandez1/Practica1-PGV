package net.salesianos.processes;

public class vocalCounter {
    public static void main(String[] args) {
        int counter = 0;
        char letter = args[0].charAt(0);

        for (int i = 0; i < args[1].length(); i++) {
            if (args[1].toUpperCase().charAt(i) == letter) {
                counter++;
            }
        }
        System.out.println(counter);

    }
}
