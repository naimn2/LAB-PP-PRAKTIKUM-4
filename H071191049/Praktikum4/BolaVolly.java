import java.util.Scanner;
class BolaVolly{
    public static void main(String[] args) {
        Scanner san = new Scanner (System.in);
        int jumlah = san.nextInt();
        String nama [] = new String [jumlah];
        int berhasil [][]  = new int [jumlah][3];
        int usaha [][] = new int [jumlah][3];
        int win[]=new int [3];
        int upaya[]=new int [3];
        Double output[]=new Double [3];
        String action []={"Services","Block","Smash"};
        try{
            for(int orang=0;orang<jumlah;orang++){
                nama [orang]=san.next();//inputnama pemain
                for(int aksi=0;aksi<3;aksi++){
                    usaha [orang][aksi]= san.nextInt();//input jumlah melakukan aksi
                }
                for(int aksiBerhasil=0;aksiBerhasil<3;aksiBerhasil++){
                    berhasil [orang][aksiBerhasil] = san.nextInt();//input jumlah aksi yang berhasil  
                }
            }
            for(int j=0;j<3;j++){
                for(int k=0;k<jumlah;k++){
                    if(berhasil[k][j]<=usaha[k][j]){
                        win [j]+=berhasil[k][j];//sum aksi yang berhasil
                        upaya [j]+=usaha[k][j];//sum aksi yang dilakukan
                    }
                    else{
                        System.out.println("input pada orang ke = "+(j+1)+" tidak valid \njumlah percobaan harus lebih besar dari jumlah keberhasilan");
                        return;
                    }
                }
            }
        }
        catch(Exception ec){
            System.out.println(ec.getMessage());
        }   
        for(int c=0;c<3;c++){
                output [c]= Double.valueOf(Double.valueOf(win[c])/Double.valueOf(upaya[c])*100);//mencari persentase berhasil dari yang dilakukan
                System.out.printf("%s = %.2f%s\n",action[c],output[c],"%");
            }
    }
}