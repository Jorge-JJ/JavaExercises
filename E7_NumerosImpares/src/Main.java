/**
 * Este programa debe contar el valor de números imares que hay entre
 * un intervalo de números
 * */
import java.util.Scanner;

public class Main {
    /**
     * Cuenta el numero de valores impares en un intervalo
     *
     * @param num1 Numero menor del intervalo
     * @param num2 Numero mayor del intervalo
     */
    static void impar(int num1, int num2) {
        int contador = 0;
        if (num1 == num2) {
            System.out.println("Los numeros son iguales no hay numero de veces impares");
        } else {
            if (num1 > num2) {
                System.out.println("Error, se cambiara el orden de valores");
                int aux = num1;
                num1 = num2;
                num2 = aux;
            }
            for (int i = num1; i <= num2; i++) {
                if (i != 0) {
                    if (i % 2 != 0) {
                        contador++;
                    }
                }
            }
            System.out.println("Numero de valores impares en el intervalo es de " + contador);
        }
    }


    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Ingrese el numero más chico del rango deseado: ");
        int num1 = sn.nextInt();
        System.out.print("Ingrese el número más alto del rango deseado: ");
        int num2 = sn.nextInt();

        impar(num1,num2);
    }
}
