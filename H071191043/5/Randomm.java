import java.util.Scanner;
import java.util.Random;

class Randomm{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
    }
    public static String generateSerial(int x, int y){
        String str = "";
        Random sc = new Random();

        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                int k = sc.nextInt(10);
                str += k;
            }
            if (i < x-1){
                str += "-";
            }
        }
        return str;
    }
}