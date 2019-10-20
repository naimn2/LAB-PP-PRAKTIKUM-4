import java.util.Scanner;

class TugasPraktikum4{
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        System.out.println("Harga Barang =");
        int hargaBarang = yuk.nextInt();
        System.out.println("Nilai uang yang dibayarkan =");
        int nilaiUang = yuk.nextInt();
        int kembalian = nilaiUang - hargaBarang;
        int uang1 = 0;
        int uang2 = 0;
        int uang3 = 0;
        int uang4 = 0;
        int uang5 = 0;
        int uang6 = 0;
        int uang7 = 0;

        while (kembalian >= 1000){
            if (kembalian >= 100000){
                kembalian -= 100000;
                uang1++;
            }
            else if (kembalian >= 50000){
                kembalian -= 50000;
                uang2++;
            }
            else if (kembalian >= 20000){
                kembalian -= 20000;
                uang3++;
            }
            else if (kembalian >= 10000){
                kembalian -= 10000;
                uang4++;
            }
            else if (kembalian >= 5000){
                kembalian -= 5000;
                uang5++;
            }
            else if (kembalian >= 2000){
                kembalian -= 2000;
                uang6++;
            }
            else if (kembalian >= 1000){
                kembalian -= 1000;
                uang7++;
            }
        }

            // while (kembalian >= 100000){
            //     kembalian -= 100000;
            //     uang1++;
            // }while (kembalian >= 50000){
            //     kembalian -= 50000;
            //     uang2++;
            // }while (kembalian >= 20000){
            //     kembalian -= 20000;
            //     uang3++;
            // }while (kembalian >= 10000){
            //     kembalian -= 10000;
            //     uang4++;
            // }while (kembalian >= 5000){
            //     kembalian -= 5000;
            //     uang5++;
            // }while (kembalian >= 2000){
            //     kembalian -= 2000;
            //     uang6++;
            // }while (kembalian >= 1000){
            //     kembalian -= 2000;
            //     uang7++;
            // }
        System.out.println("Jumlah Kembalian = ");
        System.out.println(uang1 +" Uang Rp.100.000");
        System.out.println(uang2 +" Uang Rp.50.000");
        System.out.println(uang3 +" Uang Rp.20.000");
        System.out.println(uang4 +" Uang Rp.10.000");
        System.out.println(uang5 +" Uang Rp.5000");
        System.out.println(uang6 +" Uang Rp.2000");
        System.out.println(uang7 +" Uang Rp.1000");

        yuk.close();
    }
}