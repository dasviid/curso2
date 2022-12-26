import java.util.Scanner;

public class ProgramaLeerNumeros {
    public static void sortBurbuja(Object[] arreglo) {

        int total = arreglo.length;

        int contador = 0;

        for (int i = 0; i < total - 1; i++) {

            for (int j = 0; j < total - 1 - i; j++) {
                if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) > 0) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer[] a = new Integer[10];
        Integer[] b = new Integer[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un valor: ");
            a[i] = scanner.nextInt();
        }
        sortBurbuja(a);
        int k = 0;
        for (int i = 0; i < a.length / 2; i++) {
            System.out.print(" es: " + a[a.length - 1 - i] + " -- ");
            System.out.print(" es: " + a[i] + " -- ");
            b[k++] = a[a.length - 1 - i];
            b[k++] = a[i];
        }
        System.out.println("======================================================================");
        for (int i = 0; i < b.length; i++) {
            System.out.print("El elemento " + (i) + " es: " + b[i] + " -- ");
        }
    }
}

