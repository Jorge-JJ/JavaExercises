import java.util.Locale;
import java.util.Scanner;

public class Main {
    /**Función que invierte una cadena de texto previamente enviada
     * @param cadena Cadena previamente tratada y sin espaciados
     * @return Cadena de texto invertida*/
    public static String invertir(String cadena){
        String invertida="";
        for(int i=cadena.length()-1;i>=0;i--){
            invertida += cadena.charAt(i);
        }
        return invertida;
    }


    public static void palindromo(String palabra){
        String palabra2,aux=palabra;
        palabra=palabra.toLowerCase();
        palabra=palabra.replace(" ", "");

        palabra2=invertir(palabra);
        if(palabra.equals(palabra2))
            System.out.println("La oración  \'"+aux+"'  es un palíndromo");
        else
            System.out.println("La palabra  \'"+aux+"\'  no es un palindromo");

    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String palabra;

        System.out.print("Ingresa una oración: ");
        palabra = sn.nextLine();

        palindromo(palabra);
    }
}
