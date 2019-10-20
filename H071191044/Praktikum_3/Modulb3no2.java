import java.util.Scanner;
import java.util.InputMismatchException;
	
	class Modulb3no2 {
		public static void main(String [] args) {
			Scanner xx= new Scanner(System.in);
			try{
			System.out.print("Input 2 angka ");
			int x= xx.nextInt();
			int y= xx.nextInt();
			for (int i= 1; i<=y; i++) {
				if(i%x!=0) {
					System.out.print(i+ " ");
				}else if (i%x==0) {
					System.out.println(i+ " ");
				}
			}
			}catch (InputMismatchException im) {
				System.out.print("Input hanya terdiri dari integer");
			}finally {
				xx.close();
			}
		}
	}

