import java.util.Scanner;
class Praktikum44 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[][] matriks= new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriks[i][j] = input.nextInt();
            }
        }

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (matriks[i][j] == 0 && matriks[i][j] != matriks[i-1][j] && matriks[i][j] != matriks[i+1][j]) {
                    if (matriks[i][j] != matriks[i][j-1] && matriks[i][j] != matriks[i][j+1]) {
                        System.out.println(i + " , " + j);
                    }
                } 
                
            }
        }

    }
}