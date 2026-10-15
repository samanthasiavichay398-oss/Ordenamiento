
public class App {
    public static void main(String[] args) throws Exception {
       

        int[] original = {5, 3, 4, 1, 2};
        int[] b = original.clone();
        int[] c = original;

        //USAR EL METODO DEl ARCHIVO (CLASE) BUBBLE 
        //INSTANCIAR el archivo BUBBLE
        //INSTANCIAR la clase BUBBLE
        Bubble bubble = new Bubble();
        //EJECUTAR CODIGO DEL ARCHIVO
        //EJETUCAR CODIGO DEL ARHIVO BUBBLE USO LA INSTANCIA 
        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);


    }
     public static void printArreglo(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " - ");
        }
        System.out.println();

       

    }
}