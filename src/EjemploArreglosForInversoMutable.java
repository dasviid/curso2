import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
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

    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "SSD";
        productos[3] = "Notebook";
        productos[4] = "Macbook";
        productos[5] = "Chromecast";
        productos[6] = "Bicicleta";
        for (int i = 0; i < productos.length; i++) {
            productos[i] = productos[i].toUpperCase();
        }
        int total = productos.length;
        Arrays.sort(productos);
        arregloInverso(productos);

        //Collections.reverse(Arrays.asList(productos));
        System.out.println(" ========= USANDO FOR ========= ");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }
    }
}
