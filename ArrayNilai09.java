import java.util.Scanner;

public class ArrayNilai09 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] nilaiAkhir = new int[10];

    for (int i = 0; i < 10; i++) {
        System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i+1) + " : ");
        nilaiAkhir[i] = input.nextInt();
    }

    for (int i = 0; i < 10; i++) {
        System.out.println("Nilai akhir mahasiswa ke-" + (i+1) + " adalah " + nilaiAkhir[i] );
        
        }
    }
}
