import java.util.Scanner;
class Praktikum3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double h = input.nextDouble(); // h = ketinggian menara
        double a = input.nextDouble(); // a = sudut elevasi pengamat terhadap ujung depan kapal
        double b = input.nextDouble(); // b = sudut elevasi pengamat terhadap ujung belakang kapal

        double sudut = Math.tan(Math.toRadians(a));
        double alas = sudut*h;
        double sudut2 = Math.tan(Math.toRadians(b));
        double alas2 = sudut2*h;
        double panjang = alas-alas2;

        System.out.printf("Panjang Kapal = %.1f m", panjang);
        input.close();

    }
}