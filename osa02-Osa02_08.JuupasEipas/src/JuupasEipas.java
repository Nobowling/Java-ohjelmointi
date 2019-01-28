
import java.util.Scanner;

public class JuupasEipas {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

            
        while (true) {
            System.out.println("Anna luku: ");
            int luku = Integer.parseInt(lukija.nextLine());
                
            if (luku == 0) {
                break;
            }
                
            if (luku > 0) {
                System.out.println("Juupas");
            }
                
            if (luku < 0) {
                System.out.println("Eipäs");
            } 
        }  
            
    }
}
