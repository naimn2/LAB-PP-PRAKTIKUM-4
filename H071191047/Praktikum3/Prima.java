import java.util.Scanner;
class Prima{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("input angka = ");
        int a = sc.nextInt();
        sc.close();
        for (int i = 2; i * i <=a; i++){
            if (a % i== 0){
                System.out.println(a+ " bukan bilangan prima ");
                return;

            }
        }
        if ( a != 1 && a !=0 && a >=0){
            System.out.println(a + "  bilangan prima ");

        }
        else{
            System.out.println(a + " bukan bilangan prima ");

        }
    }
}