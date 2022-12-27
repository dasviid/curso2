import java.util.Scanner;

public class ProgramaHistograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[12];
        int[] b = new int[6];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un elemento: ");
            a[i] = scanner.nextInt();
            if (a[i] < 1 || a[i] > 6) {
                System.out.println("Ingresa bien los elementos");
                main(args);
                System.exit(1);
            }
        }
        int posicion = 0;
        for (int i = 0; i < b.length; i++) {
            posicion++;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == posicion) {
                    b[i]++;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print((i + 1) + " = ");
            for (int j = 0; j < b.length; j++) {
                if (j < b[i]) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}