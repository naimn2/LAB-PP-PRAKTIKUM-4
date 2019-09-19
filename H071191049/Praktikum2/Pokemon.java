import java.util.Scanner;
class Pokemon{
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        String namaPokemon_1=key.next();
        String elemen_1=key.next();
        String namaPokemon_2=key.next();
        String elemen_2=key.next();
        if (elemen_2.equalsIgnoreCase("water")){
            if(elemen_1.equalsIgnoreCase("ground")||elemen_1.equalsIgnoreCase("Fire")){
                System.out.println(namaPokemon_2);
            }
            else if(elemen_1.equalsIgnoreCase("electric")||elemen_1.equalsIgnoreCase("ice")){
                System.out.println(namaPokemon_1);
            }
            else if(elemen_1.equalsIgnoreCase("water")){
                System.out.println("draw");
            }
            else{
                System.out.println("Input elemen nothing");
            }
        }
        else if(elemen_2.equalsIgnoreCase("ice")){
            if(elemen_1.equalsIgnoreCase("ground")||elemen_1.equalsIgnoreCase("water")){
                System.out.println(namaPokemon_2);
            }
            else if(elemen_1.equalsIgnoreCase("electric")||elemen_1.equalsIgnoreCase("fire")){
                System.out.println(namaPokemon_1);
            }
            else if(elemen_1.equalsIgnoreCase("ice")){
                System.out.println("draw");
            }
            else{
                System.out.println("Input elemen nothing");
            }
        }
        else if(elemen_2.equalsIgnoreCase("fire")){
            if(elemen_1.equalsIgnoreCase("ice")||elemen_1.equalsIgnoreCase("electric")){
                System.out.println(namaPokemon_2);
            }
            else if(elemen_1.equalsIgnoreCase("ground")||elemen_1.equalsIgnoreCase("water")){
               System.out.println(namaPokemon_1);
            }
            else if(elemen_1.equalsIgnoreCase("fire")){
                System.out.println("draw");
            }
            else{
                System.out.println("Input elemen nothing");
            }
        }
        else if(elemen_2.equalsIgnoreCase("electric")){
            if(elemen_1.equalsIgnoreCase("ice")||elemen_1.equalsIgnoreCase("water")){
                System.out.println(namaPokemon_2);
            }
            else if(elemen_1.equalsIgnoreCase("ground")||elemen_1.equalsIgnoreCase("fire")){
                System.out.println(namaPokemon_1);
            }
            else if(elemen_1.equalsIgnoreCase("electric")){
                System.out.println("draw");
            }
            else{
                System.out.println("Input elemen nothing");
            }
        }
        else if(elemen_2.equalsIgnoreCase("ground")){
            if(elemen_1.equalsIgnoreCase("electric")||elemen_1.equalsIgnoreCase("fire")){
                System.out.println(namaPokemon_2);
            }
            else if(elemen_1.equalsIgnoreCase("ice")||elemen_1.equalsIgnoreCase("water")){
                System.out.println(namaPokemon_1);
            }
            else if(elemen_1.equalsIgnoreCase("ground")){
                System.out.println("draw");
            }
            else{
                System.out.println("Input elemen nothing");
            }
        }
        else{
            System.out.println("Input elemen nothing ");
        }
    }      
}
