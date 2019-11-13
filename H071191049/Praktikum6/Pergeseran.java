import java.util.Scanner;
class Pergeseran{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        try{
            int i = 1;
            while(true){
                System.out.println("\nTry ("+i+")");
                System.out.println("Input, The Word You Want to Shift");
                String word = san.nextLine();
                System.out.println("Input, How many You Want to Shift it");
                int shifter = san.nextInt();san.nextLine();
                //Output
                System.out.println("Word after Shifting");
                System.out.print(ou(word,shifter)+"\n");
                i++;
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        san.close();
    }
    //Algoritma
    public static String ou (String word, int shifter){
        String afterShifting ="";
        for(int i=0;i<word.length();i++){
                char subWord = word.charAt(i);
                int numSubWord = (int)subWord;
                int sumNum=0;
                boolean kriteria = numSubWord>=65&&numSubWord<=90 || numSubWord>=97&&numSubWord<=122?true:false;
                if(kriteria==false){
                    afterShifting += subWord;
                    continue;
                }
                //untuk pergeseran <0
                if(shifter<0){
                    shifter=26-(Math.abs(shifter)%26);
                }
                //untuk penjumlahan yang ada dalam interval dan yang keluar
                sumNum=shifter>=0&&shifter<=26?numSubWord+shifter:numSubWord+(shifter%26);   
                
                //pergeseran Huruf Kapital
                if(numSubWord>=65&&numSubWord<=90){
                    sumNum-=(sumNum>=65&&sumNum<=   90)?0:26;
                }
                //Pergeseran Huruf Kecil
                else if(numSubWord>=97&&numSubWord<=122){
                    sumNum-=(sumNum>=97&&sumNum<=122)?0:26;
                }
                //Output
                afterShifting += String.valueOf((char)sumNum);
            }
        return afterShifting;
    }
}

