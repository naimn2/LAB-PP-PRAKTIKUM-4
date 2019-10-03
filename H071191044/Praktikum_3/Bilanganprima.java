import java.util.Scanner;
import java.util.InputMismatchException;

	class Bilanganprima{
		public static void main(String [] args){
		Scanner xx= new Scanner(System.in);
			try{
				long a= xx.nextLong();
				int bukanprima=0;
				double setengah= 0.5;
				double akar= (int) Math.pow(a,setengah);
				double kuadrat= (akar*akar);
				long batas=Math.abs(a/2);
				if(a>1){
					for(int p=2; p<=batas ;p++){
					bukanprima++;
					if( a%p==0 ){
						System.out.print(a+" bukan bilangan prima (Terbagi dengan "+p+")");
						break;
					}else if (a==kuadrat){
						System.out.printf("%01d bukan bilangan prima (Terbagi dengan %.0f)",a,akar);
						break;
					}
				}
				}else if(a==0){
					System.out.print(a+" Bukan bilangan prima (terbagi dengan banyak angka)");
				}else if(a==1 || a==-1){
					System.out.print(a+" Bukan bilangan prima");
				}else{
					for(int p=2; p<=Math.abs(a) ;p++){
					bukanprima++;
					if( a%p==0 ){
						System.out.print(a+" bukan bilangan prima (Terbagi dengan "+p+")");
						break;
						}
					}
				}

				if(bukanprima>(batas-2) && a!=4 && a>0 && a!=1){
					System.out.print(a+" bilangan prima");
				}
		}catch(InputMismatchException ime){
				System.out.print("Input angka lebih kecil dari 9223372036854775807");
		}finally{
			xx.close();
		}
	}
}