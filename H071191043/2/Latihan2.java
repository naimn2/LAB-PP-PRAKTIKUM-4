import java.util.Scanner;
class Latihan2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input waktu acara dimulai");
        int jam0 = sc.nextInt()*60;
        int menit0 = sc.nextInt();
        System.out.println("Input waktu acara berakhir");
        int jam1 = sc.nextInt()*60; 
        int menit1 = sc.nextInt();
        int jam;

        if ((jam0 + menit0) > (jam1 + menit1)){
            jam = (jam1 + menit1) + (24 * 60) - (jam0 + menit0);
            System.out.printf("%02d : %02d", jam/60, jam % 60); 
        }
        else {
            jam = Math.abs((jam1 + menit1) - (jam0 + menit0));
            System.out.printf("%02d : %02d", jam/60, jam % 60);
        sc.close();    
        }
    }
}