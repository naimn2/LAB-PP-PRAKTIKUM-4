import java.util.Scanner;
class Praktikum34 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaBarang = input.nextInt();
        int nilaiUang = input.nextInt();
        int jumlahUang= nilaiUang-hargaBarang;

        int seratus=0, limapuluh=0, duapuluh=0, sepuluh=0, limaribu=0, duaribu=0, seribu=0;

        while (jumlahUang>=100000) {
            jumlahUang-=100000;
            seratus++;
        }

        while (jumlahUang>=50000) {
            jumlahUang-=50000;
            limapuluh++;
        }

        while (jumlahUang>=20000) {
            jumlahUang-=20000;
            duapuluh++;
        }

        while (jumlahUang>=10000) {
            jumlahUang-=10000;
            sepuluh++;
        }

        while (jumlahUang>=5000) {
            jumlahUang-=5000;
            limaribu++;
        }

        while (jumlahUang>=2000) {
            jumlahUang-=2000;
            duaribu++;
        }

        while (jumlahUang>=1000) {
            jumlahUang-=1000;
            seribu++;
        }

        System.out.println(seratus + " uang Rp. 100.000");
        System.out.println(limapuluh + " uang Rp.  50.000");
        System.out.println(duapuluh + " uang Rp.  20.000");
        System.out.println(sepuluh + " uang Rp.  10.000");
        System.out.println(limaribu + " uang Rp.   5.000");
        System.out.println(duaribu + " uang Rp.   2.000");
        System.out.println(seribu + " uang Rp.   1.000");
    }
}