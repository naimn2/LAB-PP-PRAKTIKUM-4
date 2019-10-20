import java.util.Scanner;
class Praktikum31 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        
        for (int i = x; i <= y; i++) {
            if (i%2==0 && i>0) {
                System.out.println(i +  " Genap Positif ");
            } else if (i%2==0 && i<0) {
                System.out.println(i + " Genap Negatif ");
            } else if (i%2!=0 && i>0) {
                System.out.println(i + " Ganjil Positif ");
            } else if (i%2!=0 && i<0) {
               System.out.println(i +" Ganjil Negatif ");
            } else {
                System.out.println(i + " Nol ");
            }
        }

        for (int i = y; i <= x; i++) {
            if (i%2==0 && i>0) {
                System.out.println(i +  " Genap Positif ");;
            } else if (i%2==0 && i<0) {
                System.out.println(i + " Genap Negatif ");
            } else if (i%2!=0 && i>0) {
                System.out.println(i + " Ganjil Positif ");
            } else if (i%2!=0 && i<0) {
               System.out.println(i +" Ganjil Negatif ");
            } else {
                System.out.println(i + " Nol ");
            }
        }

        
    }
}