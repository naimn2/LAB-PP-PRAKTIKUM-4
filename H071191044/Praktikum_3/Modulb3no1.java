import java.util.Scanner;
import java.util.InputMismatchException;

	class Modulb3no1 {
		public static void main(String [] args) {
			Scanner xx= new Scanner(System.in);
			try {
			System.out.println("Masukkan 2 angka ");
			int a= xx.nextInt();
			int b= xx.nextInt();
			int max = Math.max(a,b);
			int min = Math.min(a,b);
			int c;
			//if(b>=a) {
			for (c=min;c<=max;c++) {
				System.out.print(c);
				if (c<0) {
					if(c%2==0) {
						System.out.println(" genap negatif");
					}else if(c%1==0){
						System.out.println(" ganjil negatif");
					}
				}else if(c==0) {
						System.out.println(" nol");
				}else if(c>0) {
					if(c%2==0) {
						System.out.println(" genap positif");
					}else if(c%1==0) {
						System.out.println(" ganjil positif");
					}
				}
			}
			//}
			//else if(b<a) {
				System.out.println("Input pertama harus lebih kecil atau sama dengan input kedua");
			//}
			}catch (InputMismatchException i) {
				System.out.print("Input hanya terdiri dari Integer ");
			}finally {
				xx.close();		
		}
	}
}
		

