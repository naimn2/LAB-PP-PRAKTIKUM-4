import java.util.Scanner;
class Bilanganprima{
    public static void main(String[] args) {
        Scanner san = new Scanner (System.in);
        int i=0;
        int a=san.nextInt();
        for(i=2;i*i<=a;i++){
            if(a%i==0){
                System.out.println(a+" Bukan Bilangan prima");
                return;
            }
	}
            if(a!=1&&a!=0&&a>=0){
                System.out.println(a+" Bilangan prima");
            }
            else{
                System.out.println(a+" Bukan Bilangan prima");
            }
            
        }
    }

