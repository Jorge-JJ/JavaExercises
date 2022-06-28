import java.util.Scanner;

public class Main {

    /**Funcion que calcula el porcentaje de un producto
     * @param precio Es el costo de un producto/servicio
     * @param porcentaje El porcenteje se puede expresar de forma decimal o con punto decimal*/
    static void porcentajes(float precio, float porcentaje){
        float resultado;

        if(porcentaje<=0 || precio<=0 || porcentaje>100)
            System.out.println("Valor no aceptado");
        else if (porcentaje>1)
            porcentaje = porcentaje / 100;

        if(porcentaje>0 && precio>0 && porcentaje<=1) {
            resultado = precio * porcentaje;
            System.out.println("El " + porcentaje * 100 + "% de " + precio + " es: " + resultado);
            System.out.println("Precio final: " + (precio - resultado));
        }
    }


    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        float valor, precio;

        System.out.print("Ingrese un precio: ");
        precio=sn.nextFloat();
        System.out.print("Ingrece el porcentaje de descuento: ");
        valor=sn.nextFloat();

        porcentajes(precio,valor);
    }
}
