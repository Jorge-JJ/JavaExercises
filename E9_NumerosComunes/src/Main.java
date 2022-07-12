import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /**Funcion que genera arreglos
     * @param tamanio Tamaño del arreglo a crear
     * @return Arreglo con valores solicitados*/
    static int [] agregarValores(int tamanio){
        Scanner sn = new Scanner(System.in);
        int []val = new int[tamanio];

        for(int i=0;i<tamanio;i++){
            System.out.print("Ingrese valor "+(i+1)+": ");
            val[i]=sn.nextInt();
        }
        return val;
    }


    /**Compara los valores de dos cadenas
     * @param arr1 Recibe el primer arreglo a comparar
     * @param arr2 Recibe el segundo arreglo a comparar*/
    static void comparacion(int[]arr1,int[]arr2){
        ArrayList<Integer> aux= new ArrayList<>();
        int k=0;

        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j) {
                    if (aux.size() == 0) {
                        aux.add(i);
                    } else {
                        while (k < aux.size() && aux.get(k) != i) {
                            if (k == aux.size() - 1) {
                                aux.add(i);
                            }
                            k++;
                        }
                    }
                }
                k = 0;
            }
        }

        System.out.println(aux);
        System.out.println("Tamaño del arreglo: "+aux.size());
    }


    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int tamanio;

        System.out.print("Ingrese el tamaño del arreglo 1: ");
        tamanio=sn.nextInt();
        int []arr1 = agregarValores(tamanio);

        System.out.print("Ingrese el tamaño del arreglo 2: ");
        tamanio=sn.nextInt();
        int []arr2 = agregarValores(tamanio);

        comparacion(arr1,arr2);
    }
}
