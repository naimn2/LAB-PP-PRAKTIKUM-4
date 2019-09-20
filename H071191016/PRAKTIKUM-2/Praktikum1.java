import java.util.Scanner;
class praktikum1{
    public static void main(String[] args) {
    Scanner yuk = new Scanner(System.in);
    int jam1,menit1; //acara dimulai
    jam1 = yuk.nextInt();
    menit1 = yuk.nextInt();
    System.out.println(jam1 +" "+ menit1);

    int jam2,menit2; //acara berakhir
    jam2 = yuk.nextInt();
    menit2 = yuk.nextInt();
    System.out.println(jam2 +" "+ menit2);

    int jam = 0;
    int menit = 0;

    if (jam2 >= jam1){
        if (menit2 >= menit1){
            jam = jam2 - jam1;
            menit = menit2 - menit1;
        }else{
            jam = (23 + jam2 - jam1)%24;
            menit = (menit2 + 60) - menit1;
    }
    }else if (menit2 >= menit1){
        jam = 24 - jam1 + jam2;
        menit = menit2 - menit1;
    }else{
        jam = 24 - jam1 - 1 + jam2;
        menit = (menit2 + 60) - menit1;
    }
    System.out.printf("%d : %d", jam,menit);
    yuk.close();
    }
}