import java.util.Scanner;

class Modulb2no1 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		int genap= 0;
		int ganjil= 0;
		int positif= 0;
		int negatif= 0;
		
		int a= xx.nextInt();			
		int b= xx.nextInt();
		int c= xx.nextInt();
		int d= xx.nextInt();
		int e= xx.nextInt();

		
		genap = ((a%2==0)?1:0) + ((b%2==0)?1:0) + ((c%2==0)?1:0) + ((d%2==0)?1:0) + ((e%2==0)?1:0);
		ganjil = ((a%2!=0)?1:0) + ((b%2!=0)?1:0) + ((c%2!=0)?1:0) + ((d%2!=0)?1:0) + ((e%2!=0)?1:0);
		positif = ((a>0)?1:0) + ((b>0)?1:0) + ((c>0)?1:0) + ((d>0)?1:0) + ((e>0)?1:0);
		negatif = ((a<0)?1:0) + ((b<0)?1:0) + ((c<0)?1:0) + ((d<0)?1:0) + ((e<0)?1:0);
		
		
		System.out.print("Jumlah bilangan genap : " +genap);
		System.out.print("\nJumlah bilangan ganjil : " +ganjil);
		System.out.print("\nJumlah bilangan positif : " +positif);
		System.out.print("\nJumlah bilangan negatif : " +negatif);
	}
}
