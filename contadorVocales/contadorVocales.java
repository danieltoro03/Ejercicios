package contadorVocales;

import java.util.Scanner;

public class contadorVocales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = input.nextLine();

        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < palabra.length(); i++) {

            char letra = palabra.charAt(i);

            if ("aeiou".indexOf(letra) != -1) {
                vocales++;
            } else {
                consonantes++;
            }
        }
        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);
        input.close();
        
}
}
