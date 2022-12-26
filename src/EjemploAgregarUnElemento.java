import java.util.Scanner;

public class EjemploAgregarUnElemento {
    public static void main(String[] args) {

        int[] a = new int[10];
        int[] b = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Ingrese un valor: ");
            a[i] = scanner.nextInt();
        }
        System.out.println("Ingrese el numero que quiere agregar");
        int numero = scanner.nextInt();
        System.out.println("Ingrese en la posicion que lo quiere agregar");
        int posicion = scanner.nextInt();

      /*  for (int i = 0; i < b.length;i++){
            if(posicion > i){
                b[i] = a[i];
                continue;
            }
            if (posicion == i){
                b[posicion] = numero;
                continue;
            }
            b[i]=a[i-1];

        }*/
        boolean aPartir = false;
        for (int i = 0; i < b.length; i++) {
            if (posicion == i) {
                b[i] = numero;
                aPartir = true;
                continue;
            }
            if (aPartir == true) {
                b[i] = a[i - 1];
                continue;
            }
            b[i] = a[i];
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("El elemento " + i + " contiene " + b[i]);
        }
    }
}
