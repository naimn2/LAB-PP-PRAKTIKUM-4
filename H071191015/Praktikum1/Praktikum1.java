import java.util.Scanner;
class Praktikum1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int waktu = input.nextInt();
        int kecepatan = input.nextInt();

        float bensin = (waktu*kecepatan)/14.0f;

        System.out.printf("Bensin yang digunakan : %.3f L", bensin);
        input.close();
    
    }
}