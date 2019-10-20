import java.util.Scanner;
class TugasPraktkum5{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n = in.nextFloat();
        int hari = 24 * 3600;
        int detik = Math.round((n/360)*hari); // konversi derajat ke detik
        System.out.println(detik);
        int jam = 6;
        int menit = 0;

        // while (detik >= 3600){
        //     detik -= 3600;
        //     jam++;
        // }
        // while (detik >= 60){
        //     detik -= 60;
        //     menit++;
        // }
        // jam %= 24;
        // if (jam >= 5 && jam <= 12){
        //     System.out.println("Selamat Pagi");
        // } else if (jam >= 12 && jam <= 14){
        //     System.out.println("Selamat Siang");
        // } else if (jam >= 15 && jam <= 18){
        //     System.out.println("Selamat Sore");
        // } else {
        //     System.out.println("Selamat Malam");
        // }
        // System.out.printf("%02d : %02d : %02d" , jam, menit, detik);
    }
}