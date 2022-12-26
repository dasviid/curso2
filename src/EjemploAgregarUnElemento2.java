import java.util.Scanner;

public class EjemploAgregarUnElemento2 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int numero, posicion;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Ingrese un valor: ");
            a[i] = scanner.nextInt();
        }
        System.out.println("Ingrese el numero que quiere agregar");
        numero = scanner.nextInt();
        System.out.println("Ingrese en la posicion que lo quiere agregar");
        posicion = scanner.nextInt();

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }
        a[posicion] = numero;
        System.out.println("El arreglo queda: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[i] = " + a[i]);
        }

    }
}

