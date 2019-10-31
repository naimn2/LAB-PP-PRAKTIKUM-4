import java.util.Scanner;
class Matriks6{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        char[] w = word.toCharArray();
        String hasil = "";
        for (int i = 0; i < w.length; i++){
            if (i % 2 == 0){
                hasil += w[i];
            }
            else {
                hasil += Character.codePointAt(w, i);
            }
        }
        System.out.println(hasil);
        int panjang = hasil.length();
        double jumlah = Math.ceil(panjang/16.0);
        int b = 0;
        for (int i = 0; i < 16; i++){
            for (int j = 0; j < jumlah; j++){
                if ( b < panjang){
                    System.out.print(hasil.charAt(b++));
                }
                else {
                    System.out.print("?");
                }
            }
            if (i % 4 == 3) {
                System.out.println();
            }
            else {
                System.out.print(" ");
            }
        }
    }
}