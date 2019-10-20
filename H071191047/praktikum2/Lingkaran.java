import java.util.Scanner;
class Lingkaran{
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int lingkaranA = 25; //Radius dikuadratkan
        int lingkaranB = 144; //Radius dikuadratkan
        int lingakaranC = 400; //Radius dikuadratkan
        double radiusKuadrat = Math.pow(x,2) +Math.pow(y,2);
        if (radiusKuadrat <=lingkaranA){
            System.out.println("Di dalam lingaran A");
        }else if (radiusKuadrat <=lingkaranB){
            System.out.println("Di dalam lingkaran B");
        }else if (radiusKuadrat <= lingakaranC){
            System.out.println("Di dalam lingkaran C");
        }else{
            System.out.println("Diluar lingkaran");
        }

        
    }
}