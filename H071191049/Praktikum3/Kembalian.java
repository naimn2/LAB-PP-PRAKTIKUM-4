import java.util.Scanner;
class Kembalian{
    public static void main(String[] args) {
        Scanner san = new Scanner (System.in);
        int hargaBarang=san.nextInt();
        int uangPembayaran=san.nextInt();
        int kembalian=uangPembayaran-hargaBarang;
        int rp100k=0,rp50k=0,rp20k=0,rp10k=0,rp5k=0,rp2k=0,rp1k=0,i;
        if(hargaBarang>uangPembayaran){
            System.out.println("Uang anda tidak cukup");
            return;
        }
        System.out.println("Total Kembalian = "+kembalian);
        System.out.println("Pecahan Kembalian");
        for(i=kembalian;i>=100000;i-=100000){
            rp100k++;
            kembalian-=100000;
        }System.out.printf("%d uang Rp100.000\n",rp100k);
        for(i=kembalian;i>=50000;i-=50000){
            rp50k+=1;
            kembalian -= 50000;
        }System.out.printf("%d uang Rp50.000\n",rp50k);
        for(i=kembalian;i>=20000;i-=20000){
            rp20k+=1;
            kembalian -= 20000;
        }System.out.printf("%d uang Rp20.000\n",rp20k);
        for(i=kembalian;i>=10000;i-=10000){
            rp10k+=1;
            kembalian -= 10000;
        }System.out.printf("%d uang Rp10.000\n",rp10k);
        for(i=kembalian;i>=5000;i-=5000){
            rp5k+=1;
            kembalian -= 5000;
        }System.out.printf("%d uang Rp5.000\n",rp5k);
        for(i=kembalian;i>=2000;i-=2000){
            rp2k+=1;
            kembalian -= 2000;
        }System.out.printf("%d uang Rp2.000\n",rp2k);
        for(i=kembalian;i>=1000;i-=1000){
            rp1k+=1;
        }System.out.printf("%d uang Rp1.000\n",rp1k);
    }
}
