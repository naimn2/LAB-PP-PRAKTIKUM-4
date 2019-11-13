import java.util.Scanner;
class FPB{
    public static void main(String[] args) {
        Scanner san = new Scanner (System.in);
        int a = san.nextInt();
        int b = san.nextInt();
        cariFPB(a,b);
        System.out.println(cariFPB(a,b));
    }
    //cari FPB
    public static int cariFPB (int x, int y){
        int calonFPB = 1;
        int fpb = 0;
        x = Math.abs(x);
        y = Math.abs(y);
        if(x==0||y==0){
            fpb=x>y?x:y;    
        }
        while(calonFPB<=x&&calonFPB<=y){
            if(x%calonFPB==0&&y%calonFPB==0){
                fpb = calonFPB;
            }
            calonFPB++;
        }
        return fpb;
    }
}