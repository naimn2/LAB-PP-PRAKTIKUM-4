import java.util.Scanner;
class TPRAK2{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jam,menit,detik;
    detik = sc.nextInt();
    System.out.println("Masukkan Detik ="+ detik);
    jam = detik/3600;
    detik = detik - (jam*3600); // a % b ==> a - (x*b);
    menit = detik / 60;
    detik = detik - (menit*60);
    
    System.out.printf("%02d:%02d:%02d", jam,menit,detik);
    }
        
    }