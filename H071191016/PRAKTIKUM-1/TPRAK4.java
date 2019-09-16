import java.util.Scanner;
class TPRAK4{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String nama = input.nextLine();
    float tinggiBadan = input.nextFloat();
    float beratBadan = input.nextFloat();
    float persentase = input.nextFloat();
    float ideal = tinggiBadan - 100 - persentase/100 * (tinggiBadan - 100);
    //Persentasi Kenaikan = Laki-laki : 10% dan Perempuan : 15%
    float target = ideal - beratBadan;

    System.out.println("Nama ="+ nama);
    System.out.printf("Tinggi Badan = %.1f cm", tinggiBadan);
    System.out.printf("Berat Badan = %.1f kg", beratBadan);
    System.out.printf("Berat Badan Ideal = %.1f kg", ideal);
    System.out.printf("Target Berat Badan Ideal = %.1f kg", target);
    }
}