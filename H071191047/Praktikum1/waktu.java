import java.util.Scanner;
class Waktu{
    public static void main(String[] args) {
        Scanner fok = new Scanner(System.in);
        int jam,menit,detik;
        System.out.println("input detik =");
        detik = fok.nextInt();
        jam=detik/3600;
        detik=detik-(jam*3600);     // INI LEBIH EFISIEN JIKA DITULIS MENJDAI "detik % 3600"
        menit=detik/60;
        detik=detik-(menit*60);     // INI JUGA "detik % 60"
        System.out.printf("%02d:%02d:%02d" ,jam,menit,detik);
    }
}
