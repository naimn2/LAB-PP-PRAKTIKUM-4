import java.util.Scanner;
class Uang{
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int a,b;
        System.out.print("Total uang = Rp.");
        a=key.nextInt();
        b = a/100000; 
        System.out.println("Jumlah uang Rp100.000 = "+b);
        a = a%100000;
        b = a/50000;
        System.out.println("Jumlah uang Rp50.000 = "+b);
        a = a%50000;
        b = a/20000;
        System.out.println("Jumlah uang Rp20.000 = "+b);
        a = a%20000;
        b = a/10000;
        System.out.println("Jumlah uang Rp10.000 = "+b);
        a = a%10000;
        b = a/5000;
        System.out.println("Jumlah uang Rp5.000 = "+b);
        a = a%5000;
        b = a/2000;
        System.out.println("Jumlah uang Rp2.000 = "+b);
        a = a%2000;
        b = a/1000;
        System.out.println("Jumlah uang Rp1.000 = "+b);
    }
}