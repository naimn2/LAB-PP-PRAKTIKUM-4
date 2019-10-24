import java.util.Scanner;
class FPB{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long bil1 = sc.nextLong();
        long bil2 = sc.nextLong();

        FPB(bil1, bil2);

    }
    public static void FPB(long a, long b){
        System.out.println(hasil(a, b));
    }
    public static long hasil(long a, long b){
        long fpb = (b == 0) ? a : hasil (b, a % b);
        return fpb;
    }
}