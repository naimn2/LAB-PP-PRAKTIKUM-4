import java.util.Scanner;
class Praktikum32 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int i = 0;

        while (i<y) {
            if (i%x==0) {
                System.out.println();
            }
            
            i++;
            System.out.printf("%d ",i);
        }
        
    }
}