import java.util.Scanner;
class Pergeseran{
    public static void main(String[] args) {
        while (true){
            Scanner san = new Scanner(System.in);
            System.out.println();
            String s = san.nextLine();
            int g = san.nextInt();
            for(int i=0;i<s.length();i++){
                char b = s.charAt(i);
                //input angka tetap angka
                if(b>48&&b<57){
                    System.out.print(b);
                    continue;
                }
                int m = (int)b;
                int j=0;
                //untuk pergeseran <0
                if(g<0){
                    g=26-(Math.abs(g)%26);
                }
                //untuk penjumlahan yang ada dalam interval dan yang keluar
                j=g>=0&&g<=26?m+g:m+(g%26);   
                
                //pergeseran Huruf Kapital
                if(m>=65&&m<=90){
                    j-=(j>=65&&j<=90)?0:26;
                }
                //Pergeseran Huruf Kecil
                else if(m>=97&&m<=122){
                    j-=(j>=97&&j<=122)?0:26;
                }
                //Output
                System.out.print((char)j);
            }
        }
    }
}

