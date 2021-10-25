/**
 *
 * @author Daniel Levi Caro Alvarado 
 */
package eva1_11_ejemplo_arreglos;

import java.util.Scanner;


public class Eva1_11_Ejemplo_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Primero prguntar el tamaño del grupo:
        Scanner input = new Scanner (System.in);
        System.out.println("Indica el tamaño del grupo:");
        int iTama = input.nextInt();
        int aiEdades[] = new int[iTama];//Daclarar un arreglo, tamaño iTama
        for (int i = 0; i < aiEdades.length; i++){//Desde el primer elemento (Cero) al ultimo (N - 1)
            System.out.println("Edad:");
            aiEdades[i] = input.nextInt();
        }
        //Acumulador
        int iAcum =0;
        for (int i = 0; i < aiEdades.length; i++){//Desde el primer elemento (Cero) al ultimo (N - 1)
            System.out.println("[" + aiEdades[i] + "]");
            iAcum = iAcum + aiEdades[i];
            
        }
        double dProm = iAcum / (double)iTama;//aiEdades.length;
        System.out.println("Promedio:" + dProm);

    }
    
}
