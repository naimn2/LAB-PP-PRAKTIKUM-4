import java.util.Scanner;
class Kelipatan{
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.print("input bilangan 1 = ");
        int a=key.nextInt();
        System.out.print("input bilangan 2 = ");
        int b=key.nextInt();
        System.out.printf("apakah %d kelipatan dari %d ?%b",a,b,(b%a==0));
    }
}