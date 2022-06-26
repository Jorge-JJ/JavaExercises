import java.util.Scanner;

public class Main {
    /**
    Descripcion: Esta función recibe un dato e imprime del 1 al 10 su tabla de multiplicar
    @param dato: Ese es la el número que se le calculará su tabla de multiplicación
    */
    public static void multiplicar(int dato){
        int aux = dato;

        System.out.println("\tTabla del "+dato+"\n\n");
        for (int i=0; i<10; i++){
            if(i!=0)
                aux+=dato;
            System.out.println((i+1)+" x "+dato + " = "+aux);
        }
    }


    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int valor;
        System.out.print("Ingresa el número del cual deseas saber su tabla de multiplicar: ");
        valor = sn.nextInt();

        multiplicar(valor);
    }
}
