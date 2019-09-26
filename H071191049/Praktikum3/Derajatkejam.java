import java.util.Scanner;
class Derajatkejam{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        float derajat=san.nextFloat();
        int sekon = Math.round((derajat/360)*(24*3600));
        int jam=0,menit=0;
        while(sekon>=3600){
            jam++;
            sekon-=3600;
        }
        while(sekon>=60){
            menit++;
            sekon-=60;
        }
        jam = (jam+6)%24;
        if(jam<12){
            System.out.println("Selamat pagi");
            System.out.printf("%02d:%02d:%02d\n",jam,menit,sekon);
        }
        else if(jam<15){
            System.out.println("Selamat Siang");
            System.out.printf("%02d:%02d:%02d",jam,menit,sekon);
        }
        else if(jam<18){
            System.out.println("Selamat Sore");
            System.out.printf("%02d:%02d:%02d",jam,menit,sekon);
        }
        else{
            System.out.println("Selamat Malam");
            System.out.printf("%02d:%02d:%02d",jam,menit,sekon);
        }
    }   
}

