import java.util.Scanner;
class Kapal{
    public static void main(String[] args) {
    double a,b,h,x;
    Scanner key=new Scanner(System.in);
    System.out.println("masukan nilai h = ");
    h=key.nextDouble();
    System.out.println("masukkan nilai a = ");
    a=key.nextDouble();
    System.out.println("masukkan nilai b = ");
    b=key.nextDouble();
    a=Math.toRadians(a);
    b=Math.toRadians(b);
    x=((Math.tan(a)*h)-(Math.tan(b)*h));
    System.out.printf("Panjang Kapal %.1f m",x);
        

    }
}