import java.util.Scanner;
class PanjangKapal{
    public static void main(String[] args) {
        double a,b,h;
        Scanner key=new Scanner(System.in);
        System.out.print("Ketinggian menara = ");
        h=key.nextDouble();
        System.out.print("Sudut elevasi terhadap ujung depan kapal = ");
        a=key.nextDouble();
        System.out.print("Sudut elevasi terhadap ujung belakang kapal = ");
        b=key.nextDouble();
        if (90>a && b<a){
            System.out.printf("Panjang Kapal %.1f m",((Math.tan((a*Math.PI)/180)*h)-(Math.tan((b*Math.PI)/180)*h)));
        }
        else{
            System.out.println("maaf input yang ada masukkan salah");
        }
    }
}