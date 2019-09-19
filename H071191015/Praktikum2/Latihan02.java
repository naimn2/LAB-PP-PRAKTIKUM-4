import java.util. Scanner;
class Latihan02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Waktu Acara Dimulai");
        int jamMulai = input.nextInt();
        int menitMulai = input.nextInt();
        System.out.println("Masukkan Waktu Acara Berakhir");
        int jamAkhir = input.nextInt();
        int menitAkhir = input.nextInt();

        int durasiJam, durasiMenit;

        if (jamMulai>jamAkhir) {
            if (menitAkhir>menitMulai) { 
                durasiJam = 24 - (jamMulai-jamAkhir);
                durasiMenit = menitAkhir-menitMulai;
            } else if (menitMulai>menitAkhir) {
                durasiJam = 24 - (jamMulai-jamAkhir)-1;
                durasiMenit = 60-(menitMulai-menitAkhir);
            } else {
                durasiJam = 24 - (jamMulai-jamAkhir);
                durasiMenit = menitMulai-menitAkhir;
            }
        } else { // jamAkhir>jamMulai
            if (menitAkhir>menitMulai) {
                durasiJam = jamAkhir-jamMulai;
                durasiMenit = menitAkhir-menitMulai;
            } else if (menitMulai>menitAkhir) {
                durasiJam = ((jamAkhir-jamMulai)+23)%24; 
                durasiMenit = 60 - (menitMulai-menitAkhir);
            } else {
                durasiJam = jamAkhir-jamMulai;
                durasiMenit = menitMulai-menitAkhir;
            }
        }
        System.out.println("Durasi Acara");
        System.out.printf("%02d : %02d", durasiJam, durasiMenit);
        
    }
}