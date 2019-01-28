
import java.util.Scanner;

public class VihjaavaArvauspeli {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // kun olet palauttanut tehtävän ja saanut siitä pisteet,
        // kokeile myös seuraavaa: 
        // int arvattava = (int) (1 + Math.random() * 100);

        int arvattava = 42;
        int arvaustenLukumaara= 0;

        System.out.println("Minäpä tiedän luvun väliltä 1-100, jota sinä et tiedä!");
        
        while (true){
            
            System.out.println("Arva luku: ");
            int arvaus = Integer.parseInt(lukija.nextLine());
            
            if (arvaus == arvattava) {
                arvaustenLukumaara++;
                break;
            }
            
            if (arvaus >= 1 && arvaus < 42){
                arvaustenLukumaara++;
                System.out.println("Lukuni on isompi!");
            } else if (arvaus > 42 && arvaus <= 100) {
                arvaustenLukumaara++;
                System.out.println("Lukuni on pienempi!");
            } else {
                System.out.println("Epäkelpo luku!");
            }    
        }
        
        System.out.println("Oikein! Arvausten lukumäärä: " + arvaustenLukumaara);

    }
}
