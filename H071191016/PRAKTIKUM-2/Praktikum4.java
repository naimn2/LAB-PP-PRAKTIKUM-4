import java.util.InputMismatchException;
import java.util.Scanner;
class Praktikum4{
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        int genap = 0;
        int ganjil = 0;
        int positif = 0;
        int negatif = 0;

        try{    
            int bilangan1 = yuk.nextInt();
            if (bilangan1 % 2 == 0){
                genap++;
                if (bilangan1 > 0){
                    positif++;
                }else if (bilangan1 < 0){
                    negatif++;
                }
            }
            else{
                ganjil++;
                if (bilangan1 > 0){
                    positif++;
                }else if (bilangan1 < 0){
                    negatif++;
                }
            }
            int bilangan2 = yuk.nextInt();
            if (bilangan2 % 2 == 0){
                genap++;
                if (bilangan2 > 0){
                    positif++;
                }else if (bilangan2 < 0){
                    negatif++;
                }
            }
            else{
                ganjil++;
                if (bilangan2 > 0){
                    positif++;
                }else if (bilangan2 < 0){
                    negatif++;
                }
            }
            int bilangan3 = yuk.nextInt();
            if (bilangan3 % 2 == 0){
                genap++;
                if (bilangan2 > 0){
                    positif++;
                }else if (bilangan2 < 0){
                    negatif++;
                }
            }
            else{
                ganjil++;
                if (bilangan3 > 0){
                    positif++;
                }else if (bilangan3 < 0){
                    negatif++;
                }
            }
            int bilangan4 = yuk.nextInt();
            if (bilangan4 % 2 == 0){
                genap++;
                if (bilangan4 > 0){
                    positif++;
                }else if (bilangan4 < 0){
                    negatif++;
                }
            }
            else{
                ganjil++;
                if (bilangan4 > 0){
                    positif++;
                }else if (bilangan4 < 0){
                    negatif++;
                }
            }
            int bilangan5 = yuk.nextInt();
            if (bilangan5 % 2 == 0){
                genap++;
                if (bilangan5 > 0){
                    positif++;
                }else if (bilangan5 < 0){
                    ganjil++;
                }
            }
            else{
                ganjil++;
                if (bilangan5 > 0){
                    positif++;
                }else if (bilangan5 < 0){
                    negatif++;
                }
            }
            System.out.printf("%d Bilangan Genap \n%d Bilangan Ganjil \n%d Bilangan Positif \n%d Bilangan Negatif", genap,ganjil,positif,negatif);
        }
        catch (InputMismatchException ime){
            System.out.println("Inputan Tidak Valid");
        }
    }
}
        