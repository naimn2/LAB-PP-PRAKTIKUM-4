import java.util.Scanner;
class Praktikum53 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        myDay(a);
    }
    public static void myDay(int a) {
        System.out.println(tahun(a) + " tahun");
        System.out.println(bulan(a) + " bulan");
        System.out.println(hari(a) + " hari");
    }

    public static int tahun(int a) {
        int tahun=a/365; 
        return tahun;
    }
    public static int bulan(int a) {
        int bulan=(a%365)/30;
        return bulan;
    }
    public static int hari(int a) {
        int hari = a%365%30;
        return hari;
    }

}