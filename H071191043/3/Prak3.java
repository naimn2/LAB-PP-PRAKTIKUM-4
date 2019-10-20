import java.util.Scanner;
class Prak3{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long n0 = 0;
        long n1 = 1;
        sc.close();

        for (int i = 0; i < x; i++){
            System.out.print(n0 + " ");
            long n = n0 + n1;
            n0 = n1;
            n1 = n;
        }
    }
}