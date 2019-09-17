import java.util.Scanner;
class TPRAK1{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    //t = Waktu
    int v = sc.nextInt();
    // v = Rata-rata Kecepatan
    double efisiensi = 14;
    double jumlahBensin = t*v/14; // jarak = t*v

    System.out.println("t = "+ t);
    System.out.println("v = "+ v);
    System.out.printf("Jumlah Bensin = %.3f L", jumlahBensin);
    }
}