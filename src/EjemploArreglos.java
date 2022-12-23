import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "SSD";
        productos[3] = "Notebook";
        productos[4] = "Macbook";
        productos[5] = "Chromecast";
        productos[6] = "bicicleta";

        Arrays.sort(productos);

        System.out.println("productos = " + productos[0]);
        System.out.println("productos = " + productos[1]);
        System.out.println("productos = " + productos[2]);
        System.out.println("productos = " + productos[3]);
        System.out.println("productos = " + productos[4]);
        System.out.println("productos = " + productos[5]);
        System.out.println("productos = " + productos[6]);

        int[] numeros = new int[4];

        numeros[0] = 6;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = (int) -4L;
        numeros[3] = 4;
        //numeros[4] = 5 no se debe

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];
        //int n = numeros[4]; no se debe
        int h = numeros[numeros.length-1];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("h = " + h);

    }
}
