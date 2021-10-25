/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package Eva1_20_Dimensiones;


public class Eva1_20_4_Dimensiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][][][] iTese = new int [5][3][2][6];
        //Cantos enteros almacena? = 180 enteros
        for (int i = 0; i < iTese.length; i++) {//Primer dimension
            for (int j = 0; j < iTese[i].length; j++) {//Segunda
                for (int k = 0; k < iTese[i][j].length; k++) {//Tercera
                    for (int l = 0; l < iTese[i][j][k].length; l++) {//Cuarta
                        iTese[i][j][k][l] = 100;
                    }
                }
            }
        }    
    }
    
}
