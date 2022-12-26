import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {

        double[] matematicas, historia, lengua;
        matematicas = new double[7];
        historia = new double[7];
        lengua = new double[7];
        double sumaMatematicas = 0, sumaHistoria = 0, sumaLengua = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 7 notas de estudiantes para matematicas");
        for (int i = 0; i < historia.length; i++) {
            matematicas[i] = scanner.nextDouble();
            sumaMatematicas += matematicas[i];
        }
        System.out.println("Ingrese 7 notas de estudiantes para historia");
        for (int i = 0; i < historia.length; i++) {
            historia[i] = scanner.nextDouble();
            sumaHistoria += historia[i];
        }
        System.out.println("Ingrese 7 notas de estudiantes para lengua");
        for (int i = 0; i < historia.length; i++) {
            lengua[i] = scanner.nextDouble();
            sumaLengua += lengua[i];
        }
        System.out.println("Promedio notas matematicas de la clase: " + (sumaMatematicas / matematicas.length));
        System.out.println("Promedio notas historia de la clase: " + (sumaHistoria / matematicas.length));
        System.out.println("Promedio notas literatura de la clase: " + (sumaLengua / matematicas.length));
        System.out.println("Pormedio de toda la clase: " + ((sumaMatematicas + sumaLengua + sumaHistoria) / (matematicas.length * 3)));

        System.out.println("Ingrese el id del alumno que quiere saber las notas");
        int id = scanner.nextInt();
        double promedioAlumno = (matematicas[id] + historia[id] + lengua[id]) / 3;
        System.out.println("El alumno " + id + ", tiene un promedio de: " + promedioAlumno);
        System.out.println("En literatura tiene: " + lengua[id]);
        System.out.println("En historia  tiene: " + historia[id]);
        System.out.println("En matematicas  tiene: " + matematicas[id]);

    }
}
