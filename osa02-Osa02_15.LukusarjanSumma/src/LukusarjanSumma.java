
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        
        System.out.print("Mihin asti? ");
        int luku = Integer.parseInt(lukija.nextLine());
        
        int i = 0;
        int summa = 0;
        
        while (i <= luku) {
            summa = summa + i;
            i++;
        }
        
        System.out.println("Summa on " + summa);
    }
}
