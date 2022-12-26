import java.util.Scanner;

public class EjemploAgregarUnElementoConArrayCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos que tiene el arreglo");
        int[] a = new int[scanner.nextInt()];
        int[] b = new int[a.length + 1];
        int numero, posicion, ultimo;


        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un valor: ");
            a[i] = scanner.nextInt();
        }
        System.out.println("Ingrese el numero que quiere agregar");
        numero = scanner.nextInt();
        System.out.println("Ingrese en la posicion que lo quiere agregar");
        posicion = scanner.nextInt();

        ultimo = a[a.length - 1];
        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }
        a[posicion] = numero;
        System.arraycopy(a, 0, b, 0, a.length);
        b[b.length - 1] = ultimo;
        System.out.println("El arreglo queda: ");
        for (int i = 0; i < b.length; i++) {
            System.out.println("a[i] = " + b[i]);
        }

    }
}

