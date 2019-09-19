import java.util.Scanner;
class Praktikum22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println("Input angka sesuai dengan Menu yang diinginkan");
        int menu = input.nextInt();

        switch (menu) {
            case 1 :
                System.out.printf("Pilih bangun datar \n1.Persegi\n2.PersegiPanjang\n3.Segitiga\n4.Lingkaran\n5.JajarGenjang\n6.Trapesium\n7.BelahKetupat\n8.Layang-layang");
                System.out.println("\nInput angka sesuai dengan nomor bangun datar yang diinginkan");
                int angka = input.nextInt();

                switch (angka) {
                    case 1 : 
                        System.out.println("Input Sisi");
                        double sisiPersegi = input.nextDouble();
                        double luasPersegi = sisiPersegi*sisiPersegi;
                        System.out.println("Luas Persegi = " + luasPersegi);
                        break;
                    case 2 :
                        System.out.println("Input Panjang");
                        double panjang = input.nextDouble();
                        System.out.println("Input Lebar");
                        double lebar = input.nextDouble();
                        double luasPersegiPanjang = panjang*lebar;
                        System.out.println("Luas Persegi Panjang = " + luasPersegiPanjang);
                        break;
                    case 3 :
                        System.out.println("Input Alas");
                        double alas = input.nextDouble();
                        System.out.println("Input Tinggi");
                        double tinggi = input.nextDouble();
                        double luasSegitiga = (alas*tinggi)/2;
                        System.out.println("Luas Segitiga = " + luasSegitiga);
                        break;
                    case 4 :
                        System.out.println("Input Jari-jari");
                        double jari = input.nextDouble();
                        double luasLingkaran = Math.PI*Math.pow(jari, 2);
                        System.out.println("Luas Lingkaran = " + luasLingkaran);
                        break;
                    case 5 :
                        System.out.println("Input Alas");
                        double alas5 = input.nextDouble();
                        System.out.println("Input Tinggi");
                        double tinggiJajargenjang = input.nextDouble();
                        double luasJajargenjang = alas5*tinggiJajargenjang;
                        System.out.println("Luas Jajar Genjang = " + luasJajargenjang);
                        break;
                    case 6 :
                        System.out.println("Input Sisi Atas");
                        double sisiAtas = input.nextDouble();
                        System.out.println("Input Sisi Bawah");
                        double sisiBawah = input.nextDouble();
                        System.out.println("Input Tinggi");
                        double tinggi6 = input.nextDouble();
                        double luasTrapesium = ((sisiAtas+sisiBawah)*tinggi6)/2;
                        System.out.println("Luas Trapesium = " + luasTrapesium);
                        break;
                    case 7 :
                        System.out.println("Input D1");
                        double d1 = input.nextDouble();
                        System.out.println("Input D2");
                        double d2 = input.nextDouble();
                        double luasBelahketupat = (d1*d2)/2;
                        System.out.println("Luas Belah Ketupat = " + luasBelahketupat);
                        break;
                    case 8 :
                        System.out.println("Input D1");
                        double d18 = input.nextDouble();
                        System.out.println("Input D2");
                        double d28 = input.nextDouble();
                        double luasLayang = (d18*d28)/2;
                        System.out.println("Luas Layang-Layang = " + luasLayang);
                        break;
                }
                break;
        
            case 2 :
                System.out.printf("Pilih bangun datar \n1.Kubus\n2.Balok\n3.LimasSegiempat\n4.PrismaSegitiga\n5.LimasSegitiga\n6.Tabung\n7.Kerucut\n8.Bola");
                System.out.println("\nInput angka sesuai dengan nomor bangun ruang yang diinginkan");
                int angka2 = input.nextInt();

                switch (angka2) {
                    case 1 :
                        System.out.println("Input Rusuk");
                        double rusuk = input.nextDouble();
                        double volumeKubus = Math.pow(rusuk, 3);
                        System.out.println("Volume Kubus = " + volumeKubus);
                        break;
                    case 2 :
                        System.out.println("Input Panjang");
                        double panjangBalok = input.nextDouble();
                        System.out.println("Input Lebar");
                        double lebarBalok = input.nextDouble();
                        System.out.println("Input Tinggi");
                        double tinggiBalok = input.nextDouble();
                        double volumeBalok = panjangBalok*lebarBalok*tinggiBalok;
                        System.out.println("Volume Balok = " + volumeBalok);
                        break;
                    case 3 :
                        System.out.println("Input Sisi Alas");
                        double sisiAlasLimassegiempat = input.nextDouble();
                        System.out.println("Input Tinggi");
                        double tinggiLimassegiempat = input.nextDouble();
                        double volumeLimasegiempat = 1/3*(sisiAlasLimassegiempat*sisiAlasLimassegiempat)*tinggiLimassegiempat;
                        System.out.println("Volume Limas Segiempat = " + volumeLimasegiempat);
                        break;
                    case 4 :
                        System.out.println("Input Alas");
                        double alasPrisma = input.nextDouble();
                        System.out.println("Input Tinggi Alas");
                        double tinggiAlasPrisma = input.nextDouble();
                        System.out.println("Input Tinggi Prisma");
                        double tinggiPrisma = input.nextDouble();
                        double volumePrismaSegitiga = 1/2*(alasPrisma*tinggiAlasPrisma)*tinggiPrisma;
                        System.out.printf("volume prisma segitiga %f",volumePrismaSegitiga);
                        break;
                    case 5 :
                        System.out.println("Input Alas");
                        double alasLimasSegitiga = input.nextDouble();
                        System.out.println("Input Tinggi Alas");
                        double tinggiAlasLimasSegitiga = input.nextDouble();
                        System.out.println("Input Tinggi Limas Segitiga");
                        double tinggiLimasSegitiga = input.nextDouble();
                        double volumeLimasSegitiga = 1/6*(alasLimasSegitiga*tinggiAlasLimasSegitiga)*tinggiLimasSegitiga;
                        System.out.println("Volume Limas Segitiga " + volumeLimasSegitiga);
                        break;
                    case 6 :
                        System.out.println("Input Jari-Jari Tabung");
                        double jariTabung = input.nextDouble();
                        System.out.println("Input Tinggi Tabung");
                        double tinggiTabung = input.nextDouble();
                        double volumeTabung = Math.PI*Math.pow(jariTabung, 2)*tinggiTabung;
                        System.out.println("Volume Tabung = " + volumeTabung);
                        break;
                    case 7 :
                        System.out.println("Input Jari-Jari Kerucut");
                        double jariKerucut = input.nextDouble();
                        System.out.println("Input Tinggi Kerucut");
                        double tinggiKerucut = input.nextDouble();
                        double volumeKerucut = 1/3*Math.PI*Math.pow(jariKerucut, 2)*tinggiKerucut;
                        System.out.println("Volume Kerucut = " + volumeKerucut);
                        break;
                    case 8 :
                        System.out.println("Input Jari-Jari Bola");
                        double jariBola = input.nextDouble();
                        double volumeBola = 4/3*Math.PI*Math.pow(jariBola, 3);
                        System.out.println("Volume Bola = " + volumeBola);
                        break;
                }
                break;

        }
    }
}