import java.util.Scanner;
class Prak4{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pokemon1 = sc.next();
        String elemen1 = sc.next();
        String pokemon2 = sc.next();
        String elemen2 = sc.next();
       
        if (elemen1.equals("fire")){
            if (elemen2.equals("ice") || elemen2.equals("electric")){
                System.out.println(pokemon1);
            }
            else if (elemen2.equals("water") || elemen2.equals("ground")){
                System.out.println(pokemon2);
            }
        }
        else  if (elemen2.equals("fire")){
            if (elemen1.equals("ice") || elemen1.equals("electric")){
                System.out.println(pokemon2);
            }
            else if (elemen1.equals("water") || elemen1.equals("ground")){
                System.out.println(pokemon1);
            }
        }
        else if (elemen1.equals("ground")){
            if (elemen2.equals("ice") || elemen2.equals("water")){
                System.out.println(pokemon2);
            }
            else if (elemen2.equals("electric")){
                System.out.println(pokemon1);
            }
        }
        else if (elemen2.equals("ground")){
            if (elemen1.equals("ice") || elemen1.equals("water")){
                System.out.println(pokemon1);
            }
            else if (elemen1.equals("electric")){
                System.out.println(pokemon2);
            }
        }
        else if (elemen1.equals("electric")){
            if (elemen2.equals("water") || elemen2.equals("ice")){
                System.out.println(pokemon1);
            }
        }
        else if (elemen2.equals("electric")){
            if (elemen1.equals("water") || elemen1.equals("ice")){
                System.out.println(pokemon2);
            }
        }
        else {
            System.out.println("Inputan tidak valid");
        }
    sc.close();
    }
}