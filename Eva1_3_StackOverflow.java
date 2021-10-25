/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package eva1_3_stackoverflow;


public class Eva1_3_StackOverflow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A();
    }
    
    public static void A(){
        B();
    }
    public static void B(){
        A();
    }
    
}
