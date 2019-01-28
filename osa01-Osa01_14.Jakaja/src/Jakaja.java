
import java.util.Scanner;

public class Jakaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. Muista kysyä luvut käyttäjältä!
        System.out.print("Anna ensimmäinen luku: ");
        int osoittaja = Integer.parseInt(lukija.nextLine());
        System.out.print("Anna toinen luku: ");
        int nimittaja = Integer.parseInt(lukija.nextLine());
        double osamaara = 1.0 * osoittaja / nimittaja;
        System.out.print("Jakolasku: " + osoittaja + " / " + nimittaja + " = " + osamaara);
    }    
}

