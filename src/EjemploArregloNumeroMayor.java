import java.util.Scanner;

public class EjemploArregloNumeroMayor {
    public static void main(String[] args) {

        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 5 numeros");
        for (int i = 0; i < a.length;i++){
            a[i] = scanner.nextInt();
        }

        int max= 0;
        for (int i = 0; i < a.length;i++){
            max = (a[max] > a[i] )?max:i;
        }
        System.out.println("El maximo valor es "+a[max]+", y se encuentra en la posicion "+max  );
    }
}
