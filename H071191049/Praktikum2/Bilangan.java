import java.util.Scanner;
class Bilangan{
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        int genap=0;
        int ganjil=0;
        int positif=0;
        int negatif=0;
        try{
            int a=key.nextInt();
            int b=key.nextInt();
            int c=key.nextInt();
            int d=key.nextInt();
            int e=key.nextInt();
            genap=(a%2==0?1:0)+(b%2==0?1:0)+(c%2==0?1:0)+(d%2==0?1:0)+(e%2==0?1:0);
            ganjil=(a%2!=0?1:0)+(b%2!=0?1:0)+(c%2!=0?1:0)+(d%2!=0?1:0)+(e%2!=0?1:0);
            positif=(a>0?1:0)+(b>0?1:0)+(c>0?1:0)+(d>0?1:0)+(e>0?1:0);
            negatif=(a<0?1:0)+(b<0?1:0)+(c<0?1:0)+(d<0?1:0)+(e<0?1:0);
        }catch(Exception ime){
            System.out.println("Inputan tidak valid");
            System.exit(0);
        }//finally{
            System.out.printf("%d Bilangan ganjil\n",ganjil);
            System.out.printf("%d Bilangan genap\n",genap);
            System.out.printf("%d Bilangan positif\n",positif);
            System.out.printf("%d Bilangan negatif\n",negatif);
        }
    }
//}