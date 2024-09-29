import java.util.Scanner;

public class KompleksitasAlgoritmaSesi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan bilangan : ");
        int bilangan = scanner.nextInt();
        int hasil = hitungPangkatDua(bilangan);
        System.out.println("Hasil " + bilangan + " pangkat 2 adalah " + hasil);
    }   

    public static int hitungPangkatDua(int n) {
        int hasil = 0;
        for (int i = 0; i < n; i++) {
            hasil += n;
        }
        return hasil;
    }
}  

// Analasis Kompleksitas Algoritma
/*
 * 1. Waktu : O(n), n adalah bilangan yang dimasukan dan program melakukan iterasi sebanyak n kali
 * 2. Ruang : O(1), karna hanya menggunakan variabel untuk menyimpan hasil
 */

 //Simulasi Perhitungan
 /*
  * Jika kita memasukan bilangan, maka program akan melakukan iterasi sebanyak bilangan yang dimasukan.S
  */