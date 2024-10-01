package tugasp5;

public class IMT {
    double bb; 
    double tb; 
    String kriteria; 
    double rumus; 

    void Perhitungan() {
        rumus = bb / (tb * tb);
        
        if (rumus < 18.5) {
            kriteria = "Berat badan kurang ideal";
        } else if (rumus >= 18.5 && rumus <= 24.9) {
            kriteria = "Berat badan ideal";
        } else if (rumus >= 25 && rumus < 29.9) {
            kriteria = "Berat badan lebih";
        } else if (rumus >= 30 && rumus <= 39.9) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat gemuk";
        }
    }

    void Output() {
        System.out.println("Berat badan anda : " + bb);
        System.out.println("Tinggi badan anda : " + tb);
        System.out.println("Nilai IMT anda : " + rumus);
        System.out.println("Kriteria anda : " + kriteria);
    }
}
