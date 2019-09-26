import java.util.Scanner;
class Derajat{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        float derajat= sc.nextFloat();
        int sekon =  Math.round((derajat/360)*(24*3600));
        int jam=0,menit=0;
        while(sekon>=3600){
            jam++;
            sekon -=3600;

        }

        while(sekon>=60){
            menit++;
            sekon -=60;
        }
        jam = (jam+6)%24;
        if(jam<12){
            System.out.println("selamat pagi");
            System.out.printf("%02d:%02d:%02d\n",jam,menit,sekon);
        }
        else if(jam<15){
            System.out.println("selamat siang");
            System.out.printf("%02d:%02d:%02d",jam,menit,sekon);
        }
        else if(jam<18){
            System.out.println("selamat sore");
            System.out.printf("%02d:%02d:%02d",jam,menit,sekon);
        }
        else{
            System.out.println("selamat malam");
            System.out.printf("%02d:%02d:%02d",jam,menit,sekon);
        }

        }
    }

