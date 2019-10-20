import java.util.Scanner;
class PerkalianMatrix{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        int i = san.nextInt(),j = san.nextInt(),k = san.nextInt(),q,n,z;
        int [][] a = new int [i][j];
        int [][] b = new int [j][k];
        int hasil [][] = new int [i][k];
        System.out.println();
        try{
            //matrix A
            for(q=0;q<i;q++){
                for(n=0;n<j;n++){
                a [q][n]=san.nextInt();
            }
        } 
            //matrix B
        System.out.println();
            for(q=0;q<j;q++){
                for(n=0;n<k;n++){
                b [q][n]=san.nextInt();
            }
        }
            //matrix A x matrix B
        System.out.println();
            for(q=0;q<i;q++){
                for(n=0;n<k;n++){
                    for(z=0;z<j;z++){
                        hasil[q][n] +=a[q][z]*b[z][n];
                    }
                    System.out.print(hasil[q][n]+" "); 
                }
                System.out.println();
            }
            System.out.println();
    }catch(ArrayIndexOutOfBoundsException io){
        System.out.println(io.getMessage());
    }

    }
}