/**
 * Se desea escribir un número e invertir sus valores, por ejemplo:
 * Numero ingresado: 79
 * Numero impreso: 97
 * */
import java.util.Scanner;

public class Main {
    /**Invierte un numero y lo retorna a la función donde se declara
     * @param valor recibe un valor de tipo Integer
     * @return Valor procesado en tipo primitivo "int"*/
    static int invertir(Integer valor){
        String val="", aux="";
        int cont=0;
        if(valor<0){
            cont++;
            valor=valor*(-1);
        }
        val=valor.toString();

        for (int i=val.length() ; i>0 ; i--){
            if(cont==1 &&i==val.length()){
                aux+="-";
            }
            aux+=val.charAt(i-1);
        }
        valor=Integer.parseInt(aux);
        return valor;
    }


    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        Integer valor = sn.nextInt();

        valor=invertir(valor);
        System.out.println(valor);
    }
}