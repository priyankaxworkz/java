class MovieRunner{

public static void main(String args[]){

Movie.getMovieInformation();
Movie.getMovieInformation(8.9f);
Movie.getMovieInformation("sse",8.9f);
boolean released=Movie.released();
System.out.println("movie is released");

}
}