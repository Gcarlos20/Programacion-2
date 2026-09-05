import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra o frase :");
        String input = scanner.nextLine();

        int vocales = 0;
        int consonantes = 0;

        for ( int i = 0; i < input.length(); i ++){
            char letra = input.charAt(i);

            if ( letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                 letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                vocales++;
            } else if (Character.isLetter(letra)) { // isLetter para verificar si es una letra del alfabeto
                consonantes++;
            }
        }

        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);

    }
    
}




// post Malone SunFlower 
