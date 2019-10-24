import java.util.Scanner;
class Volly{    //Array

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String nama[] = new String[n];
        int berhasil[][] = new int[n][3];
        int dilakukan[][] = new int[n][3];
        int sbs_dilakukan[] = new int[3];
        int sbs_berhasil[] = new int[3];
        Double persentase [] = new Double [3];
        String hasil[] = {"Service = ", "Block = ", "Smash = "};

        for (int i = 0; i < n; i++){
            nama[i] = sc.next();
            for (int j = 0; j < 3; j++){
                dilakukan[i][j] = sc.nextInt();
            }
            for (int k = 0; k < 3; k++){
                berhasil[i][k] = sc.nextInt();
            }
        }
        for (int j = 0; j < 3; j++){
            sbs_dilakukan[j]=0;
            sbs_berhasil[j]=0;
            for (int k = 0; k < n; k++){
                sbs_dilakukan[j] += dilakukan[k][j];
                sbs_berhasil[j] += berhasil[k][j];
            }
        }
        for(int i = 0 ;i < 3;i++){
            persentase [i]=(double)(sbs_berhasil[i])/(sbs_dilakukan[i])*100;
            System.out.printf(hasil[i] + "%.2f",persentase[i]);
            System.out.println();
        }
    }
}
