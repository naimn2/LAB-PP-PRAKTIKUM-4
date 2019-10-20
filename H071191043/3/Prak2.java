import java.util.Scanner;
class Prak2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input batas awal = ");
        int x = sc.nextInt();
        System.out.println("Input batas akhir = ");
        int y = sc.nextInt();
        sc.close();

        for (int i = 1; i <= y; i++){
            System.out.print(i + "\t");
            if (i % x == 0){
                System.out.println();
            }
        }
     }
}