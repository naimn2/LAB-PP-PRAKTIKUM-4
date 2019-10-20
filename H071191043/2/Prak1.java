import java.util.Scanner;

class Prak1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int genap = 0;
            int ganjil = 0;
            int positif = 0;
            int negatif = 0;

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();

            int genGana = a % 2 == 0 ? genap++ : ganjil++;
            int genGanb = b % 2 == 0 ? genap++ : ganjil++;
            int genGanc = c % 2 == 0 ? genap++ : ganjil++;
            int genGand = d % 2 == 0 ? genap++ : ganjil++;
            int genGane = e % 2 == 0 ? genap++ : ganjil++;

            if (a > 0){
                positif++;
            }else if (a < 0){
                negatif++;
            }
            if (b > 0){
                positif++;
            }else if (b < 0){
                negatif++;
            }
            if (c > 0){
                positif++;
            }else if (c < 0){
                negatif++;
            }
            if (d > 0){
                positif++;
            }else if (d < 0){
                negatif++;
            }
            if (e > 0){
                positif++;
            }else if (e < 0){
                negatif++;
            }
            
            System.out.printf("%d angka genap\n", genap);
            System.out.printf("%d angka ganjil\n", ganjil);
            System.out.printf("%d angka positif\n", positif);
            System.out.printf("%d angka negatif\n", negatif);
        } catch (Exception e){
            System.out.println("Inputan tidak valid");
        }
    sc.close();   
    }
}