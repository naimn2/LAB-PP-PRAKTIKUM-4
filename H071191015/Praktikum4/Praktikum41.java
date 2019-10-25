import java.util.Scanner;
class Praktikum41 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, sum2=0;

        int m = input.nextInt();
        int[]arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        int n = input.nextInt();
        int[]arr2=new int[n];
        for (int j = 0; j < n; j++) {
            arr2[j] = input.nextInt();
            sum2 += arr2[j];
        }
        
        int angkaSama = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i]==arr2[j]) {
                    angkaSama += arr[i];
                }   
            }
        }
        System.out.println("\nJumlah "+ (sum+sum2-angkaSama));
    }
   
}