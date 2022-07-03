/*
* El objetivo de este ejercicio es imprimir un cuadrado hueco en pantalla
* escribiendo el numero de espacios a utilizar
*
* Ejemplo: Cuadrado de 5 espcios
*
*   * * * * *
*   *       *
*   *       *
*   *       *
*   * * * * *
* */


import java.util.Scanner;

public class Main {
    static final String valores="* ";
    /**Funcion que dibuja un cuadrado vacio con borde
     * @param num numero de filas y columnas*/
    static void dibujar(int num){
        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                if(i ==0 || i==num-1 || j==0 || j==num-1) System.out.print(valores);
                else System.out.print("  ");
            }
            System.out.println();
        }
    }


    /**Dibuja un cuadrado con una "X" dentro
     * @param num numero de filas y columnas*/
    static void cuadradoX(int num){
        int aux=0;
        for (int i=0;i<num;i++){
            for (int j=0;j<num;j++){
                if(i==0 ||i==num-1 || j==0 || j==num-1 || j==aux ||j==num-aux-1) System.out.print(valores);
                else System.out.print("  ");
            }
            System.out.println();
            aux++;
        }
    }


    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int num;
        System.out.print("Ingrese el número de asteriscos: ");
        num=sn.nextInt();

        dibujar(num);
        cuadradoX(num);
    }
}
