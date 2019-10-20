import java.util.Scanner;
import java.util.Random;
class SerialNumber{
    public static void main(String[] args) {
        Scanner san = new Scanner (System.in);
        int n = san.nextInt();
        int m = san.nextInt();
        String serialNumber = generateSerial(n,m);
        System.out.println(serialNumber);
    }
    public static String generateSerial (int n,int m){
        String str = "";
        Random key = new Random();
       for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               int z = key.nextInt(10);
               str += z;
            }
            if(i<(n-1)){
            str+="-";   
            }
       }
        return str;
    }
}