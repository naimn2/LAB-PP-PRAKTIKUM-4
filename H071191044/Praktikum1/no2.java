import java.util.Scanner;
	class no2 {	// ==> NAMA KELAS HARUS DIAWALI DENGAN HURUF KAPITAL
		// ===> PERHATIKAN INDENT AGAR KODE LEBIH RAPI DAN LAIN KALI GUNAKAN TEXT EDITOR
		public static void main(String [] args) {
			Scanner x= new Scanner(System.in);
			System.out.print("Waktu (Detik) : ");
			int dtk= x.nextInt();
			int jam= (dtk/3600);
			int mnt= ((dtk-(jam*3600))/60);	// ===> AKAN LEBIH EFISIEN MENGGUNAKAN MODULO
			int dtkb= (dtk-(jam*3600)-(mnt*60)); // ===> ------------//-----------------
		System.out.print(jam+":"+mnt+":"+dtkb);  // ===> GUNAKAN "printf()" DAN SESUAIKAN DENGAN FORMAT JAM. CONTOH -> 06:15:00
		}

}
