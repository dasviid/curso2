import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class EjemploArreglosOrdenamientoBurbuja {
    public static void arregloInverso(String[] arreglo) {
        int total2 = arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;
        }
    }

    public static void sortBurbuja(Object[] arreglo) {

        int total = arreglo.length;

        int contador = 0;

        for (int i = 0; i < total-1; i++){

            for (int j = 0; j < total-1-i;j++){
                if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) > 0){
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
            contador++;
            }
        }
        System.out.println("contador = " + contador);

    }

    public static void main(String[] args) {

        String[] productos = {"Pendrive 64GB", "Samsung Galaxy", "SSD", "Notebook", "Macbook", "Chromecast", "Bicicleta"};
        sortBurbuja(productos);
        //Arrays.sort(productos);
        // arregloInverso(productos);
        //Collections.reverse(Arrays.asList(productos));*/

        System.out.println(" ========= USANDO FOR ========= ");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }


        Integer[] numeros = new Integer[4];

        int totalNUmeros = numeros.length;

        numeros[0] = 4;
        numeros[1] = Integer.valueOf("3");
        numeros[2] = (int) -20;
        numeros[3] = 10;

        sortBurbuja(numeros);
        System.out.println(" ========= USANDO FOR ========= ");
        for (int i = 0; i < totalNUmeros; i++) {
            System.out.println("Para indice " + i + " : " + numeros[i]);
        }
    }
}