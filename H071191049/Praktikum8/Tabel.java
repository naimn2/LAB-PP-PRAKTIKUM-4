  import java.util.Scanner;
  import java.io.*;
  class Tabel{
      public static void main(String[] args) throws IOException {
        Scanner san = new Scanner(System.in);

        //input
        String dataName = san.next()+".txt";
        int jumlah = san.nextInt();san.nextLine();
        String nama [] = new String [jumlah];
        String nim [] = new String [jumlah];
        String akt [] = new String [jumlah];

        //panjang max sementara dari Header Table
        int maxName = 20;
        int maxNIM = 10;
        int maxAxt = 8;
        for(int i=0;i<jumlah;i++){
            nama[i]=san.nextLine();
            //input ulang selama inputan >maxName
            while(nama[i].length()>maxName){
                System.out.println("Input Nama max 20 Input Ulang!");
                nama[i]=san.nextLine();
            }
            nim[i]=san.nextLine();
            akt[i]=san.nextLine();
            //mencari panjang nim maksimal
            if(nim[i].length()>maxNIM){
                maxNIM=nim[i].length();
            }
            //mencari panjang angkatan maksimal
            if(akt[i].length()>maxAxt){
                maxAxt = akt[i].length();
            }
        }
        String tabel ="";
        String leftAlign = "| %-"+maxName+"s | %-"+maxNIM+"s | %-"+maxAxt+"s |%n";
        String batasName = "";
        String batasNIM = "";
        String batasmaxAxt = "";
        //membuat "-" untuk kolom nama
        for(int i=0;i<maxName;i++){
            batasName+="-";
        }
        //membuat "-" untuk kolom NIM
        for(int i=0;i<maxNIM;i++){
            batasNIM+="-";
        }
        //membuat "-" untuk kolom Angkatan
        for(int i=0;i<maxAxt;i++){
            batasmaxAxt+="-";
        }
        //buat tabel
        tabel+=String.format("+-"+batasName+"-+-"+batasNIM+"-+-"+batasmaxAxt+"-+%n");
        tabel+=String.format(leftAlign,"Nama","NIM","Angkatan");
        tabel+=String.format("+-"+batasName+"-+-"+batasNIM+"-+-"+batasmaxAxt+"-+%n");
        for (int i=0;i<jumlah;i++){
            tabel+=String.format(leftAlign, nama[i],nim[i],akt[i]);
        }
        tabel+=String.format("+-"+batasName+"-+-"+batasNIM+"-+-"+batasmaxAxt+"-+%n");
        //masukkan ke file
        try(PrintWriter job = new PrintWriter(dataName);){
            job.write(tabel);
            System.out.println("Berhasil");
        }catch(Exception io){
            System.out.println("Gagal");
            System.out.println(io.getMessage());
        }
      }
  }