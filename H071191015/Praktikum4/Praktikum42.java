import java.util.Scanner;
class Praktikum42 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int banyakNilai = sc.nextInt();
        boolean nilaiSama = false;

        int arr[] = new int[banyakNilai];

        for (int i = 0; i < banyakNilai; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < banyakNilai; i++) {
            for (int j = i+1; j < banyakNilai; j++) {
                if (arr[i]==arr[j]) {
                    nilaiSama = true;
                    System.out.println("Terdapat Angka Yang Sama Yaitu " + arr[i] + " yang Terletak di Indeks " + i + "," + j);
                }
            }
        }

        if (!nilaiSama) {
                System.out.println("Tidak Ada Nilai Yang Sama");
            }
    }
}