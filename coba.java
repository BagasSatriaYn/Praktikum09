import java.util.Scanner;

public class ArrayNilai09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];
        double total = 0;
        double rataRata;

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

            rataRata = total/nilaiAkhir.length;
            System.out.println("Rata-rata nilai = " +rataRata);
        }
    }
}
