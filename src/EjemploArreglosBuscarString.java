import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {

        String[] a = new String[4];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los elementos del arreglo");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextLine();
        }

        System.out.println("Ingrese el numero que quiere buscar");
        String buscar = scanner.nextLine();
        for (int i = 0; i < a.length; i++) {
            if (buscar.equalsIgnoreCase(a[i])) {
                System.out.println("Se encontro el elemento " + buscar);
                System.out.println("La posicion del elemento es: " + i);
                return;
            }
        }
        System.out.println("No see encontro el elemento " + buscar);
    }
}
