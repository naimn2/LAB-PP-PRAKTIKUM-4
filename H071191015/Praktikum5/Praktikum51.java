import java.util.Scanner;
class Praktikum51 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        nilaiFPB(a, b);
    }
        
    public static void nilaiFPB(int a, int b) {
        System.out.println("FPB dari " + a + " dan " + b +" = " + cariFPB(a, b));
    }

    
    public static int cariFPB(int a, int b) {
        int fpb = 0;
        for (int i = 1; i <= Math.max(a, b); i++) {
            if (a%i==0 && b%i==0) {
                fpb=i;
            } 
        }
        return fpb;
    }
}