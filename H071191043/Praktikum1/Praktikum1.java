import java.util.Scanner;
class Praktikum1{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan waktu tempuh (jam) = ");
        double t = in.nextDouble();
        System.out.println("Masukkan kecepatan Rata2 = ");
        double k = in.nextDouble();
        int efisiensi = 14;
        double hasil = (k * t) / efisiensi;
        System.out.printf("Jadi, jumlah bensin yang digunakan %.3f ", hasil);

            // ================> KODENYA AKAN LEBIH RAPI KALAU TIDAK BANYAK PEMBOROSAN BARIS YANG KOSONG
        in.close();   
    }
}
