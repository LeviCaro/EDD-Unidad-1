/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package eva1_16_arreglos_de_arreglos;


public class Eva1_16_Arreglos_De_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declara un arreglo de dos dimenciones:
        int[][] iMatriz = new int[3][3];
        System.out.println("Direccion de la matriz: " + iMatriz);
        System.out.println("Tamaño de la primera dimencion (filas): "+ iMatriz.length);
        for (int i = 0; i < iMatriz.length; i++) {//Filas
            System.out.println("iMatriz["+i+"]=" + iMatriz[i]);
        }
    }
    
}
