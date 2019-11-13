import java.util.Scanner;
import java.io.*;
class SalinFile{
    public static void main(String[] args) throws IOException {
        Scanner san = new Scanner(System.in);
        String inputName = san.next()+".txt";
        String outputName = san.next()+".txt";

        FileInputStream input = null;
        FileOutputStream output = null;

        try{
            input = new FileInputStream(inputName);
            output = new FileOutputStream(outputName);
            int data = input.read();
            while (data!=-1){
                output.write(data);
                data = input.read();
            }  
            System.out.println("BERHASIL");
        }catch(Exception io){
            System.out.println("GAGAL");
            System.out.println(io.getMessage());
        }
        finally{
            if(input!=null){
                input.close();
            }
            if(output!=null){
                output.close();
            }
        }
    }
}