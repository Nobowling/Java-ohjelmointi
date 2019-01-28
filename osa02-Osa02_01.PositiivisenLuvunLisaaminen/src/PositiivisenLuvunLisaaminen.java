
import java.util.Scanner;

public class PositiivisenLuvunLisaaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna luku:");
        int luettu = Integer.parseInt(lukija.nextLine());
        
        System.out.println("Anna toinen luku:");
        int luettu2 = Integer.parseInt(lukija.nextLine());
        
        if (luettu2 > 0) {
            
            System.out.println("Summa: " + (luettu + luettu2));
        } else {
            System.out.println("Summa: " + luettu);
        }
       
    }
}