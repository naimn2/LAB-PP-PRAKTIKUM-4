import java.util.Scanner;

class Modulb3no4 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		int harga= xx.nextInt();
		int uang= xx.nextInt();
		int u100,u50,u20,u10,u5,u2,u1;
		u100=0;
		u50=0;
		u20=0;
		u10=0;
		u5=0;
		u2=0;
		u1=0;
		int kembalian= (uang-harga);
		for(int i=kembalian; i>=100000;i-=100000){
			u100++;
			kembalian-=100000;
		}System.out.println(u100+" Uang Rp.100.000,");
		for(int i=kembalian; i>=50000;i-=50000){
			u50++;
			kembalian-=50000;
		}System.out.println(u50+" Uang Rp.50.000,");
		for(int i=kembalian; i>=20000;i-=20000){
			u20++;
			kembalian-=20000;
		}System.out.println(u20+" Uang Rp.20.000,");
		for(int i=kembalian; i>=10000;i-=10000){
			u10++;
			kembalian-=10000;
		}System.out.println(u10+" Uang Rp.10.000,");
		for(int i=kembalian; i>=5000;i-=5000){
			u5++;
			kembalian-=5000;
		}System.out.println(u5+" Uang Rp.5.000,");
		for(int i=kembalian; i>=2000;i-=2000){
			u2++;
			kembalian-=2000;
		}System.out.println(u2+" Uang Rp.2.000,");
		for(int i=kembalian; i>=1000;i-=1000){
			u1++;
			//kembalian-=1000;
		}
		System.out.println(u1+" Uang Rp.1.000,");
	}
}
