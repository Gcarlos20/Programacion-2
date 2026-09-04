package EstructuraDeDatos;

public class ejercicio2 {
    public static void main(String[] args){

        // buscar determinado elemento en un arrglo

 int[] arreglo = new int[10];

arreglo[0] = 3;
arreglo[1] = 2;
arreglo[2] = 4;
arreglo[3] = 5;
arreglo[4] = 6;

boolean encontrado = false;

for (int i = 0; i < arreglo.length; i++) {
    if (arreglo[i] == 5) {
        encontrado = true;
        break;
    }
}

if (encontrado) {
    System.out.println("El elemento 5 se encuentra en el arreglo");
} else {
    System.out.println("El elemento 5 no se encuentra en el arreglo");
}
  
}
}
