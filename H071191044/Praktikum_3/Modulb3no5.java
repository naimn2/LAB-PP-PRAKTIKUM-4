import java.util.Scanner;

	class Modulb3no5{
		public static void main(String [] args){
			Scanner xx= new Scanner(System.in);
			float derajat= xx.nextFloat();
			int detik= Math.round((derajat/360)*(24*3600));
			int jam= 0;
			int menit= 0;
			while(detik>=3600){
				jam++;
				detik-=3600;
			}
			while(detik>=60){
				menit++;
				detik-=60;
			} 
			jam= (jam+6)%24;
			if(jam<12){
			System.out.println("Selamat pagi");
			System.out.printf("%02d:%02d:%02d",jam,menit,detik);
			}else if(jam<15){
			System.out.println("Selamat siang");
			System.out.printf("%02d:%02d:%02d",jam,menit,detik);
			}else if(jam<18){
			System.out.println("Selamat sore");
			System.out.printf("%02d:%02d:%02d",jam,menit,detik);
			}else{
			System.out.println("Selamat malam");
			System.out.printf("%02d:%02d:%02d",jam,menit,detik);
			}
		}
	}