/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package eva1_4_heap;


public class Eva1_4_Heap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiClase obj = new MiClase();
        System.out.println(obj);//Imprimmos la referencia al objeto en el Heap
        MiClase obj2 = new MiClase();
        System.out.println(obj2);//Imprimmos la referencia al objeto en el Heap
        Eva1_4_Heap objHeap = new Eva1_4_Heap();
        System.out.println(objHeap);//Imprimmos la referencia al objeto en el Heap
    }
    

}

class MiClase{//Nuevo tipo de dato --> Tipos de datos abstractos 
    String mensaje;//Atributos --> Estado del objeto
    public MiClase(){//Metodos --> Comportamiento 
        mensaje = "Hola mundo";
    }
    
    public String getMensaje(){
        return mensaje;
    }
    public void setMensaje (String mensaje){
        this.mensaje = mensaje;
    }
    
}
