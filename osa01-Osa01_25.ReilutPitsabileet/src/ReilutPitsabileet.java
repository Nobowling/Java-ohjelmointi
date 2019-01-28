
import java.util.Scanner;

public class ReilutPitsabileet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Montako osallistujaa?");
        int osallistujaMaara = Integer.parseInt(lukija.nextLine());
        System.out.println("Montako pitsaa?");
        int pizzaMaara = Integer.parseInt(lukija.nextLine());
        System.out.println("Montako palaa per pitsa?");
        int palaaPerPizza = Integer.parseInt(lukija.nextLine());
        
        System.out.println("Paloja jää yli: " + (pizzaMaara * palaaPerPizza % osallistujaMaara));

    }
}
