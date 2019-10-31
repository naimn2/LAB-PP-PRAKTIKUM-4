import java.util.Scanner;
class Coba02{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata = sc.nextLine();

        String kata1 = kata.replaceAll(" ", "");
        String kata2 = kata1.toUpperCase();
        int katah = kata2.length();
        int hasil = katah / 2;
        String kata3 = kata2.substring(0, hasil);
        int kata4 = kata.length();

        for (int i = kata3.length()-2; i >= 0; i--){
            kata3 += kata3.charAt(i);
        }
        String hex = String.format("%x", kata4 * kata4);
        String oct = String.format("%o", kata4);
        String startCheck = hex.charAt(0) >= 'A' && hex.charAt(0) <= 'z' ? "?" : "!";
        // String start = hex.startsWith("a") ? "!" : "?";
        
        System.out.println("#" + hex + kata3 + oct + startCheck);
    }
}