import java.util.Scanner;

class TPRAK3{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float h = sc.nextFloat();
    float a = sc.nextFloat();
    float b = sc.nextFloat();
        //h = Ketinggian Menara
        //a = Sudut Elevasi Terhadap Ujung Depan Kapal
        //b = Sudut Elevasi Terhadap Ujung Belakang Kapal

    System.out.println("h ="+ h);
    System.out.println("a ="+ a);
    System.out.println("b ="+ b);

    double sudut = Math.tan(Math.toRadians(a));
    double alas = sudut*h;
    double sudut2 = Math.tan(Math.toRadians(b));
    double alas2 = sudut2*h;
    double panjang = alas-alas2;

    System.out.printf("Panjang kapal = %.2f m", panjang);
    }
}