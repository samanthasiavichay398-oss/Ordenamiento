
import java.util.Arrays;
import models.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
        //runEjemplosPrimitivos();
        runEjemplosObjetos();
        runComparators();
    }

    private static void runComparators() {
        int[] original = {5, 6, 4, 1, 2, 3};
        // Arrays.sort -> ORDENA ARREGLOS POR SU ORDEN NATURAL
        Arrays.sort(original);
        printArreglo(original);
    }

    private static void runEjemplosObjetos() {
        Estudiante e1 = new Estudiante("Juan", 10);

        Estudiante[] estudiantes = {
            e1,
            new Estudiante("Maria", 7),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 6.8)
        };

        Bubble bubble = new Bubble();
        printArregloEst(estudiantes, "original");
        bubble.sortEstudianteNota(estudiantes);
        printArregloEst(estudiantes, "ordenado");
    }

    public static void runEjemplosPrimitivos() {
        int[] original = {5, 6, 4, 1, 2, 3};
        int[] b = original.clone();
        int[] c = original.clone();
        int[] d = original.clone();

        // Bubble Sort
        System.out.println("Bubble");
        Bubble bubble = new Bubble();
        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);

        // Selection Sort
        System.out.println("Selection");
        Selection selection = new Selection();
        printArreglo(c);
        selection.sort(c);
        printArreglo(c);

        // Insertion Sort
        System.out.println("Insertion");
        InsertionSort insertion = new InsertionSort();
        printArreglo(d);
        insertion.sort(d);
        printArreglo(d);
    }

    public static void printArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " - ");
        }
        System.out.println();
    }

    public static void printArregloEst(Estudiante[] estudiantes, String title) {
        System.out.println(title);
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.print(estudiantes[i] + " - ");
        }
        System.out.println();
    }
}
