import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "SSD";
        productos[3] = "Notebook";
        productos[4] = "Macbook";
        productos[5] = "Chromecast";
        productos[6] = "Bicicleta";
        for (int i=0; i < productos.length; i++){
            productos[i] = productos[i].toUpperCase();
        }
        Arrays.sort(productos);


        int total = productos.length;

        System.out.println(" ========= USANDO FOR ========= ");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }
        System.out.println(" ========= USANDO FOR A LA INVERSA ========= ");
        for (int i = total - 1; i >= 0; i--) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }
        System.out.println(" ========= USANDO FOR A LA INVERSA 2 ========= ");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + (productos.length - 1 - i) + " : " + productos[productos.length - 1 - i]);
        }

    }
}
