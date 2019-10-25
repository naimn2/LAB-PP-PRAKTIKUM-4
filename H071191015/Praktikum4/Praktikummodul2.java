import java.util.Scanner;
class Praktikummodul2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ordo matriks
        int i = input.nextInt();
        int j = input.nextInt();
        int k = input.nextInt();

        int matriksA[][] = new int[i][j];
        int matriksB[][] = new int[j][k];

        //matriks A
        System.out.println("Matriks A");
        for (int a = 0; a < i; a++) {
            for (int b = 0; b < j; b++) {
                matriksA[a][b] = input.nextInt();
            }
        }

        //matriks B
        System.out.println("Matriks B");
        for (int b = 0; b < j; b++) {
            for (int c = 0; c < k; c++) {
                matriksB[b][c] = input.nextInt();
            }
        }
        System.out.println();
        
        //perkalian matriks A dan matriks B
        for (int a = 0; a < i; a++) {
            for (int c = 0; c < k; c++) {
                int hasil = 0;
                for (int b = 0; b < j; b++) {
                    hasil += matriksA[a][b]*matriksB[b][c];
                } 
                System.out.print(hasil + " ");
            }
            System.out.println();
            
        }
    }
}