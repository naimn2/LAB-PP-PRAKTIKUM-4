import java.util.Scanner;
import java.util.InputMismatchException;
import java.math.BigInteger;

class Modulb3no3 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		try{
			int a= xx.nextInt();
			BigInteger f[] = new BigInteger[a];
			f[0]=BigInteger.valueOf(0);
			f[1]=BigInteger.valueOf(1);
			for(int i= 0; i<a; i++) {
				if(i<2) {
					System.out.print(i+ " ");
				}else if(i>=2){
					f[i]=f[i-1].add(f[i-2]);
					System.out.print(f[i]+ " ");
				}
			}	
		}catch (InputMismatchException im){
			System.out.println("Input integer ");
		}finally {
			xx.close();
		}
	}
}

