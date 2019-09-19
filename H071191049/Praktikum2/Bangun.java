import java.util.Scanner;
class Bangun{
    public static void main(String[] args) {
        Scanner key=new Scanner (System.in);
        Double a,b,c;
        System.out.printf("**MENU**\n1. Mencari Luas Bangun Datar\n2. Mencari Volume Bangun Ruang\nInput angka sesuai dengan Menu Yang diinginkan :\n");
        int menu=key.nextInt();
        switch(menu){
            case 1:
                System.out.printf("**Pilih Bangun Datar**\n1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Lingkaran\n5. Jajar Genjang\n6. Trapesium\n7. Belah Ketupat\n8. Layang-Layang\n\nInput angka sesuai dengan nomor bangun datar yang diinginkan :\n");
                int bangunDatar=key.nextInt();
                switch(bangunDatar){
                    case 1:
                        System.out.println("Input sisi");
                        a=key.nextDouble();
                        System.out.printf("Luas Persegi \n%.1f",a*a); 
                        break;              
                    case 2:
                        System.out.println("input panjang");
                        a=key.nextDouble();
                        System.out.println("input lebar");
                        b=key.nextDouble();
                        System.out.printf("Luas Persegi Panjang\n%.1f",a*b);
                        break;
                    case 3:
                        System.out.println("input alas");
                        a=key.nextDouble();
                        System.out.println("input tinggi");
                        b=key.nextDouble();
                        System.out.printf("Luas Segitiga\n%.1f",(a*b)/2);
                        break;
                    case 4:
                        System.out.println("input jari-jari");
                        a=key.nextDouble();
                        System.out.printf("Luas Lingkaran\n%.1f",Math.pow(a, 2)*Math.PI);
                        break;
                    case 5:
                        System.out.println("input alas");
                        a=key.nextDouble();
                        System.out.println("input tinggi");
                        b=key.nextDouble();
                        System.out.printf("Luas Jajargenjang\n%.1f",a*b);
                        break;
                    case 6:
                        System.out.println("input sisi 1");
                        a=key.nextDouble();
                        System.out.println("input sisi 2");
                        b=key.nextDouble();
                        System.out.println("input tinggi");
                        c=key.nextDouble();
                        System.out.printf("Luas Trapesium\n%.1f",((a+b)*c)/2);
                        break;
                    case 7:
                        System.out.println("input diagonal 1");
                        a=key.nextDouble();
                        System.out.println("input diagonal 2");
                        b=key.nextDouble();
                        System.out.printf("Luas Belah Ketupat\n%.1f",(a*b)/2);
                        break;
                    case 8:
                        System.out.println("input diagonal 1");
                        a=key.nextDouble();
                        System.out.println("input diagonal 2");
                        b=key.nextDouble();
                        System.out.printf("Luas Layang-layang\n%.1f",(a*b)/2);
                        break;
                    default:
                        System.out.println("input salah");
                        break;
                }break;
            case 2:
                System.out.printf("**Pilih Bangun Ruang**\n1. Kubus\n2. Balok\n3. Prisma Segitiga\n4. Limas Segitiga\n5. Limas Segiempat\n6. Tabung\n7. Kerucut\n8. Bola\n\nInput angka sesuai dengan nomor bangun datar yang diinginkan :\n");
                int bangunRuang=key.nextInt();
                switch(bangunRuang){
                    case 1:
                        System.out.println("Input sisi");
                        a=key.nextDouble();
                        System.out.printf("Volume Kubus \n%.1f",a*a*a);       
                        break;         
                    case 2:
                        System.out.println("input panjang");
                        a=key.nextDouble();
                        System.out.println("input lebar");
                        b=key.nextDouble();
                        System.out.println("input tinggi");
                        c=key.nextDouble();
                        System.out.printf("Volume Balok\n%.1f",a*b*c);
                        break;
                    case 3:
                        System.out.println("input sisi 1 segitiga");
                        a=key.nextDouble();
                        System.out.println("input sisi 2 segitiga");
                        b=key.nextDouble();
                        System.out.println("input tinggi prisma segitiga");
                        c=key.nextDouble();
                        System.out.printf("Volume Prisma segitiga\n%.1f",(a*b*c)/2);
                        break;
                    case 4:
                        System.out.println("input alas segitga");
                        a=key.nextDouble();
                        System.out.println("input tinggi segitiga");
                        b=key.nextDouble();
                        System.out.println("input tinggi limas");
                        c=key.nextDouble();
                        System.out.printf("Volume Limas Segitiga\n%.1f",(((a*b)/2)*c)/3);
                        break;
                    case 5:
                        System.out.println("input sisi 1 alas");
                        a=key.nextDouble();
                        System.out.println("input sisi 2 alas");
                        b=key.nextDouble();
                        System.out.println("input tinggi limas");
                        c=key.nextDouble();
                        System.out.printf("Volume Limas Segiempat\n%.1f",(a*b*c)/3);
                        break;
                    case 6:
                        System.out.println("input jari-jari lingkaran");
                        a=key.nextDouble();
                        System.out.println("input tinggi tabung");
                        b=key.nextDouble();
                        System.out.printf("Volume Tabung\n%.1f",Math.PI*Math.pow(a, 2)*b);
                        break;
                    case 7:
                        System.out.println("input jari-jari alas");
                        a=key.nextDouble();
                        System.out.println("input tinggi kerucut");
                        b=key.nextDouble();
                        System.out.printf("Volume kerucut\n%.1f",(Math.PI*Math.pow(a, 2)*b)/3);
                        break;
                    case 8:
                        System.out.println("input jari-jari bola");
                        a=key.nextDouble();
                        System.out.printf("Volume bola\n%.1f",(Math.PI*Math.pow(a, 3))*4/3);
                        break;
                    default:
                        System.out.println("input salah");
                        break;
                }break;
            default:
                System.out.println("input salah");
                break;
        }
    }
}