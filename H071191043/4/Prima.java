import java.util.Scanner;
class Prima{    //Array Modul nomor1

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nilai[] = new int[n];

        for (int i = 0; i < n; i++){
            nilai[i] = sc.nextInt();
        }
        for (int i = 0 ; i < n; i++){
            for (int j = (i+1) ; j < n; j++){
                int a = nilai[i];
                int b = nilai[j];
                int fpb = 0;
                for (int k = 1; k <= Math.min(a, b); k++){
                    if (a % k == 0 && b % k == 0){
                        fpb += k;
                    }     
                }
                if (fpb == 1){
                    System.out.println(a + " " + b);
                }
            }  
        }
        
    }
}