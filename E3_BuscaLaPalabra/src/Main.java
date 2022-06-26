import java.util.Scanner;

public class Main {

    /**Fucion que verifica si una palabra/oracion es un palindromo
     * @param texto Texto que se evaluara si es palindromo*/
    static void invertirPalabra(String texto){
        String aux="";
        texto=texto.toLowerCase();
        texto=texto.replace(" ","");
        for (int i=texto.length()-1;i>=0;i--){
            aux+=texto.charAt(i);
        }
        if (aux.equals(texto))
            System.out.println("Es un palindromo");
        else
            System.out.println("No es un palindromo");
    }


    /**Funcion que sirve para contar cuantas palabras iguales hay en un texto
     * @param texto sentencia en la que se buscarara una palabra
     * @param palabra letra/palara que se contara las veces que se utiliza*/
    static void buscarPalabra(String texto, String palabra){
        int cont=0,aux2=0;
        texto=texto.toLowerCase();
        palabra=palabra.toLowerCase();

        for (int i=0;i<texto.length();i++){
            if(texto.charAt(i)==palabra.charAt(cont)){
                while (cont<palabra.length() && palabra.charAt(cont)==texto.charAt(i)){
                    if(cont==(palabra.length()-1) && palabra.charAt(cont)==texto.charAt(i)){
                        aux2++;
                    }
                    cont++;
                    i++;
                }
                cont=0;
            }
        }
        System.out.println("Numero de veces que se encuentra \""+palabra+"\" "+"son: "+aux2);
    }


    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        String texto, palabra;
        System.out.print("Ingresa un texto: ");
        texto=sn.nextLine();
        System.out.print("Escribe que palabra deseas buscar ");
        palabra=sn.nextLine();

        buscarPalabra(texto,palabra);
        invertirPalabra(texto);
    }
}
