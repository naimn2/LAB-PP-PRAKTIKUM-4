import java.util.Scanner;
//import java.rmi.server.RemoteServer;
import java.util.ArrayList;
import java.util.HashMap;
class FavoriteMovie{
    static Scanner san = new Scanner (System.in);
    public static void main(String[] args) {
        HashMap <String, ArrayList<String>>favoriteMovie = new HashMap<>();
        favoriteMovie.put("judul", new ArrayList<>());
        favoriteMovie.put("rilis", new ArrayList<>());
        favoriteMovie.put("durasi", new ArrayList<>());
        favoriteMovie.put("sinopsis", new ArrayList<>());
        favoriteMovie.put("genre", new ArrayList<>());
        favoriteMovie.put("cast", new ArrayList<>());
        String out="N";
        while(!out.equalsIgnoreCase("Y")){
            showMovie(favoriteMovie);
            System.out.print("(d)Detail (s)Search (a)Add (r)Remove\n>");
            String input = san.next();
            switch(input){
                case "d":
                    int i = san.nextInt()-1;
                    showDetail(favoriteMovie,i);
                    System.out.println("Do you want to close (Y/N)");
                    out=san.next();
                    break;
                case "a":
                    addMovie(favoriteMovie);
                    showMovie(favoriteMovie);
                    System.out.println("Do you want to close (Y/N)");
                    out=san.next();
                    break;
                case "s":
                    String ku = san.next();
                    System.out.printf(search(ku, favoriteMovie));
                    System.out.println("Do you want to close (Y/N)");
                    out=san.next();
                    break;
                case "r":
                    int in = san.nextInt()-1;
                    remove(favoriteMovie,in);
                    showMovie(favoriteMovie);
                    System.out.println("Do you want to close (Y/N)");
                    out=san.next();
                    break;
                default:
                    System.out.println("Do you want to close (Y/N)");
                    out=san.next();
                    break;
            }
        }
    }
    static void showMovie(HashMap<String, ArrayList<String>> favoriteMovie) {
		ArrayList<String> judul = favoriteMovie.get("judul");
        System.out.println("Favorite Movie");
        for(int i=0;i<judul.size();i++){
            System.out.println(i+1+". "+judul.get(i));
        }

    }
    public static void showDetail (HashMap <String, ArrayList<String>>favoriteMovie,int i){
        System.out.println("Judul    : " + favoriteMovie.get("judul").get(i));
		System.out.println("Rilis    : " + favoriteMovie.get("rilis").get(i));
		System.out.println("Durasi   : " + favoriteMovie.get("durasi").get(i));
		System.out.println("Genre    : " + favoriteMovie.get("genre").get(i));
		System.out.println("Sinopsis : " + favoriteMovie.get("sinopsis").get(i));
		System.out.println("Cast     : " + favoriteMovie.get("cast").get(i));
    }
    public static void addMovie (HashMap <String, ArrayList<String>>favoriteMovie){
        san.nextLine();
        System.out.print("Judul: ");
		String title = san.nextLine();
		System.out.print("Rilis: ");
		String release = san.nextLine();
		System.out.print("Durasi: ");
		String duration = san.nextLine();
		System.out.print("Genre: ");
		String jenre = san.nextLine();
		System.out.print("Sinopsis: ");
		String synopsis = san.nextLine();
		System.out.print("Cast: ");
        String casting = san.nextLine();

        favoriteMovie.get("judul").add(title);
		favoriteMovie.get("rilis").add(release);
		favoriteMovie.get("durasi").add(duration);
		favoriteMovie.get("sinopsis").add(synopsis);
		favoriteMovie.get("genre").add(jenre);
		favoriteMovie.get("cast").add(casting);
    }
    public static String search (String ku, HashMap <String, ArrayList<String>>favoriteMovie){
        ArrayList<String> jadul= favoriteMovie.get("judul");
        String out = "Hasil Pencarian ("+ku+")\n";
        for(int i=0;i<jadul.size();i++){
            String movie = jadul.get(i);
            for(int j=0;j<movie.length();j++){
                if(j+ku.length()<=movie.length()){
                    if(ku.equalsIgnoreCase(movie.substring(j,j+ku.length()))){
                        out+=String.format(i+1 + ". "+movie+"\n");
                        break;
                    }
                }
                else{
                    continue;
                }
            }
        }
        return out;
    }
    public static void remove (HashMap <String, ArrayList<String>>favoriteMovie, int in){
        favoriteMovie.get("judul").remove(in);
		favoriteMovie.get("rilis").remove(in);
		favoriteMovie.get("durasi").remove(in);
		favoriteMovie.get("sinopsis").remove(in);
		favoriteMovie.get("genre").remove(in);
		favoriteMovie.get("cast").remove(in);
    }
}