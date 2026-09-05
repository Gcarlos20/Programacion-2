import java.util.Scanner;
public class InversionPalabras {
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Ingrese una palabra o frase :");
String input = scanner.nextLine();

StringBuilder palabraInvertida = new StringBuilder(input);
palabraInvertida.reverse();
System.out.println("Palabra/frase invertida: " + palabraInvertida);
 

}
    
}


// To Ashes and Blood 