
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Ensimmäinen: ");
        int alku = Integer.parseInt(lukija.nextLine());
        System.out.print("Viimeinen: ");
        int loppu = Integer.parseInt(lukija.nextLine());
        
        int summa = 0;
        
        while (alku <= loppu) {
            summa = summa + alku;
            alku++;
        }
        
        System.out.println("Summa on " + summa);
    }
}
