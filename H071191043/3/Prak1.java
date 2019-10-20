import java.util.Scanner;
class Prak1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai awal = ");
        int x = sc.nextInt();
        System.out.println("Masukkan nilai akhir = ");
        int y = sc.nextInt();
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        sc.close();

        for (int i = min; i <= max; i++){
            System.out.print(i);
            if (i != 0){
                if (i % 2 == 0 && i > 0){
                    System.out.println(" genap positif");
                }
                else if (i % 2 != 0 && i > 0) {
                    System.out.println(" ganjil positif");
                }
                if (i % 2 == 0 && i < 0) {
                    System.out.println(" genap negatif");
                }
                else if (i % 2 != 0 && i < 0) {
                    System.out.println(" ganjil negatif");
                }
            }
            else if (i == 0) {
                System.out.println(" nol");
            } 
        }       
    }
}