class Movie{
public static void getMovieInformation(){
System.out.println("this is movie information");
}

public static void getMovieInformation(float ratings){
if(ratings>=8.0f){
System.out.println("movie is good");}
else{
System.out.println("movie is not good");
}
}

public static void getMovieInformation(String movieName,float ratings){
if(movieName=="sse"){
System.out.println("this is sse");
return;
}else{
System.out.println("this is not sse");
}
}

public static boolean released(){
return true;
}
}