import java.util.Map;
import java.util.Scanner;

public class ProgramaPromedioNumeros {
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
        // recorro el arreglo para ir viendo y guardando en la variable, que numeros aparecen y que cantidad de veces aparecen
        int positivos = 0, negativos = 0,contadorPositivos = 0,contadorNegativos = 0,ceros = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0){
                positivos += a[i];
                contadorPositivos++;
                continue;
            }
            if (a[i] < 0){
                negativos += a[i];
                contadorNegativos++;
                continue;
            }
            ceros++;
        }
        // le otorgo 1 al a los contadores, porque si no ingrese ningun valor negativo o positivo me va a dar inf
        if (positivos== 0) contadorPositivos= 1;
        if (negativos== 0) contadorNegativos= 1;

        System.out.println("El promedio de los numeros positivos es = " + (double)positivos/contadorPositivos);
        System.out.println("El promedio de los numeros negativos es = " + (double)negativos/contadorNegativos);
        System.out.println("La cantidad de ceros = " + ceros);
    }
}
