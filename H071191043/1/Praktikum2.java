import java.util.Scanner;
class Praktikum2{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Total Detik = ");
        int total_detik = in.nextInt();
        int jam = total_detik / 3600;
        int sisa1 = total_detik % 3600;
        int menit = sisa1 / 60;
        int detik = sisa1 % 60;

        // System.out.println(jam + " : " + menit + " : " + detik);
        System.out.printf("%02d:%02d:%02d", jam, menit, detik);

        in.close();
    }
}