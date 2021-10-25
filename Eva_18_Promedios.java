/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package Eva1_18_Promedios;

import java.util.Scanner;


public class Eva_18_Promedios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int [][] aiGrupos;
        //Preguntar al usuario grupos
        System.out.println("¿cuantos grupos son?");
        int iNoGrupos = input.nextInt();
        
        //Los grupos representan las fils
        aiGrupos = new int[iNoGrupos][];
        for (int i = 0; i < aiGrupos.length; i++) {
            System.out.println("Para el grupo " + i + "¿cuantos grupos son?");   
            int iNoEstu = input.nextInt();
            aiGrupos[i] = new int [iNoEstu];
        }
        //Vamos a preguntar las edades
        for (int i = 0; i < aiGrupos.length; i++) {//Primer dimension fila grupos
            for (int j = 0; j < aiGrupos[i].length; j++){//segunda dimension, para cada rupo, cuantos alumnos hay
                System.out.print("[" + "]");
            }
            System.out.println("");
        }
    }
    
}
