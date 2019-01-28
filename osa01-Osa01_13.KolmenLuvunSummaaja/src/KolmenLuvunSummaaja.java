
import java.util.Scanner;

public class KolmenLuvunSummaaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. Muista kysyä kolmea lukua käyttäjältä!
        System.out.println("Anna ensimmäinen luku:");
        int summa = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna toinen luku:");
        summa = summa + Integer.parseInt(lukija.nextLine());
        System.out.println("Anna kolmas luku:");
        summa = summa + Integer.parseInt(lukija.nextLine());
        System.out.println("Lukujen summa:" + summa);
    }
}
