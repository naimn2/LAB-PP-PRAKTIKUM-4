import java.util.Scanner;

class TugasPraktikum2{
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        int x = yuk.nextInt();
        int y = yuk.nextInt();
        for (int i = 1; i <= y; i++){
            System.out.print(i +" ");
            if (i % x == 0){
                System.out.println();
            }
        }
    }
}