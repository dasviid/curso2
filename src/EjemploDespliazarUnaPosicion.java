import java.util.Scanner;

public class EjemploDespliazarUnaPosicion {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los elementos del arreglo");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                b[i] = a[a.length - 1];
                continue;
            }
            b[i] = a[i - 1];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i]);
        }
    }
}
