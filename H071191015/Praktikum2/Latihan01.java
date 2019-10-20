import java.util.Scanner;
class Latihan01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        if (x<0 && y>0) {
            if (x+y<0) {
            System.out.println("Kuadran 1");
            } else if (x+y>0) {
            System.out.println("Kuadran 2");
            } else {
                System.out.println("-x = y");
            }
        }

        else if (x>0 && y>0) {
            if (x-y<0) {
                System.out.println("Kuadran 3");
            } else if (x-y>0) {
                System.out.println("Kuadran 4");
            } else {
                System.out.println("x = y");
            }
        }

        else if (x>0 && y<0) {
            if (x+y>0) {
                System.out.println("Kuadran 5");
            } else if (x+y<0) {
                System.out.println("Kuadran 6");
            } else {
                System.out.println("x = -y");
            }
        }

        else if (x<0 && y<0) {
            if (x-y>0) {
                System.out.println("Kuadran 7");
            } else if (x-y<0) {
                System.out.println("Kuadran 8");
            } else {
                System.out.println("-x = -y");
            }
        }

        else {
            if (x==0 && y!=0) {
                System.out.println("Sumbu Y");
            } else if (x!=0 && y==0){
                System.out.println("Sumbu X");
            } else {
                System.out.println("Titik Pusat");
            }
        }
        
    }
}