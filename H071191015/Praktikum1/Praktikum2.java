import java.util.Scanner;
class Praktikum2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int detik = input.nextInt();

        int jam = detik/3600 ;
        int sisa1 = detik%3600 ;

        int menit = sisa1/60 ;
        int sisa2 = sisa1%60 ;      // TIDAK PERLU 2 VARIABEL SISA BISA CUMA 1

        System.out.println(jam + " Jam" + " " + menit + " Menit" + " " + sisa2 + " Detik" );  // FORMAT JAM YANG TEPAT ITU 06:00:00
        input.close();

    }
}
