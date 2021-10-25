/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package eva1_14_copia_arreglos;


public class Eva1_14_Copia_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] iArreglo = new int[3];//12 bytes --> 3 enteros x 4 bytes
        System.out.println("Direcion de iArreglo = " + iArreglo);
        iArreglo [0] = 1000;
        iArreglo [1] = 2000;
        iArreglo [2] = 3000;
        //iArreglo [3] = 3; error: ArrayIndxOutOfBound --> Nos pasamos de los limites del arreglo
        for (int i = 0; i < iArreglo.length; i++){
            System.out.println("Cuenta " + i + " = $" + iArreglo[i]);
        }
        //Quiero una copia de los datos del arreglo
        //int[] iCopia = iArreglo; //Esto esta bien para crear una copia de arrego?
        int[] iCopia = new int[3];
        System.out.println("Direcion de iCopia = " + iCopia);
        for (int i = 0; i < iArreglo.length; i++){
            iCopia[i] = iArreglo[i];
        }
        iCopia[0] = 1000000;
        for (int i = 0; i < iCopia.length; i++){
            System.out.println("Cuenta (ICopia)" + i + " = $" + iCopia[i]);
        }
        for (int i = 0; i < iArreglo.length; i++){
            System.out.println("Cuenta (iArreglo)" + i + " = $" + iArreglo[i]);
        }    
    }
    
}
