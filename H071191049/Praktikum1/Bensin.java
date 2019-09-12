import java.util.Scanner;
class Bensin{
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.print("Waktu yang ditempuh = ");
        double waktu=key.nextDouble();
        System.out.print("Kecepatan rata-rata = ");
        double kecepatan=key.nextDouble();
        System.out.printf("Bensin Yang Digunakan : %.3f L",(kecepatan*waktu)/14);
    }
}