
import java.util.Scanner;

public class KelvollistenLukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int summa = 0;
        
        while (true){
            System.out.println("Syötä luku: ");
            int luettu = Integer.parseInt(lukija.nextLine());
            
            if (luettu == 9999) {
                break;
            }
            
            if (luettu >= -140 && luettu <= 20) {
                summa = summa + luettu;
                
            } else {
                System.out.println("Kelvoton luku.");
            }
        }
        System.out.println("Kelvollisten lukujen summa: " + summa);
    }
}
