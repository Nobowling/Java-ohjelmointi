
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
  
        System.out.print("Mihin asti? ");
        int ylaraja = Integer.parseInt(lukija.nextLine());
        
        System.out.print("Mistä lähtien? ");
        int alaraja = Integer.parseInt(lukija.nextLine());
        
        while (alaraja <= ylaraja) {
            System.out.println(alaraja);
            alaraja++;
        }
    }
}
