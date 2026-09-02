package invertirTexto;

import java.util.Scanner;

public class invertirTexto {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = input.nextLine();

        String textoInvertido = new StringBuilder(texto).reverse().toString();

        System.out.println("Texto invertido: " + textoInvertido);

        input.close();
        }

}
