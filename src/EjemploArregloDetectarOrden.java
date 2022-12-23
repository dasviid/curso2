import java.util.Scanner;

public class EjemploArregloDetectarOrden {
    public static void main(String[] args) {
        int[] a = new int[7];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 7 numeros");
        for (int i = 0; i < a.length;i++){
            a[i] = scanner.nextInt();
        }
boolean ascendente = false;
        boolean descendente = false;
        for (int i = 0; i < a.length-1;i++){

            if(a[i]>a[i+1]){
                descendente = true;
            }
            if(a[i]<a[i+1]){
                ascendente = true;
            }

        }
        if (ascendente == true && descendente == true){
            System.out.println("Arreglo desordenado");
            return;
        }
        if (ascendente == false && descendente == false){
            System.out.println("Son todos iguales");
            return;
        }
        if (ascendente == true ){
            System.out.println("Arreglo ascendente");
            return;
        }
        System.out.println("Arreglo descendete");

    }
}
