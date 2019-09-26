import java.math.BigInteger;
import java.util.Scanner;
class Fibonacci{
    public static void main(String[] args) {
        Scanner san = new Scanner (System.in);
        int n = san.nextInt();
        BigInteger penjumlah= BigInteger.valueOf(0);
        BigInteger nilai=BigInteger.valueOf(1);
        BigInteger hasil=BigInteger.valueOf(0);
        for(int i= 0; i<n;i++){
            hasil=penjumlah;
            penjumlah = penjumlah.add(nilai);
            nilai=hasil;
            System.out.print(hasil+" ");
        }
    }
}