import java.util.Scanner;
class Praktikum3{

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Ketinggian menara = ");
    double h = in.nextDouble();
    System.out.println("Sudut elevasi pengamat terhadap ujung belakang kapal = ");
    double a = in.nextInt();
    System.out.println("Sudut elevasi pengamat terhadap ujung belakang kapal = ");
    double b = in.nextDouble();

    double alas = Math.tan(Math.toRadians(a)) * h;
    double alas2 = Math.tan(Math.toRadians(b)) * h;
    double alas3 = alas - alas2;

    System.out.printf("Panjang kapal = %.1f m", alas3);


     
        // ================> KODENYA AKAN LEBIH RAPI KALAU TIDAK BANYAK PEMBOROSAN BARIS YANG KOSONG
    }
}
