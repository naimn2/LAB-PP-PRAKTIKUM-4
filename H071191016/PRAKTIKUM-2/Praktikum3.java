import java.util.Scanner;
class praktikum3{
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar \n2. Mencari Volume Bangun Ruang");
        System.out.println("Input angka sesuai dengan menu yang diinginkan :");
        int angka = yuk.nextInt();
        if (angka == 1){
                System.out.println("** Pilih Bangun Datar **");
                System.out.println("1. Persegi \n2. Persegi Panjang \n3. Segitiga \n4. Lingkaran \n5. Jajar Genjang \n6. Trapesium \n7. Belah Ketupat \n8. Layang-layang");
                System.out.println("Input angka sesuai dengan bangun datar yang diinginkan :");
        }else{
                System.out.println("** Pilih Bangun Ruang **");
                System.out.println("1. Kubus \n2. Balok \n3. Bola \n4. Tabung \n5. Kerucut");
                System.out.println("Input angka sesuai dengan bangun ruang yang diinginkan :");
        }                      
        int angka1 = yuk.nextInt();

        if (angka == 1 && angka1 == 1){
            int panjang = yuk.nextInt();
            int lebar = yuk.nextInt();
            System.out.println("Input Panjang \n"+ panjang);
            System.out.println("Input Lebar \n"+ lebar);
            double persegi = panjang*lebar;
            System.out.println("Luas Persegi = "+ persegi);
        }else if (angka == 1 && angka1 == 2){
            int panjang = yuk.nextInt();
            int lebar = yuk.nextInt();
            System.out.println("Input Panjang = "+ panjang);
            System.out.println("Input Lebar = "+ lebar);
            double persegiPanjang = panjang*lebar;
            System.out.println("Luas Persegi Panjang = "+ persegiPanjang);
        }else if (angka == 1 && angka1 == 3){
            double alas = yuk.nextDouble();
            double tinggi = yuk.nextDouble();
            System.out.println("Alas = \n"+ alas +"Tinggi = "+ tinggi);
            double segitiga = (0.5)*alas*tinggi;
            System.out.println("Luas Segitiga = "+ segitiga);
        }else if (angka == 1 && angka1 == 4){
            double jariJari = yuk.nextDouble();
            System.out.println("Jari-jari = "+ jariJari);
            double lingkaran = Math.PI * Math.pow (jariJari, 2);
            System.out.println("Luas Lingkaran ="+ lingkaran);
        }else if (angka == 1 && angka1 == 5){
            int alas = yuk.nextInt();
            int tinggi = yuk.nextInt();
            System.out.println("Alas = "+ alas +"\nTinggi = "+ tinggi);
            int jajarGenjang = alas*tinggi;
            System.out.println("Luas Jajar Genjang = "+ jajarGenjang);
        }else if (angka == 1 && angka1 == 6){
            double alas1 = yuk.nextDouble();
            double alas2 = yuk.nextDouble();
            double tinggi = yuk.nextDouble();
            System.out.println("Alas A = "+ alas1 +"\nAlas B = "+ alas2 +"\nTinggi = "+ tinggi);
            double trapesium = (alas1*alas2*tinggi)/2;
            System.out.println("Luas Trapesium = "+ trapesium);
        }else if (angka == 1 && angka1 == 7){
            double diagonal1 = yuk.nextDouble();
            double diagonal2 = yuk.nextDouble();
            System.out.println("Diagonal A = "+ diagonal1 +"\nDiagonal B = "+ diagonal2);
            double belahKetupat = (diagonal1*diagonal2);
            System.out.println("Luas Belah Ketupat = "+ belahKetupat);
        }else if (angka == 1 && angka1 == 8){
            double diagonal1 = yuk.nextDouble();
            double diagonal2 = yuk.nextDouble();
            System.out.println("Diagonal A = "+ diagonal1 +"\nDiagonal B = "+ diagonal2);
            double layangLayang = (diagonal1*diagonal2)/2;
            System.out.println("Luas Layang-Layang = "+ layangLayang);
        }
        if (angka == 2 && angka1 == 1){ //Kubus
            int sisi = yuk.nextInt();
            int sisi1 = yuk.nextInt();
            int sisi2 = yuk.nextInt();
            System.out.println("Sisi 1 = "+ sisi +"\nSisi 2 = "+ sisi1);
            int kubus = sisi*sisi1*sisi2;
            System.out.println("Volume Kubus = "+ kubus);
        }else if (angka == 2 && angka1 == 2){ // Balok
            int panjang = yuk.nextInt();
            int lebar = yuk.nextInt();
            int tinggi = yuk.nextInt();
            System.out.println("Panjang = "+ panjang +"\nLebar = "+ lebar +"\nTinggi = "+ tinggi);
            int balok = panjang*lebar*tinggi;
            System.out.println("Volume Balok = "+ balok);
        }else if (angka == 2 && angka1 == 3){ // Bola
            double jariJari = yuk.nextDouble();
            System.out.println("Jari-jari = "+ jariJari);
            double bola = 4/3 * Math.PI * Math.pow (jariJari, 3);
            System.out.println("Volume Bola = "+ bola);
        }else if (angka == 2 && angka1 == 4){ // Tabung
            double jariJari = yuk.nextDouble();
            double tinggi = yuk.nextDouble();
            System.out.println("Jari-jari = "+ jariJari +"\nTinggi = "+ tinggi);
            double tabung = Math.PI * Math.pow (jariJari, 2) * tinggi;
            System.out.println("Volume Tabung = "+ tabung);
        }else if (angka == 2 && angka1 == 5){ // Kerucut
            double jariJari = yuk.nextDouble();
            double tinggi = yuk.nextDouble();
            System.out.println("Jari-jari = "+ jariJari +"\nTinggi = "+ tinggi);
            double kerucut = 1/3 * Math.PI * Math.pow (jariJari, 2) * tinggi;
            System.out.println("Volume Kerucut = "+ kerucut);
        }
    
        }

        }