public class EjemploArreglosCombinados {
    public static void main(String[] args) {
        int[] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            b[i] = (i + 1) * 5;
        }
        int aux =0;
        for (int i = 0; i < a.length; i++) {
            c[aux++] = a[i];
            c[aux++] = b[i];
        }


        for (int i = 1; i <= c.length; i++) {
            System.out.println(i + " : " + c[i-1    ]);
            }
        }
    }


