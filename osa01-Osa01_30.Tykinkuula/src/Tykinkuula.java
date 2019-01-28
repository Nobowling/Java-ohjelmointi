
import java.util.Scanner;

public class Tykinkuula {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        
        int sekunteja = 0;
        double korkeus = 0;
        double suurinkorkeus = 0;
        
        System.out.println("Syötä tykinkuulan lähtönopeus: ");
        double nopeus = Double.parseDouble(lukija.nextLine());
        System.out.println("Syötä painovoima: ");
        double painovoima = Double.parseDouble(lukija.nextLine());

        
        while (true) {
            if (korkeus < 0){
                break;
            }
            
        
            if (korkeus > suurinkorkeus) {
                suurinkorkeus = korkeus;
            }
            
            korkeus = korkeus + nopeus;
            sekunteja = sekunteja + 1;
            nopeus = nopeus - painovoima;
        
            System.out.println("");
            System.out.println(sekunteja + "\t" + korkeus + "\t" +nopeus);
        }

        System.out.println("");
        System.out.println("Tykinkuulan suurin korkeus oli " + suurinkorkeus);
    }
}
