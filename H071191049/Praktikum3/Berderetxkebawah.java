import java.util.Scanner;
class Berderetxkebawah{
    public static void main(String[] args) {
        Scanner san =  new Scanner (System.in);
        int x = san.nextInt();
        int y = san.nextInt();
        int n=1;
        int j=x;
        if(x<0||y<0){
            System.out.println("Input tidak valid");
            return;
        }
        while(n<y){
            for(int i=n;i<=j;i++){
                System.out.print(i+ " ");
            }
            System.out.println();
            n=n+x;
            j=j+x;
        }
    }
}