import java.util.Scanner;

	class DurasiAcara{
		public static void main(String [] args){
			Scanner xx= new Scanner(System.in);
			System.out.println("Acara dimulai : ");
			int j1= xx.nextInt();
			int m1= xx.nextInt();
			System.out.println("Acara berakhir : ");
			int j2= xx.nextInt();
			int m2= xx.nextInt();
			int m1total= (m1+(j1*60));
			int m2total= (m2+(j2*60));
			int kurang= (m2total-m1total);
			int jumlahmnt, jdurasi, mdurasi, bagi; 
				if(kurang<0){
					jumlahmnt=((1440-m1total)+m2total);
					jdurasi= (jumlahmnt/60);
					bagi= (jdurasi*60);
					mdurasi= (jumlahmnt-bagi);		
					System.out.printf("Durasi acara : %02d:%02d",jdurasi,mdurasi);
				}else if(kurang>0){
					jumlahmnt=(m2total-m1total);
					jdurasi= (jumlahmnt/60);
					bagi= (jdurasi*60);
					mdurasi= (jumlahmnt-bagi);
					System.out.printf("Durasi acara : %02d:%02d",jdurasi,mdurasi);
				}
			}
		}