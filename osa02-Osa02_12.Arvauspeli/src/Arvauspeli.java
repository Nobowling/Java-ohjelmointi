
import java.util.Scanner;

public class Arvauspeli {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int arvattava = 7;
        int arvaustenLukumaara = 0;

        System.out.println("Minäpä tiedän luvun väliltä 1-10, jota sinä et tiedä!");
        
        while (true) {
        
            System.out.println("Arvaa luku: ");
            int arvaus = Integer.parseInt(lukija.nextLine());
            
            if (arvaus == arvattava) {
                arvaustenLukumaara++;
                break;
            }
            
            if (arvaus >= 1 && arvaus<= 10) {
                arvaustenLukumaara++;
                System.out.println("Ei ollut!");
            } else {
                System.out.println("Epäkelpo luku!");
            }   
        }
        
        System.out.println("Oikein! Arvauksia yhteensä: " + arvaustenLukumaara);

    }
}
