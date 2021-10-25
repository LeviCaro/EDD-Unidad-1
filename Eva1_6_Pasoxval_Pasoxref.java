/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package eva1_6_pasoxval_pasoxref;


public class Eva1_6_Pasoxval_Pasoxref {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valOrig = 5;
        //Paso por valor
        System.out.println("ValOrig en el main = " + valOrig);
        incrementa (valOrig);
        //valOrig = incrementaQueSiFunciona (valOrig);
        System.out.println("ValOrig despues de llamar a incrementa = " + valOrig);
        //Demostracion de paso por referencia
        Prueba objPrueba = new Prueba();
        System.out.println("Valor de la x = " + objPrueba.x);
        System.out.println("ObjPrueba en el main = " + objPrueba);
        incrementaObj(objPrueba);
        System.out.println("Valor de la x despues de incrementa = " + objPrueba.x);
    }
    //Paso por valor --> Pasamos una copia del valor en una variable (Variables locales primitivos)
    public static void incrementa (int val){
        val++;//increento en uno val = val + 1; val +=1;
        System.out.println("Valor en incrementa = " + val);
    }
    //Paso por referencia --> Pasan por la direccion en la memmoria del objeto (Objetos)
    public static void incrementaObj (Prueba val){
        System.out.println("Objeto en incrementaObj = " + val);
        val.x++;
    }
}
class Prueba{
    public int x = 10;
}