/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package eva1_15_matriz;


public class Eva1_15_Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //crear un arreglo de do dimensiones 5 filas x 3 columnas (puros enteros)
        int iMatriz[][] = new int[5][3];
        //Acceder a un elemento
        iMatriz[0][0] = 1000;//Primer posicion
        iMatriz[4][2] = 2000;//Ultima 
        System.out.println("Tamaño del arreglo: " + iMatriz.length);
        //Ciclo x cada dimension
        //Ciclo anidados (ciclo dentro de otro ciclo)
        for (int i = 0; i < iMatriz.length; i++){//Filas iMatriz.length
            for (int j = 0; j < 3; j++){//Columnas
                iMatriz[i][j] = 1000;
            }
        }
        for (int i = 0; i < iMatriz.length; i++){//Filas iMatriz.length
            for (int j = 0; j < 3; j++){//Columnas
                System.out.println("[" + iMatriz[i][j] + "]");   
                }
                System.out.println("");
            }        
        }
    
    }
