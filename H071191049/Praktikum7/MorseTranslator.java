import java.util.Scanner;
import java.util.HashMap;
class MorseTranslator{
    public static void main(String[] args) {
        Scanner san = new Scanner (System.in);   
        while(true){
            System.out.print("\n\n---TRANSLATOR SANDI MORSE-LATIN--- \n1)Latin To Morse\n2)Morse To Latin\n->");
            int p = san.nextInt();
            san.nextLine();
            String latin [] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","1","2","3","4","5","6","7","8","9","0"};
            String mors [] = {"._","_...","_._.","_..",".",".._.","__.","....","..",".___","_._","._..","__","_.","___",".__.","__._","._.","...","_",".._","..._",".__","_.._","_.__","__..",".____","..___","...__","...._",".....","_....","__...","___..","_____.","_____"};
            switch (p){ 
                case 1:
                    System.out.print("WORDS = ");
                    String word = san.nextLine().toUpperCase();
                    HashMap<String, String>morse = new HashMap<>();
                    System.out.print("->");
                    for(int j=0;j<latin.length;j++){
                        morse.put(latin[j],mors[j]);
                    }
                    for(int i=0;i<word.length();i++){
                    System.out.print(morse.get(String.valueOf(word.charAt(i)))!=null?morse.get(String.valueOf(word.charAt(i)))+" ":" ");
                    }
                    break;
                case 2:
                    HashMap<String, String>morsa = new HashMap<>();
                    System.out.print("MORSE = ");
                    String kata = san.nextLine();
                    for(int j=0;j<mors.length;j++){
                        morsa.put(mors[j],latin[j]);
                    };
                    String kode = "";
                    Boolean statusMorse=false;
                    System.out.print("->");
                    for(int i=0;i<kata.length();i++){
                        kode+=kata.charAt(i);
                        String out = kode.trim();
                        if(kata.charAt(i)==' '||i==kata.length()-1){
                            statusMorse = true;
                        }
                        if(statusMorse==true){
                            System.out.print(morsa.get(out.trim())!=null?morsa.get(out.trim()):" ");
                            kode="";
                            statusMorse=false;
                        }
                    }
                    break;
                default :
                    System.out.println("Input salah");
                    break;
            }
        }
    }
}