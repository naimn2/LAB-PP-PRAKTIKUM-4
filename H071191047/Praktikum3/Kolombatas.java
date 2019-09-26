import java.util.Scanner;

class Kolombatas {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("input kolom");
        int kolom = input.nextInt();
        System.out.println("input batas");
        int batas = input.nextInt();

        for (int i = 1; i <= batas; i++) {
          System.out.print(i+" ");
          if(i % kolom == 0){
              System.out.println();
          }  
        }


        
        
    }
}