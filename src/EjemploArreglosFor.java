import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "SSD";
        productos[3] = "Notebook";
        productos[4] = "Macbook";
        productos[5] = "Chromecast";
        productos[6] = "Bicicleta";
        Arrays.sort(productos);

        int total = productos.length;

        System.out.println(" ========= USANDO FOR ========= ");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println(" ========= USANDO FOR EACH ========= ");
        for (String prod : productos) {
            System.out.println("Producto = " + prod);
        }

        System.out.println(" ========= USANDO WHILE ========= ");
        int i = 0;
        while (i < total) {
            System.out.println("Producto = " + productos[i]);
            i++;
        }

        System.out.println(" ========= USANDO DO WHILE ========= ");
        int j = 0;
        do {
            System.out.println("Producto = " + productos[j]);
            j++;
        }
        while (j < total);

        int[] numeros = new int[10];

        int numeroTotal = numeros.length;
        ;
        for (i = 0; i < numeroTotal; i++) {
            numeros[i] = i * 3;
            System.out.println("numeros = " + numeros[i]);
        }


    }
}
