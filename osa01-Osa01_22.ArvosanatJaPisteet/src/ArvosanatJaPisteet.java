
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna pisteet [0-100]");
        int pistemaara = Integer.parseInt(lukija.nextLine());
        if (pistemaara < 0) {
            System.out.println("mahdotonta!");
        } else if (pistemaara <= 69) {
            System.out.println("hylätty");
        } else if (pistemaara <= 75){
            System.out.println("1");
        } else if (pistemaara <= 80) {
            System.out.println("2");
        } else if (pistemaara <= 85) {
            System.out.println("3");
        } else if (pistemaara <= 90) {
            System.out.println("4");
        } else if (pistemaara <= 100) {
            System.out.println("5");
        } else {
            System.out.println("uskomatonta!");
        }
    }
}
