import java.util.Scanner;

public class EjemploArreglosBuscarNumero {
    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los elementos del arreglo");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Ingrese el numero que quiere buscar");
        int buscar = scanner.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (buscar == a[i]) {
                System.out.println("Se encontro el elemento " + buscar);
                System.out.println("La posicion del elemento es: " + i);
                return;
            }
        }
        System.out.println("No see encontro el elemento " + buscar);
    }
}
