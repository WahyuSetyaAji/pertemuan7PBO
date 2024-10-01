package tugasp5;
import java.util.Scanner;

public class PembelianBeraksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        Pembelian p1 = new Pembelian();
        System.out.println("Masukan total pembelian : Rp. ");
        p1.totalPembelian = scanner.nextDouble();
        
        p1.Perhitungan();
        p1.Output();
	}
}
