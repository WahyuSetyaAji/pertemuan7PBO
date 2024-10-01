package tugasp5;
import java.util.Scanner;

public class IMTBeraksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IMT b1 = new IMT();
        System.out.println("Masukan berat badan anda (Kg) : ");
        b1.bb = scanner.nextDouble(); 
        
        System.out.println("Masukan tinggi badan anda (cm) : "); 
        b1.tb = scanner.nextDouble() / 100; 

        b1.Perhitungan();
        b1.Output();
    }
}
