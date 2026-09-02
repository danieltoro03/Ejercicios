import java.util.Scanner;

public class calculadoraSencilla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la operación que desea realizar (+, -, *, /): ");
        char operador = input.next().charAt(0);

        System.out.println("Ingrese el número 1: ");
        double numero1 = input.nextDouble();

        System.out.println("Ingrese el número 2: ");
        double numero2 = input.nextDouble();

        double resultado;

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("El resultado es: " + resultado);
                break;

            case '-':
                resultado = numero1 - numero2;
                System.out.println("El resultado es: " + resultado);
                break;

            case '*':
                resultado = numero1 * numero2;
                System.out.println("El resultado es: " + resultado);
                break;

            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("El resultado es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;

            default:
                System.out.println("Operación inválida.");
                break;
        }

        input.close();
    }
}