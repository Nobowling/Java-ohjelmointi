
import java.util.Scanner;

public class MarsinLampotilanKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int mitatutLampotilat = 0;
        int mittaustenSumma = 0;
        
        while (true) {
            
            System.out.print("Syötä mittaus: ");
            int mittaus = Integer.parseInt(lukija.nextLine());
            
            if (mittaus == 9999) {
                break;
            }
            
            if (mittaus >= -140 && mittaus <= 20) {
                mitatutLampotilat++;
                mittaustenSumma = mittaustenSumma + mittaus;
            }
        }
        
        System.out.println("Mittausten keskiarvo: " + (double) mittaustenSumma / (double) mitatutLampotilat);
                
    }
}
