import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {

        int[] a, par, impar;
        int totalPares = 0;
        int totalImpares = 0;
        int posicionPar = 0;
        int posicionImpar = 0;
        a = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                totalPares++;
                continue;
            }
            totalImpares++;
        }
        par = new int[totalPares];
        impar = new int[totalImpares];

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                par[posicionPar++] = a[i];
                continue;
            }
            impar[posicionImpar++] = a[i];
        }
        for (int i = 0; i < par.length; i++) {
            System.out.print("par (" + i + ") = " + par[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < impar.length; i++) {
            System.out.print("impar (" + i + ") = " + impar[i] + "  ");
        }
    }
}
