import java.util.Scanner;

public class EjemploBuscarPosicionIncertar {
    public static void main(String[] args) {

        int[] a = new int[10];
        int numero, posicion = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Ingrese un valor de manera creciente: ");
            a[i] = scanner.nextInt();
        }
        System.out.print("Ingrese el numero que quiere agregar: ");
        numero = scanner.nextInt();

        while (posicion < a.length - 1 && numero > a[posicion]) {
            posicion++;
        }
        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }
        a[posicion] = numero;

        System.out.println("El arreglo queda: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

    }
}
    
