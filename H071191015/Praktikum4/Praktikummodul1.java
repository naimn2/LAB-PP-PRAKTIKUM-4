import java.util.Scanner;
class Praktikummodul1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i]=input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int a = arr[i];
                int b = arr[j];
                int fpb = 0;
                for (int k = 1; k <= Math.max(a, b); k++) {
                    if (a%k==0 && b%k==0) {
                    fpb += k;
                    }
                }

                if (fpb==1) {
                    System.out.println(a+ " "+ b);
                }
            }
        }

        
        
        
    }
}