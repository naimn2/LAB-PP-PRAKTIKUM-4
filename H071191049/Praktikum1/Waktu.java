import java.util.Scanner;
class Waktu{
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        int detik, jam, menit;
        System.out.print("masukan total detik = ");
        detik = key.nextInt();
        jam=detik/3600;
        detik=detik%3600;
        menit=detik/60;
        detik=detik%60;
        System.out.printf("%02d:%02d:%02d",jam,menit,detik);
    }
}