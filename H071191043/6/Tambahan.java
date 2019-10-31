import java.util.Scanner;
class Tambahan{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int n = sc.nextInt();
        char x[] = name.toCharArray();
        int c;
        char name1;

        for (int i = 0; i < x.length;i++){
            c = (int)x[i];
            if (c >= 65 && c <= 90) {
                c = c + (n % 26);
                if (c < 65) {
                    c = c + 26;    
                }else if (c > 90) {
                    c = c - 26;
                }
            }else if (c >= 97 && c <= 122) {
                c = c + (n % 26);
                if (c < 97) {
                    c = c + 26;
                }else if (c > 122) {
                    c =  c - 26;
                }   
            }
            name1 = (char)c;
            System.out.print(name1);
        }
    }
}