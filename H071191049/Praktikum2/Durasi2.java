import java.util.Scanner;
class Durasi2{
    public static void main(String[] args) {
        Scanner key=new Scanner (System.in);
        System.out.println("Waktu Mulai");
        int jam1 = key.nextInt()*60;
        int menit1=key.nextInt();
        System.out.println("Waktu Berakhir");
        int jam2 = key.nextInt()*60;
        int menit2=key.nextInt();
        int durasi;
        if((jam1+menit1)>(jam2+menit2)){
            durasi=(jam2+menit2)+(24*60)-(jam1+menit1);
        } 
        else {
            durasi=(jam2+menit2)-(jam1+menit1);
        }
        System.out.printf("Durasi acara \n%02d:%02d",(durasi/60),durasi-(durasi/60)*60);
    }
}