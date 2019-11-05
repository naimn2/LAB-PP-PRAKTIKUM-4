import java.util.Scanner;
class Praktikum62 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int banyak = sc.nextInt();

        int jumlah = 0;
        boolean found = false;
        
        String[] kata = new String[banyak];

        for (int i = 0; i < banyak; i++) {
            kata[i] = sc.next();
        }

        String kataBalik = "";
        for (int i = 0; i < kata.length; i++) {
            String kalimat = (kata[i]);
            for (int j = kalimat.length()-1; j >= 0; j--) {
                kataBalik = kataBalik + kalimat.charAt(j);
            }
            if (kalimat.equals(kataBalik)) {
                found = true;
                jumlah++;
            }
            kataBalik = "";
        }

        if (found == true) {
            System.out.println(jumlah);
        } else {
            System.out.println("Tidak ada kata palindrom");
        }

        
    }
}