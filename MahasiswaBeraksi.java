package tugasp5;
import java.util.Scanner;

public class MahasiswaBeraksi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Mahasiswa m1 = new Mahasiswa();
        
        System.out.println("Masukan npm mahasiswa : ");
        m1.npm = scanner.nextLine();
        
        System.out.println("Masukan nama mahasiswa : ");
        m1.nama = scanner.nextLine();
        
        System.out.println("Masukan nilai kehadiran mahasiswa : ");
        m1.absen = scanner.nextDouble();
        
        scanner.nextLine();
        
        System.out.println("Masukan nilai tugas mahasiswa : ");
        m1.nilaiTugas = scanner.nextDouble();
        
        scanner.nextLine();
        
        System.out.println("Masukan nilai UTS mahasiswa : ");
        m1.nilaiUTS = scanner.nextDouble();
        
        scanner.nextLine();
        
        System.out.println("Masukan nilai UAS mahasiswa : ");
        m1.nilaiUAS = scanner.nextDouble();
        
        scanner.nextLine();

        m1.Perhitungan();
        m1.DataInfo(); 
    }
}
