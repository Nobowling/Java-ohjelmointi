
import java.util.Scanner;

public class TyontekijanElakevakuutus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
    
        System.out.println("Syötä bruttopalkka:");
    
        double bruttopalkka = Integer.parseInt(lukija.nextLine());
        double tyonAntajanTyelMaksu = 0.18 * bruttopalkka;
        double tyonTekijanTyelMaksu = 0.06 * bruttopalkka;

        System.out.println("Työnantaja maksaa TyEL-maksuja: " + tyonAntajanTyelMaksu);
        
        System.out.println("Työntekijän kustannus työnantajalle vähintään: " +
                (bruttopalkka + tyonAntajanTyelMaksu));
        
        System.out.println("Työntekijä maksaa TyEL-maksuja: " + 
                tyonTekijanTyelMaksu);
    
        System.out.println("Työntekijän palkka TyEL-maksun jälkeen: " + 
                (bruttopalkka - tyonTekijanTyelMaksu));
    
        System.out.println("TyEL-kulut yhteensä: " + (tyonAntajanTyelMaksu + 
                tyonTekijanTyelMaksu));
    
    }
}
