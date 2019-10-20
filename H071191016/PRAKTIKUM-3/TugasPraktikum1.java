import java.util.Scanner;

class TugasPraktikum1{
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        System.out.println("Nilai X :"); // Nilai Awal
        int x = yuk.nextInt();
        System.out.println("Nilai Y :"); // Nilai Akhir
        int y = yuk.nextInt();

        if (x < y){
            for (int i = x; i <= y; i++){
                x = i;
                if (i % 2 == 0 && i < 0){
                    System.out.println(i +" Genap Negatif");
                }else if (i % 2 == 0 && i > 0){
                    System.out.println(i +" Genap Positif");
                }
                if (i % 2 != 0 && i < 0){
                    System.out.println(i +" Ganjil Negatif");
                }else if (i % 2 == 1 && i > 0){
                    System.out.println(i +" Ganjil Positif");
                }
                if (i == 0){
                    System.out.println(i +" Nol");
                }
            }
        }
        if (x > y){
            for (int j = y; j <= x; j++){
                y = j;
                if (j % 2 == 0 && j < 0){
                    System.out.println(j +" Genap Negatif");
                }else if (j % 2 == 0 && j > 0){
                    System.out.println(j +" Genap Positif");
                }
                if (j % 2 != 0 && j < 0){
                    System.out.println(j +" Ganjil Negatif");
                }else if (j % 2 == 1 && j > 0){
                    System.out.println(j +" Ganjil Positif");
                }
                if (j == 0){
                    System.out.println(j +" Nol");
                }
            }
        }
    yuk.close();
    }
}