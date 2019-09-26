import java.util.Scanner;
class Fibonacci{
    public static void main(String[] args) {
     Scanner s1 = new Scanner (System.in);
     System.out.print("masukkan jumlah deret fibonacci =  ");
      int a= 0, b =1, hasil = 0;
      int c = s1.nextInt();
      if (c <= 0){
          System.out.println("inputan salah");
      }
      for (int i = 1; i <= c; i++) {
          a = b;
          b = hasil;
          System.out.print(hasil+" ");
          hasil = a+b;
      }
    }
}