import java.util.Scanner;
class Praktikum33 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        long N = input.nextInt();
        long n, n1, n2;
        n = 0;
        n1 = 1;
        n2 = 0;
        
        for (long i = 0; i < N; i++) {
            n = n1;
            n1 = n2;
            System.out.print(n2 + " ");
            n2 = n+n1;
        }        
    }
}