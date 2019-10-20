import java.util.Scanner;
class MyDays{
    public static void main(String[] args) {
        Scanner san = new Scanner (System.in);
        int hari = san.nextInt();
        myDays(hari);
        san.close();
    }
    //method myDays
    static void myDays (int a){
        int tahun = a/365;
        a = a%365;
        int bulan = a/30;
        a = a%30;
        int hari = a;
        System.out.printf("%d Tahun\n%d Bulan\n%d Hari",tahun,bulan,hari);
    }
    
}
