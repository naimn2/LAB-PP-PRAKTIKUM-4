import java.util.Scanner;
class Quadran1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("x = ");
        int x =sc.nextInt();
        System.out.print("y = ");
        int y =sc.nextInt();

        if(x<0 && y>0){
            if(x<-y){
                System.out.println("Koordinat berada pada kuadran 1");
            }else if(x>-y){
                System.out.println("Koordinat berada pada kuadran 2");
            }else if(x==-y){
                System.out.println("berada pada garis -x=y");
            }
        }else if (x>0 && y>0){
            if(x<y){
                System.out.println("Koordinat berada pada kuadran 3");
            }else if (x>y){  
                System.out.println("Koordinat berada pada kuadran 4");  
            }else if(x==y){
                System.out.println("berada pada garis x=y");
            }
        }else if (x>0 && y<0){
            if(-x<y){
                System.out.println("Koordinat berada pada kuadran 5");
            }else if (-x>y){
                System.out.println("Koordinat berada pada kuadran 6");
            }else if (-x==y){
                System.out.println("berada pada garis x=-y");
            }
        }else if (x<0 && y<0){
            if(x>y){
                System.out.println("Koordinat berada pada kuadran 7");
            }else if (x<y){
                System.out.println("Koordinat berada pada kuadran 8");
            }else if(x==y){
                System.out.println("berada pada garis -x=-y");
            }
        }else if(x==0){
            if(y==0){
                System.out.println("berada pada titik pusat");  
            }else if(y>0){
                System.out.println("berada pada garis y");
            }else if (y<0){
                System.out.println("berada pada garis -y");
            }
        }else if(y==0){
            if(x>0){
                System.out.println("berada pada garis x");
            }else if(x<0){
                System.out.println("berada pada garis -x");
            }
        }
    }
}