/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package eva1_21_arreglo_objeto;

import java.util.Scanner;


public class Eva1_21_Arreglo_Objeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Persona[] aPersonas = new Persona[10];//Arreglo tamaño 10 que almacena objetos tipo persona
        //Para usar un objeto, deben crearlo
        //Para crear un objeto usan new
        //Si no lo crean, no existe
        for (int i = 0; i < aPersonas.length; i++) {
            aPersonas[i] = new Persona();//Creo un objeto de tipo persona en la posicion i
            System.out.println("Introduce un nombre: ");
            String nombre = input.nextLine();
            aPersonas [i].setNombre(nombre);
        }
        for (int i = 0; i < aPersonas.length; i++) {
            System.out.println("Nombre: " + aPersonas[i].getNombre());
        }
    }
}
class Persona{
    private String nombre;
        
    public String getNombre(){
        return nombre;  
    }    
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
}
