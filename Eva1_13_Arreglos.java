/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package eva1_13_arreglos;


public class Eva1_13_Arreglos {

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
        //Creamos una nueva varable de tipo arreglo
        int[] iCopia = iArreglo;
        System.out.println("Direccion de iCopia = " + iCopia);
        for (int i = 0; i < iCopia.length; i++){
            System.out.println("Cuenta (iCopia) " + i + " = $" + iCopia[i]);
        }
        iArreglo = new int[2];
        System.out.println("Direcion de iArreglo modificado = " + iArreglo);
        for (int i = 0; i < iArreglo.length; i++){
            System.out.println("Cuenta Modificada " + i + " = $" + iArreglo[i]); 
        }
        for (int i = 0; i < iCopia.length; i++){
            System.out.println("Cuenta (iCopia) " + i + " = $" + iCopia[i]);
        }
    }    
}
