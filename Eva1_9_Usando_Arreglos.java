/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package eva1_9_usando_arreglos;


public class Eva1_9_Usando_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1. Un arreglo de enteros
        int[] aiDatos = new int[10];
        //2. LLenar con valores
        //Arreglo: estructura de accesp aleatorio
        //indice:
        // Primer elemento del arreglo: posicion 0
        // Ultimo elemento del arreglo: posicion N - 1 (N es el tamaño del arreglo
        //Acceso a los valoeres:
        
        for (int i = 0; i < 10; i++){
                          //cating --> convetimos doubles a enteros
            aiDatos[i] = (int)(Math.random() * 100);//Random --> valoeres entre 0.0 y 1.0 x 100 (valores entre 0 y 1)
        }
        //3. Imprimir los valoeres
        for (int i = 0; i < 10; i++){//Random --> valoeres entre 0.0 y 1.0 x 100 (valores entre 0 y 1)
            System.out.println("[" + aiDatos[i] + "]");
            
        }
    }
    
}
