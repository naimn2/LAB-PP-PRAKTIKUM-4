import java.util.Scanner;
	
	class no5 {	// ===> NAMA KELAS HARUS DIAWALI DENGAN HURUF KAPITAL
		// ===> PERHATIKAN INDENT AGAR KODE LEBIH RAPI DAN LAIN KALI GUNAKAN TEXT EDITOR
		public static void main(String [] args) {
			Scanner x= new Scanner(System.in);
			int a = x.nextInt();
			int b = (a/100000);
			System.out.print("Jumlah uang Rp.100.000 : " +b);
			int c = ((a-(b*100000))/50000);	
			// ===> SEBAIKNYA GUNAKAN OPERASI MODULO AGAR LEBIH EFISIEN
			// ===> TIDAK PERLU BUAT VARIABEL BARU (c), BISA MENGUNAKAN VARIABEL "a"
			System.out.print("\nJumlah uang Rp.50.000 : " +c);
			int d = ((a-(b*100000)-(c*50000))/20000);	
			// ===> SEBAIKNYA GUNAKAN OPERASI MODULO AGAR LEBIH EFISIEN
			System.out.print("\nJumlah uang Rp.20.000 : " +d);
			int e = ((a-(b*100000)-(c*50000)-(d*20000))/10000);	
			// ===> SEBAIKNYA GUNAKAN OPERASI MODULO AGAR LEBIH EFISIEN
			System.out.print("\nJumlah uang Rp.10.000 : " +e);
			int f = ((a-(b*100000)-(c*50000)-(d*20000)-(e*10000))/5000);	
			// ===> SEBAIKNYA GUNAKAN OPERASI MODULO AGAR LEBIH EFISIEN
			System.out.print("\nJumlah uang Rp.5000 : " +f);
			int g = ((a-(b*100000)-(c*50000)-(d*20000)-(e*10000)-(f*5000))/2000);	
			// ===> SEBAIKNYA GUNAKAN OPERASI MODULO AGAR LEBIH EFISIEN
			System.out.print("\nJumlah uang Rp.2000 : " +g);
			int h = ((a-(b*100000)-(c*50000)-(d*20000)-(e*10000)-(f*5000)-(g*1000))/2000);	
			// ===> SEBAIKNYA GUNAKAN OPERASI MODULO AGAR LEBIH EFISIEN
			System.out.print("\nJumlah uang Rp.1000 : " +h);
			
			// CATATAN: SECARA KESELURUHAN BISA MENGGUNAKAN CUMA 2 VARIABEL (a DAN b), TIDAK PERLU MEMBUAT BANYAK VARIABEL
			// PERBAIKI INDENT AGAR LEBIH RAPI
		}
}
