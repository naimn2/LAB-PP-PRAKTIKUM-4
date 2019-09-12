import java.util.Scanner;
class TPRAK5{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    System.out.println("Nilai a ="+ a);
    int b = sc.nextInt();
    System.out.println("Nilai b ="+ b);
    
    boolean c = a % b == 0;
    boolean d = b % a == 0;
    boolean e = c || d;

    System.out.println("Apakah" + a + "Kelipatan dari" + b + "? ="+ e);
    }
    
    }