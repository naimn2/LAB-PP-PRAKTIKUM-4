import java.util.Scanner;

	class no4 {	// ===> PERHATIKAN INDENT AGAR KODE LEBIH RAPI DAN LAIN KALI GUNAKAN TEXT EDITOR
		public static void main(String [] args) {
			Scanner x= new Scanner(System.in);
			int a = x.nextInt();
			int b = x.nextInt();
			int c = (b%a);	// ===> YANG LEBIH TEPAT "a % b"
		if (c==0) {
			System.out.print("Apakah " +a+ " kelipatan dari " +b+ " ? " +(c==0));
		}else {
			System.out.print("Apakah " +a+ " kelipatan dari " +b+ " ? " +(c==0));
		}
		}

}
