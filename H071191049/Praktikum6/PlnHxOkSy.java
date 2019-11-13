import java.util.Scanner;
class PlnHxOkSy{
    public static void main(String[] args) {
        Scanner san = new Scanner (System.in);
        String input = san.nextLine();
        String tanpaSpasi = input.replace(" ","").toUpperCase();
        String perDua = tanpaSpasi.substring(0,(tanpaSpasi.length()/2));
        char [] palin = perDua.toCharArray();
        String palindrom = "";
        for(int i=0;i<perDua.length()-1;i++){
            palindrom = palin[i]+palindrom;
        }
        String bSub = perDua+palindrom;
        String aSub = String.format("%x",input.length()*input.length());
        String cSub = String.format("%o",input.length());
        int dSub = (int)aSub.charAt(0);
        System.out.printf("#%s%s%s%s",aSub,bSub,cSub,dSub>=97&&dSub<=102?"?":"!");
    }
}