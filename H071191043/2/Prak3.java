import java.util.Scanner;
class Prak3{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
           String input1 = sc.nextLine();
           String input2 = sc.nextLine();
           String input3 = sc.nextLine();
           if (input1.equalsIgnoreCase("vertebrado")){
               if (input2.equalsIgnoreCase("ave")){
                   if (input3.equalsIgnoreCase("carnivero")){
                       System.out.println("agula");
                   }
                   else if (input3.equalsIgnoreCase("onivoro")){
                       System.out.println("pomba");
                   }
               }
               else if (input2.equalsIgnoreCase("mamifero")){
                   if (input3.equalsIgnoreCase("onivoro")){
                       System.out.println("homem");
                   }
                   else if (input3.equalsIgnoreCase("herbivoro")){
                       System.out.println("vaca");
                   }
               }
           }
           else if (input1.equalsIgnoreCase("invertebrado")){
               if (input2.equalsIgnoreCase("inseto")){
                   if (input3.equalsIgnoreCase("hematofago")){
                       System.out.println("pulga");
                   }
                   else if (input3.equalsIgnoreCase("herbivoro")){
                       System.out.println("lagarta");
                   }
               }
               else if (input2.equalsIgnoreCase("anelideo")){
                   if (input3.equalsIgnoreCase("hematofago")){
                       System.out.println("sanguessuga");
                   }
                   else if (input3.equalsIgnoreCase("onivoro")){
                       System.out.println("minhoca");
                   }
               }
           }
           else {
               throw new Exception();
           }
        
        } catch (Exception e) {
            System.out.println("Invalid input");
        }sc.close();
    }
}