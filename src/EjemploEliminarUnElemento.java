import java.util.Scanner;

public class EjemploEliminarUnElemento {
    public static void main(String[] args) {
        int[] a = new int[10];
        int posicion;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un valor de manera creciente: ");
            a[i] = scanner.nextInt();
        }
        System.out.print("Ingrese la posicion el numero que quiere eliminar: ");
        posicion = scanner.nextInt();

        for (int i = posicion; i < a.length - 1; i++) {

            a[i] = a[i + 1];
        }
        int[] b = new int[a.length - 1];
        System.arraycopy(a, 0, b, 0, b.length);
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }

    }
}
