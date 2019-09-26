import java.util.Scanner;
class Angka{
    public static void main(String[] args) {
        Scanner san = new Scanner (System.in);
        int nilaiAwal = san.nextInt();
        int nilaiAkhir = san.nextInt();
        int simpanan=nilaiAwal;
        if(nilaiAkhir<nilaiAwal){
            nilaiAwal=nilaiAkhir;
            nilaiAkhir=simpanan;
        }
        for(int i=nilaiAwal;i<=nilaiAkhir;i++){
            if(i==0){
                System.out.println(i+" nol");
            }
            else if(i%2==0){
                if(i>0){
                    System.out.println(i+" genap positif");
                }else{
                    System.out.println(i+" genap negatif");
                }
            }
            else{
                if(i>0){
                    System.out.println(i+" ganjil positif");
                }else if(i<0){
                    System.out.println(i+" ganjil negatif");
                }
            }
        }
    }
}