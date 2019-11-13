import java.util.Scanner;
import java.io.*;
class SalinFileBersyarat{
    public static void main(String[] args) throws IOException {
        Scanner san = new Scanner(System.in);
        String inputName = san.next()+".txt";
        String outputName = san.next()+".txt";

        FileReader input = null;
        FileReader inputB = null;
        FileWriter output = null;
        san.close();
        try{
            input = new FileReader(inputName);
            output = new FileWriter(outputName);
            inputB = new FileReader(inputName);
            BufferedReader input2 = new BufferedReader(input);
            PrintWriter output2 = new PrintWriter(output);
            String data2 = input2.readLine();
            int maxL = 0;
            while(data2!=null){
                if(data2.length()>maxL){
                    maxL = data2.length();
                }
                data2 = input2.readLine();
            }
            input2 = new BufferedReader(inputB);
            String data3 = input2.readLine();
            while(data3!=null){
                String space = "";
                int spasi = maxL-data3.length();
                for(int i=0;i<spasi;i++){
                    space+=" ";
                }
                output2.write(String.format("\t%"+maxL+"s\n",data3));
                data3 = input2.readLine();
            }
            if(output2!=null){
                output2.close();
            }
            if(input2!=null){
                input2.close();
            }
            System.out.println("BERHASIL");
            
        }catch(Exception io){
            System.out.println("GAGAL");
            System.out.println(io.getMessage());
        }
        finally{
            if(output!=null){
                output.close();
            }
            if(input!=null){
                input.close();
            }
            if(inputB!=null){
                inputB.close();
            }
        }
    }
}