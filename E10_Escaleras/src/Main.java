import java.util.Scanner;

public class Main {

    /**Genera una sucesion de caracteres con base en la linea que se encuentre
     * @param tam Tamaño de la susecion
     * @param caracter Caracter con el que se hará la sucesion
     * @return Matriz con caracteres*/
    static char[][] escaleras(int tam,char caracter){
        char [][]matrix=new char[tam][tam];
        for(int i=0;i<tam;i++){
            for (int j=0;j<tam;j++){
                if(j<=i) matrix[i][j]=caracter;

                else matrix[i][j]=' ';
            }
        }
        return matrix;
    }


    /**Genera un pino o unas escaleras
     * @param tam Tamaño de la mitad del vector
     * @param caracter Caracer con el que se hará el pino*/
    static void escalerasDobles(int tam, char caracter){
        int i, j,k=tam-1;

        char aux[][]=escaleras(tam,caracter);
        char [][]inveritda=new char[tam][tam];
        char [][]dobles = new char[tam][tam*2];
        for (i=0;i<tam;i++){
            for (j=0;j<tam;j++){
                inveritda[i][j] = aux[i][k];
                k--;
            }
            k=tam-1;
        }

        for (i=0;i<tam;i++){
            for (j=0;j<tam;j++){
                dobles[i][j]=inveritda[i][j];
                dobles[i][j+tam]=aux[i][j];
            }
        }

        for (i=0; i<tam;i++){
            for (j=0;j<tam*2;j++){
                System.out.print(dobles[i][j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int tam;
        char caracter;
        char escale[][];

        System.out.print("Ingrese el número de escaleras: ");
        tam=sn.nextInt();
        System.out.print("Ingrese el caracter con el que desea hacer la escalera: ");
        caracter=sn.next().charAt(0);

        escalerasDobles(tam,caracter);
    }
}