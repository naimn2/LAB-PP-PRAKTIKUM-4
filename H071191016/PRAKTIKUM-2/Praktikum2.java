import java.util.Scanner;
class praktikum2{
    public static void main(String[] args) {
    Scanner yuk = new Scanner(System.in);
    int x = yuk.nextInt();
    System.out.println("x ="+ x);
    int y = yuk.nextInt();
    System.out.println("y ="+ y);

    if (x < 0 && y > 0 && x + y < 0){
        System.out.println("Titik "+ x +" dan "+ y +" Berada pada Kuadran 1");
    }else if (x < 0 && y > 0 && y != x){
        System.out.println("Titik "+ x +" dan "+ y +" Berada pada Garis -X = Y");
    }else if (x < 0 && x + y > 0){
        System.out.println("Titik "+ x +" dan "+ y +" Berada pada Kuadran 2");
    }else if (x > 0 && y > x){
        System.out.println("Titik "+ x +" dan "+ y +" Berada pada Kuadran 3");
    }else if (x > 0 && y > 0 && x == y){
        System.out.println("Titik "+ x +" dan "+ y +" Berada pada Garis Y = X");
    }else if (x > 0 && y > 0){
        System.out.println("Titik "+ x +" dan"+ y +" Berada pada Kuadran 4");
    }else if (x > 0 && x + y > 0 && y != 0){
        System.out.println("Titik "+ x +" dan "+ y +" Berada pada Kuadran 5");
    }else if (x > 0 && y < 0 && x != y){
        System.out.println("Titik "+ x +" dan "+ y +" Berada pada Garis X = -Y");
    }else if (x > 0 && y < 0 && x + y < 0){
        System.out.println("Titik "+ x +" dan "+ y +" Berada pada Kuadran 6");
    }else if (x < 0 && y < x){
        System.out.println("Titik "+ x +" dan "+ y +" Berada pada Kuadran 7");
    }else if (x < 0 && y < 0 && y == x){
        System.out.println("Titik "+ x +" dan "+ y +" Berada pada Garis -Y = -X");
    }else if (x < 0 && y > x){
        System.out.println("Titik "+ x +" dan "+ y +" Berada pada Kuadran 8");
    }else if (x == 0 && y == 0){
        System.out.println("Titik Pusat 0,0");
    }else if (x == 0 && y > x){
        System.out.println("Titik "+ x +" dan "+ y +" Berada pada Garis Sumbu Y");
    }else if (y == 0 && x > y){
        System.out.println("Titik "+ x +" dan "+ y +" Berada pada Garis Sumbu X");
    }

    yuk.close();
    }
    }