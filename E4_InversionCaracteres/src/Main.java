import java.util.Scanner;

public class Main {

    /**Funcion que invierte textos
     * @param cadena Texto que se invertirá*/
    static void invertir(String cadena){
        String invertida="";
        for(int i=0;i<cadena.length();i++){
            invertida=cadena.charAt(i)+invertida;;
        }
        System.out.println("Cadena invertida: "+invertida);
    }


    public static void main(String[] args) {
        String cadena;

        Scanner sn = new Scanner(System.in);
        System.out.println("Ingresa un texto: ");
        cadena=sn.nextLine();
        invertir(cadena);
    }
}
