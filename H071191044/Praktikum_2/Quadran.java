import java.util.Scanner;

class Quadran{
	public static void main(String [] args){
		Scanner aa= new Scanner (System.in);
		System.out.print("Masukkan x : ");
		int x= aa.nextInt();
		System.out.print("Masukkan y : ");
		int y= aa.nextInt();
		
		if (x<0 && y>0){
			if(Math.abs(x)>y){
				System.out.println("Koordinat : (" +x+","+y+")"+", berada pada kuadran 1");
			}else if(Math.abs(x)<y){
				System.out.println("Koordinat : (" +x+","+y+")"+", berada pada kuadran 2");
			}else if(Math.abs(x)==y){
				System.out.println("Koordinat : (" +x+","+y+")"+", berada pada garis antara kuadran 1 dan kuadran 2");
			}
		}else if (x>0 && y>0){
			if(x<y){
			System.out.println("Koordinat : (" +x+","+y+")"+", berada pada kuadran 3");
			}else if(x>y){
			System.out.println("Koordinat : (" +x+","+y+")"+", berada pada kuadran 4");
			}else if(x==y){
			System.out.println("Koordinat : (" +x+","+y+")"+", berada pada garis antara kuadran 3 dan kuadran 4");
			}
		}else if(y<0 && x>0){
			if(Math.abs(y)<x){
				System.out.println("Koordinat : (" +x+","+y+")"+", berada pada kuadran 5");
			}else if(Math.abs(y)>x){
				System.out.println("Koordinat : (" +x+","+y+")"+", berada pada kuadran 6");
			}else if(Math.abs(y)==x){
				System.out.println("Koordinat : (" +x+","+y+")"+", berada pada garis antara kuadran 5 dan kuadran 6");
			}
		}else  if(y<0 && x<0){
			if(Math.abs(y)>Math.abs(x)){
				System.out.println("Koordinat : (" +x+","+y+")"+", berada pada kuadran 7");
			}else if(Math.abs(y)<Math.abs(x)){
				System.out.println("Koordinat : (" +x+","+y+")"+", berada pada kuadran 8");
			}else if(Math.abs(y)==Math.abs(x)){
				System.out.println("Koordinat : (" +x+","+y+")"+", berada pada garis antara kuadran 7 dan kuadran 8");
			}
		}else if(x==0 && y==0){
			System.out.println("Koordinat : (" +x+","+y+")"+", berada pada pusat koordinat");
		}else if(x==0 && y!=0){
			System.out.println("Koordinat : (" +x+","+y+")"+", berada pada garis y");
		}else {
			System.out.println("Koordinat : (" +x+","+y+")"+", berada pada garis x");
		}
	}
}