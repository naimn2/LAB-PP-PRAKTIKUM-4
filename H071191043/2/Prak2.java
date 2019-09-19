import java.util.Scanner;
class Prak2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("MENU UTAMA");
        System.out.println("1. Mencari luas bangun datar");
        System.out.println("2. Mencari volume bangun ruang");
        System.out.println("Masukkan pilihan = ");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("Pilihan menu 1");
                System.out.println("1. Persegi, 2. Persegi panjang, 3. Segitiga, 4. Lingkaran, 5. Jajar genjang, 6. Trapesium, 7. Belah Ketupat, 8. Layang - layang");
                System.out.println("Masukkan pilihan = ");
                int pilihan1 = sc.nextInt();
            switch (pilihan1) {
                case 1: 
                    System.out.println("Input sisi");
                    double s1 = sc.nextDouble();
                    double hasil1 = s1 * s1;
                    System.out.println("Luas persegi = " + hasil1);
                    break;
                case 2:
                    System.out.println("Input panjang");
                    double p2 = sc.nextDouble();
                    System.out.println("Input lebar");
                    double l2 = sc.nextDouble();
                    double hasil2 = p2 * l2;
                    System.out.println("Luas persegi panjang = " + hasil2);
                    break;
                case 3:
                    System.out.println("Input alas");
                    double a3 = sc.nextDouble();
                    System.out.println("Input tinggi");
                    double t3 = sc.nextDouble();
                    double hasil3 = (a3 * t3)/2;
                    System.out.println("Luas segitiga = " + hasil3);
                    break;
                case 4:
                    System.out.println("Input jari - jari = ");
                    double jari4 = sc.nextDouble();
                    double hasil4 = Math.PI * Math.pow(jari4, 2);
                    System.out.println("Luas lingkaran = " + hasil4);
                    break;
                case 5:
                    System.out.println("Input alas = ");
                    double a5 = sc.nextDouble(); 
                    System.out.println("Input tinggi = ");
                    double t5 = sc.nextDouble();
                    double hasil5 = a5 * t5;
                    System.out.println("Luas jajar genjang = " + hasil5);
                    break;
                case 6:
                    System.out.println("Input panjang sisi sejajar");
                    double p6 = sc.nextDouble();
                    System.out.println("Input tinggi = ");
                    double t6= sc.nextDouble();
                    double hasil6 = (p6 * t6)/2;
                    System.out.println("Luas trapesium = " + hasil6);
                    break;
                case 7:
                    System.out.println("Input alas = ");
                    double a7 = sc.nextDouble();
                    System.out.println("Input tinggi");
                    double t7 = sc.nextDouble();
                    double hasil7 = a7 * t7;
                    System.out.println("Luas belah ketupat = " + hasil7);
                    break;
                case 8:
                    System.out.println("Input diagonal 1 = ");
                    double d1 = sc.nextDouble();
                    System.out.println("Input diagonal 2 = ");
                    double d2 = sc.nextDouble();
                    double hasil = (d1 * d2)/2;
                    break;
            }
            break;
            case 2:
                System.out.println("Pilihan menu 2");
                System.out.println("1. Kubus, 2. Balok, 3. Prisma Segitiga, 4. Limas Segiempat, 5. Limas Segitiga, 6. Tabung, 7. Kerucut, 8. Bola");
                System.out.println("Masukkan pilihan = ");
                int pilihan2 = sc.nextInt();
            switch (pilihan2){
                case 1:
                    System.out.println("Input sisi");
                    double s01 = sc.nextDouble();
                    double hasil01 = Math.pow(s01 , 3);
                    System.out.println("Volume kubus = " + hasil01);
                    break;
                case 2:
                    System.out.println("Input panjang = ");
                    double p02 = sc.nextDouble();
                    System.out.println("Input lebar = ");
                    double l02 = sc.nextDouble();
                    System.out.println("Input tinggi");
                    double t02 = sc.nextDouble();
                    double hasil02 = p02 * l02 * t02;
                    System.out.println("Volume balok = " + hasil02); 
                    break;
                case 3:
                    System.out.println("Input panjang = ");
                    double p03 = sc.nextDouble();
                    System.out.println("Input lebar = ");
                    double l03 = sc.nextDouble();
                    System.out.println("Input tinggi");
                    double t03 = sc.nextDouble();
                    double hasil03 = (p03 * l03 * t03)/2;
                    System.out.println("Volume prisma segitiga = " + hasil03);
                    break;
                case 4:
                    System.out.println("Input panjang = ");
                    double p04 = sc.nextDouble();
                    System.out.println("Input lebar = ");
                    double l04 = sc.nextDouble();
                    System.out.println("Input tinggi");
                    double t04 = sc.nextDouble();
                    double hasil04 = (p04 * l04 * t04)/3;
                    System.out.println("Volume limas segiempat = " + hasil04);
                    break;
                case 5:
                    System.out.println("Input alas = ");
                    double a05 = sc.nextDouble();
                    System.out.println("Input tinggi = ");
                    double t05 = sc.nextDouble();
                    System.out.println("Input tinggi Limas");
                    double tp05 = sc.nextDouble();
                    double hasil05 = (a05 * t05 * tp05)/6;
                    System.out.println("Volume limas segitiga = " + hasil05);
                    break;
                case 6:
                    System.out.println("Input jari - jari = ");
                    double r06 = sc.nextDouble();
                    System.out.println("Input tinggi");
                    double t06 = sc.nextDouble();
                    double hasil06 = (Math.PI * Math.pow(r06 , 2) * t06);
                    System.out.println("Volume tabung = " + hasil06);
                    break;
                case 7:
                    System.out.println("Input jari - jari = ");
                    double r07 = sc.nextDouble();
                    System.out.println("Input tinggi");
                    double t07 = sc.nextDouble();
                    double hasil07 = (Math.PI * Math.pow(r07 , 2) * t07);
                    System.out.println("Volume kerucut = " + hasil07);
                    break;
                case 8:
                    System.out.println("Input jari - jari = ");
                    double r08 = sc.nextDouble();
                    double hasil08 = (Math.PI * Math.pow(r08 , 2) * 4)/3;
                    System.out.println("Volume bola = " + hasil08);
                    break;
            }
                throw new Exception();
        }
        }
        catch (Exception e){
            System.out.println("Inputan tidak valid");
        }
        finally {   
    sc.close(); 
        }  
    }
}