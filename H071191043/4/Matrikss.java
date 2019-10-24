import java.util.Scanner;
class Matrikss{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int matriks1[][] = new int[n][m];
        int matriks2[][] = new int[m][l];
        int matriks[][] = new int[n][l];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                matriks1[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < m; j++){
            for (int k = 0; k < l; k++){
                matriks2[j][k] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++){
            for (int k = 0; k < l; k++){
                for (int j = 0; j < m; j++){
                    matriks[i][k] += matriks1[i][j] * matriks2[j][k];
                }
            }
        }
        System.out.println("Hasil perkalian");
        for (int i = 0; i < n; i++){
            for (int k = 0; k < l; k++){
                System.out.print(matriks[i][k] + " ");
            }
            System.out.println();
        }
    }
}