import java.util.Scanner;
import java.util.InputMismatchException;

	class Modulb4no1{
		static int cariFPB(int x, int y){
			int fpb=0;
			int max= Math.max(x, y);
			for(int i=max; i>0; i--) {
				if(x%i==0 && y%i==0) {
					fpb+=i;
					break;
				}
			}
			return fpb;
		}
		public static void main(String [] args){
		Scanner xx= new Scanner(System.in);
		try{
			int n= xx.nextInt();
			int [] bil= new int[n];
			boolean[][]benar= new boolean[n][n];
			int i, j, k, min;
			for(i=0; i<n; i++){
				bil [i]= xx.nextInt();
				for(j=0; j<n; j++){
					benar[i][j]=true;
				}
				}
				
			for(i=0; i<n; i++){
				for(j=i+1; j<n; j++){
					//min= Math.min(bil[i], bil[j]);
					//for(k=min; k>=1; k--){
						//if(bil[i]%min==0 && bil[j]%min==0){
							//break;
						//}else if(k==1){
							//System.out.print(bil[i]+" "+bil[j]+"\n");
						//}
					//}
					
					// cari fpb
					
					if (cariFPB(bil[i], bil[j])==1)
						System.out.print(bil[i]+" "+bil[j]+"\n");
				}
			}
				
			
		}catch(InputMismatchException ime){
			System.out.print("Input hanya terdiri dari angka");			}
		}
		}