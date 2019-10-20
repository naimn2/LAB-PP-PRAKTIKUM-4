import java.util.Scanner;
class Faktorial{
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();
        int a = 1;

        for(int i = n; i >= 1; i--){
            a = a*i;
            if(i==1){
                System.out.print(i);
            } else {
                System.out.print(i+ " x ");
            }

        }
        System.out.print(" = "+ a);
    }
}