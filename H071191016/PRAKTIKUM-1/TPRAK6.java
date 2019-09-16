import java.util.Scanner;
class TPRAK6{
    public static void main(String[] args) {
    Scanner yuk = new Scanner(System.in);
    int uang = yuk.nextInt();
    System.out.println("Uang ="+ uang);
    int uang1,uang2,uang3,uang4,uang5,uang6,uang7,uang8,uang9,uang10,uang11,uang12,uang13,uang14;
    uang1 = uang/100000;
    uang2 = uang % 100000;
    uang3 = uang2 / 50000;
    uang4 = uang2 % 50000;
    uang5 = uang4 / 20000;
    uang6 = uang4 % 20000;
    uang7 = uang6 / 10000;
    uang8 = uang6 % 10000;
    uang9 = uang8 / 5000;
    uang10 = uang8 % 5000;
    uang11 = uang10 / 2000;
    uang12 = uang10 % 2000;
    uang13 = uang12 / 1000;


    System.out.println("Seratus Ribu Rupiah ="+ uang1);
    System.out.println("Lima Puluh Ribu Rupiah ="+ uang3);
    System.out.println("Dua Puluh Ribu Rupiah ="+ uang5);
    System.out.println("Sepuluh Ribu Rupiah ="+ uang7);
    System.out.println("Lima Ribu Rupiah ="+ uang9);
    System.out.println("Dua Ribu Rupiah ="+ uang11);
    System.out.println("Seribu Rupiah ="+ uang13);

    yuk.close();
    }
}