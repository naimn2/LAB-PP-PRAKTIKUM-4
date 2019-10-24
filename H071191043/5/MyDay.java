import java.util.Scanner;
class MyDay{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        MyDay(a);

    }
    public static void MyDay(int n){
        System.out.println(tahun(n) + " tahun");
        System.out.println(bulan(n) + " bulan");
        System.out.println(hari(n) + " hari");
    }
    public static int tahun(int n){
        int tahun = n / 365;
        return tahun;
    }
    public static int bulan(int n){
        int bulan = n % 365 / 30;
        return bulan;
    }
    public static int hari(int n){
        int hari = n % 365 % 30;
        return hari;
    }
}