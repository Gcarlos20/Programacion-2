import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Calculadora simple sabroso");
            System.out.print("Ingresa el primer numero: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Ingresa el segundo numero: ");
            double numero2 = scanner.nextDouble();

            System.out.println("Elige una operacion:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.print("Opcion: ");
            int opcion = scanner.nextInt();

            double resultado;

            switch (opcion) {
                case 1:
                    resultado = numero1 + numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: no se puede dividir entre cero.");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        } catch (InputMismatchException e) { // InputMismatchException para manejar entradas no numéricas algo asi como las letras o simbolos
            System.out.println("Error: debes ingresar numeros validos.");
        } catch (Exception e) {
            System.out.println("Ocurrio un error inesperado.");
        } finally {
            scanner.close();
        }
    }
}