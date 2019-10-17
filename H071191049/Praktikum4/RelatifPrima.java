import java.util.Scanner;
class RelatifPrima{
    public static void main(String[] args) {
        Scanner san= new Scanner (System.in);
        int batas = san.nextInt();
        int angka [] = new int [batas];
        //input angka yang mo dicari koprimanya
        for(int i=0;i<angka.length;i++){
            angka [i]=san.nextInt();
        }
        //membandingkan apakah dua angka ini relatif prima
        for(int j=0;j<angka.length-1;j++){
            for(int k=j+1;k<angka.length;k++){ 
                //mencari FPB
                int fpb = 0;
                //jika salah satu angka adalah 0, maka FPB nya bilangan yang lain               
                if(angka[j]==0||angka[k]==0){
                    fpb=angka[j]>angka[k]?angka[j]:angka[k];    
                }
                //mencari FPB bukan 0
                int simpan=1;   
                while(simpan<=angka[j]&&simpan<=angka[k]){
                    if((angka[j]%simpan==0)&&(angka[k]%simpan==0)){
                    fpb = simpan;
                    }simpan++;
                }
                //jika FPBnya 1 maka bilangan tersebut koprima
                if(fpb==1){
                        System.out.println(angka[j]+" "+angka[k]);
                }
            }
        }
    }
}