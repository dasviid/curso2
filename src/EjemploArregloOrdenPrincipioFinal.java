public class EjemploArregloOrdenPrincipioFinal {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] a = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        int j = 0;
        int total = numeros.length;
        for (int i = 0; i < total - i; i++) {
            System.out.print(numeros[i] + " ");
            System.out.println(numeros[total - 1 - i]);

            a[j++] = numeros[i];
            a[j++] = numeros[total - 1 - i];
        }
        for (int i = 0; i < total; i++) {
            System.out.println("a = " + a[i]);
        }
    }
}
