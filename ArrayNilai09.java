import java.util.Scanner;

public class ArrayNilai09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];
        double total = 0;
        double nilaiTertinggi, nilaiTerendah;
        

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i + 1) + " : ");
            nilaiAkhir[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Nilai akhir mahasiswa ke-" + (i+1) + " lulus ");
            } else  { 
                System.out.println("Nilai akhir mahasiswa ke-" + (i+1) + " tidak lulus");

            }

        for (int i = 1; i < 10; i++) {
            if (nilaiAkhir[i] > 70 ) {
                nilaiTertinggi = nilaiAkhir[i];
            }

            if (nilaiAkhir[i] < nilaiTerendah) {
                nilaiTerendah = nilaiAkhir[i];
            }

            total += nilaiAkhir[i];
        }

            double rataRata = (double) total / 10;

            System.out.println(" Nilai tertinggi : " + nilaiTertinggi);
            System.out.println("Nilai terendah : " + nilaiTerendah);
            System.out.println(" Nilai rata-rata " + rataRata);
        }
    }
}
