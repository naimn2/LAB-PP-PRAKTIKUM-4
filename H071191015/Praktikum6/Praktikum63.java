import java.util.Scanner;
class Praktikum63 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //tengah
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i*2)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        
        //kanan
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int l = 0; l < i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //kiri
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}