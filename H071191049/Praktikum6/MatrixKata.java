import java.util.Scanner;
class MatrixKata{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        String input = san.nextLine();
        String newInput ="";
        //pengubahan inputan menjadi inputan
        for(int i=0;i<input.length();i++){
            int a = input.codePointAt(i);
            //jika panjang inputan genap maka tidak perlu diubah ke ASCI tpi klo ganjil diubah ke ASCI
            String c = input.length()%2==0?String.valueOf(a):input.substring(i,i+1);
            //ganti indeks genap jadi String c
            String simpan=(i+1)%2==0?c:input.substring(i,i+1);
            newInput+=simpan;
        }
        //Jika Panjang Inputan baru<15 maka program berhenti
        String b=newInput;
        if(b.length()<15){
            System.out.println("Input tidak valid");
            return;
        }
        //berfungsi untuk mengetahui panjang isi matrix 0,0
        int panjangperEmpat = b.length()%16==0?b.length()/16:(b.length()/16)+1;
        //perulangan membentuk matrix
        for(int i=0;i<panjangperEmpat*16;i++){
            System.out.print(i%(panjangperEmpat*4)==0&&i!=0?"\n":"");
            System.out.print((i%panjangperEmpat)==0&&i%(panjangperEmpat*4)!=0?" ":"");
            System.out.print(i<b.length()?b.charAt(i):"?");
        }
    }
}