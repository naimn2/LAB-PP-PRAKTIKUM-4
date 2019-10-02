 import java.util.Scanner;
class TugasPraktikum3{
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        int n = yuk.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 0; i <= n; i++){
            i = a;
            a = a + b;
            b = a - b;
            System.out.print(i+" ");
        }
        yuk.close();
    }
}