import java.util.Scanner;
class Praktikum43 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();

        int[][] matriks= new int[m][n];

        //matriks
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
            matriks[i][j]= input.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
            System.out.print(matriks[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("Transpose matriks");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            System.out.print(matriks[j][i] + " ");
            }
            System.out.println();
        }

        
    }
}