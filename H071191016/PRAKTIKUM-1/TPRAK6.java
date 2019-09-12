import java.util.Scanner;
class TPRAK6{
    public static void main(String[] args) {
    Scanner yuk = new Scanner(System.in);
    int uang = yuk.nextInt();
    System.out.println("Uang ="+ uang);
    int uang1,uang2,uang3,uang4,uang5,uang6,uang7;
    uang1 = uang/100000;
    uang2 = uang/50000;
    uang3 = uang/20000;
    uang4 = uang/10000;
    uang5 = uang/5000;
    uang6 = uang/2000;
    uang7 = uang/1000;

    System.out.println("Seratus Ribu Rupiah ="+ uang1);
    System.out.println("Lima Puluh Ribu Rupiah ="+ uang2);
    System.out.println("Dua Puluh Ribu Rupiah ="+ uang3);
    System.out.println("Sepuluh Ribu Rupiah ="+ uang4);
    System.out.println("Lima Ribu Rupiah ="+ uang5);
    System.out.println("Dua Ribu Rupiah ="+ uang6);
    System.out.println("Seribu Rupiah ="+ uang7);

    yuk.close();
    }
}