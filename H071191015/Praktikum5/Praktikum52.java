import java.util.Scanner;
import java.util.Random;
class Praktikum52 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();//blok
        int m = input.nextInt();//digit

        String serialNumber = generateSerial(n,m);
        System.out.println(serialNumber);
    }

    public static String generateSerial(int n, int m) {
        String str = "" ;
        String tes = "-";
        Random nomor = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int a = nomor.nextInt(10);
                str+=a;
            }
            if(i < n-1){
            str+=tes;
            }
        }
        return str;
    }
}