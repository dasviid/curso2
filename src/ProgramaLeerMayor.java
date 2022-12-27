import java.util.Scanner;

public class ProgramaLeerMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // con la clase scanner pido la cantidad de elemtnos del arrelgo
        System.out.print("Ingrese la cantidad de elementos que tiene el arreglo: ");
        int[] a = new int[scanner.nextInt()];
        // con un lazo for recorro el largo del arreglo para ir llenandolo
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese el elemento nro " + i + " del arreglo: ");
            a[i] = scanner.nextInt();
        }
        // creo una variable con el minimo valor, para ir comparandolo con los elementos de el arreglo y ver si es mayor
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];

            }
        }
        // imprimo el valor que quedo en la variable
        System.out.println("El valor mayor es el " + max);
    }
}
