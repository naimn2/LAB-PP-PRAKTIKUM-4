import java.util.Scanner;
class BangunDR{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("pilihan");
        System.out.println("1.Bangun Datar, 2. Bangun Ruang");
        System.out.println("Input pilihan");
        int pilihan = sc.nextInt(); 
        switch (pilihan) {
            case 1:
                System.out.println("Pilih");
                System.out.println("1.Persegi, 2.Persegi Panjang, 3.Segitiga, 4.Lingkaran, 5.Jajargenjang, 6.Trapesium, 7.Belah Ketupat, 8.Layang - Layang");
                System.out.println("Input pilihan = ");
                int pilih = sc.nextInt();
                switch (pilih) {
                    case 1: 
                        System.out.println("Input sisi = ");
                        int sisi1 = sc.nextInt();
                        luasPersegi(sisi1);
                        System.out.println("Luas Persegi = " + luasPersegi(sisi1));
                        break;
                    case 2:
                        System.out.println("Input panjang = ");
                        int panjang2 = sc.nextInt();
                        System.out.println("Input lebar = ");
                        int lebar2 = sc.nextInt();
                        luasPersegiPanjang(panjang2, lebar2);
                        System.out.println("Luas Persegi Panjang = " + luasPersegiPanjang(panjang2, lebar2));
                        break;
                    case 3:
                        System.out.println("Input alas = ");
                        int alas3 = sc.nextInt();
                        System.out.println("Input tinggi = ");
                        int tinggi3 = sc.nextInt();
                        luasSegitiga(alas3, tinggi3);
                        System.out.println("Luas Segitiga = " + luasSegitiga(alas3, tinggi3));
                        break;
                    case 4:
                        System.out.println("jari - jari = ");
                        int jari4 = sc.nextInt();
                        luasLingkaran(jari4);
                        System.out.println("Luas Lingkaran = " + luasLingkaran(jari4));
                        break;
                    case 5:
                        System.out.println("Input alas = ");
                        int alas5 = sc.nextInt();
                        System.out.println("Input tinggi = ");
                        int tinggi5 = sc.nextInt();
                        luasJargen(alas5, tinggi5);
                        System.out.println("Luas jajargenjang = " + luasJargen(alas5, tinggi5));
                        break;
                    case 6:
                        System.out.println("input sisi1 = ");
                        int sisi16 = sc.nextInt();
                        System.out.println("Input sisi2 = ");
                        int sisi26 = sc.nextInt();
                        System.out.println("Input tinggi");
                        int tinggi6 = sc.nextInt();
                        luasTrapesium(sisi16, sisi26, tinggi6);
                        System.out.println("Luas Trapesium = " + luasTrapesium(sisi16, sisi26, tinggi6));
                        break;
                    case 7:
                        System.out.println("Input diagonal1 = ");
                        int d17 = sc.nextInt();
                        System.out.println("Input diagonal2 = ");
                        int d27 = sc.nextInt();
                        luasBelpat(d17, d27);
                        System.out.println("Luas Belah Ketupat = " + luasBelpat(d17, d27));
                        break;
                    case 8:
                        System.out.println("Input diagonal1 = ");
                        int d18 = sc.nextInt();
                        System.out.println("Input diagonal2 = ");
                        int d28 = sc.nextInt();
                        luasLayang(d18, d28);
                        System.out.println("Luas Layang - layang = " + luasLayang(d18, d28));
                        break;
                }
                break;
            case 2:
                System.out.println("Pilih");
                System.out.println("1.Kubus, 2.Balok, 3.Prisma Segitiga, 4.Limas Segitiga, 5.Limas Segiempat, 6.Tabung, 7.Kerucut, 8.Bola");
                System.out.println("Input pilihan = ");
                int search = sc.nextInt();
                switch (search) {
                    case 1: 
                        System.out.println("Input sisi = ");
                        int sisi01 = sc.nextInt();
                        volumeKubus(sisi01);
                        System.out.println("Volume Persegi = " + volumeKubus(sisi01));
                        break;
                    case 2:
                        System.out.println("Input panjang = ");
                        int panjang02 = sc.nextInt();
                        System.out.println("Input lebar = ");
                        int lebar02 = sc.nextInt();
                        System.out.println("Input tinggi = ");
                        int tinggi02 = sc.nextInt();
                        volumeBalok(panjang02, lebar02, tinggi02);
                        System.out.println("volume Balok = " + volumeBalok(panjang02, lebar02, tinggi02));
                        break;
                    case 3:
                        System.out.println("Input alas = ");
                        int alas03 = sc.nextInt();
                        System.out.println("Input tinggi = ");
                        int tinggi03 = sc.nextInt();
                        System.out.println("Input tinggi prisma = ");
                        int tinggiPrisma03 = sc.nextInt();
                        volumePrismaSegitiga(alas03, tinggi03, tinggiPrisma03);
                        System.out.println("Volume Prisma Segitiga = " + volumePrismaSegitiga(alas03, tinggi03, tinggiPrisma03));
                        break;
                    case 4:
                        System.out.println("Input alas = ");
                        int alas04 = sc.nextInt();
                        System.out.println("Input tinggi = ");
                        int tinggi04 = sc.nextInt();
                        System.out.println("Input tinggi Limas = ");
                        int tinggiLimas04 = sc.nextInt();
                        volumeLimasSegitiga(alas04, tinggi04, tinggiLimas04);
                        System.out.println("Volume Limas Segitiga = " + volumeLimasSegitiga(alas04, tinggi04, tinggiLimas04));
                        break;
                    case 5:
                        System.out.println("Input panjang = ");
                        int panjang05 = sc.nextInt();
                        System.out.println("Input lebar = ");
                        int lebar05 = sc.nextInt();
                        System.out.println("Input tinggi limas = ");
                        int tinggiLimas05 = sc.nextInt();
                        volumeLimasSegiempat(panjang05, lebar05, tinggiLimas05);
                        System.out.println("Volume Limas Segiempat = " + volumeLimasSegiempat(panjang05, lebar05, tinggiLimas05));
                        break;
                    case 6:
                        System.out.println("input jari - jari = ");
                        int jari06 = sc.nextInt();
                        System.out.println("Input tinggi");
                        int tinggi06 = sc.nextInt();
                        volumeTabung(jari06, tinggi06);
                        System.out.println("volume Tabung = " + volumeTabung(jari06, tinggi06));
                        break;
                    case 7:
                        System.out.println("input jari - jari = ");
                        int jari07 = sc.nextInt();
                        System.out.println("Input tinggi");
                        int tinggi07 = sc.nextInt();
                        volumeKerucut(jari07, tinggi07);
                        System.out.println("volume kerucut = " + volumeKerucut(jari07, tinggi07));
                        break;
                    case 8:
                        System.out.println("Input jari - jari = ");
                        int jari08 = sc.nextInt();
                        volumeBola(jari08);
                        System.out.println("Volume Bola = " + volumeBola(jari08));
                        break;
                }
            break;
        }   
    }
    static double luasPersegi(double s){
        double luasPersegi = s * s;
        return luasPersegi;
    }
    static double luasPersegiPanjang(double p, double l){
        double luasPersegiPanjang = p * l;
        return luasPersegiPanjang;
    }
    static double luasSegitiga(double a, double t){
        double luasSegitiga = (a * t)/2;
        return luasSegitiga;
    }
    static double luasLingkaran(double r){
        double luasLingkaran = (Math.PI * Math.pow(r, 2));
        return luasLingkaran;
    }
    static double luasJargen(double a, double t){
        double luasJargen = a * t;
        return luasJargen;
    }
    static double luasTrapesium(double s1, double s2, double t){
        double luasTrapesium = (s1 * s2 * t)/2;
        return luasTrapesium;
    }
    static double luasBelpat(double d1, double d2){
        double luasBelpat = (d1 * d2)/2;
        return luasBelpat;
    }
    static double luasLayang(double d1, double d2){
        double luasLayang = (d1 * d2)/2;
        return luasLayang;
    }
    static double volumeKubus(double s1){
        double volumeKubus = s1 * s1 * s1;
        return volumeKubus;
    } 
    static double volumeBalok(double p, double l, double t){
        double volumeBalok = p * l * t;
        return volumeBalok;
    }
    static double volumePrismaSegitiga(double a, double t, double tp){
        double volumePrismaSegitiga = ((a * t)/2) * tp;
        return volumePrismaSegitiga;
    }
    static double volumeLimasSegitiga(double a, double t, double tl){
        double volumeLimasSegitiga = ((a * t)/2) / 3 * tl;
        return volumeLimasSegitiga;
    }
    static double volumeLimasSegiempat(double p, double l, double tl){
        double volumeLimasSegiempat = ((p * l)/ 3) * tl;
        return volumeLimasSegiempat;
    }
    static double volumeTabung(double r, double t){
        double volumeTabung = Math.PI * r * r * t;
        return volumeTabung;
    }
    static double volumeKerucut(double r, double t){
        double volumeKerucut = (Math.PI * r * r * t);
        return volumeKerucut;
    }
    static double volumeBola(double r){
        double volumeBola = (4 * r * r * r)/2;
        return volumeBola;
    }
}