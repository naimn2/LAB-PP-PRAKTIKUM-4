import java.util.Scanner;
class Animalia{
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        String iPertama =key.nextLine();
        String iKedua = key.nextLine();
        String iKetiga = key.nextLine();    
        if(iPertama.equalsIgnoreCase("vertebrado")&iKedua.equalsIgnoreCase("ave")&iKetiga.equalsIgnoreCase("carnivoro")){
            System.out.println("aguia");
        }
        else if(iPertama.equalsIgnoreCase("vertebrado")&iKedua.equalsIgnoreCase("ave")&iKetiga.equalsIgnoreCase("onivoro")){
            System.out.println("pomba");
        }
        else if(iPertama.equalsIgnoreCase("vertebrado")&iKedua.equalsIgnoreCase("mamifero")&iKetiga.equalsIgnoreCase("onivoro")){
            System.out.println("homen");
        }
        else if(iPertama.equalsIgnoreCase("vertebrado")&iKedua.equalsIgnoreCase("mamiforo")&iKetiga.equalsIgnoreCase("herbivoro")){
            System.out.println("vaca");
        }
        else if(iPertama.equalsIgnoreCase("Invertebrado")&iKedua.equalsIgnoreCase("inseto")&iKetiga.equalsIgnoreCase("Hematofago")){
            System.out.println("pulga");
        }
        else if(iPertama.equalsIgnoreCase("Invertebrado")&iKedua.equalsIgnoreCase("inseto")&iKetiga.equalsIgnoreCase("Herbivoro")){
            System.out.println("lagarta");
        }
        else if(iPertama.equalsIgnoreCase("Invertebrado")&iKedua.equalsIgnoreCase("anelideo")&iKetiga.equalsIgnoreCase("Hematofago")){
            System.out.println("sanguessuga");
        }
        else if(iPertama.equalsIgnoreCase("Invertebrado")&iKedua.equalsIgnoreCase("anelideo")&iKetiga.equalsIgnoreCase("onivoro")){
            System.out.println("minhoca");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}