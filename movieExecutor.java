class movieExecutor {

    public static void main(String[] args) {

boolean isMovie1  = movie.getMovieDetails("KGF Chapter 2","Kannada","Action","Prashanth Neel",168,8.5,true);
boolean isMovie2  = movie.getMovieDetails("Inception","English","Sci-Fi","Christopher Nolan",148,9.0,true);
boolean isMovie3  = movie.getMovieDetails("Interstellar","English","Sci-Fi","Christopher Nolan",169,9.1,true);
boolean isMovie4  = movie.getMovieDetails("RRR","Telugu","Action","S S Rajamouli",182,8.8,true);
boolean isMovie5  = movie.getMovieDetails("","Hindi","Drama","Rajkumar Hirani",155,8.6,true);
boolean isMovie6  = movie.getMovieDetails("PK","Hindi","Drama","Rajkumar Hirani",0,8.2,true);
boolean isMovie7  = movie.getMovieDetails("Avatar","English","Fantasy",null,162,8.2,true);
boolean isMovie8  = movie.getMovieDetails("Titanic","English","Romance","James Cameron",195,11.0,true);
boolean isMovie9  = movie.getMovieDetails("Jailer","Tamil","Action","Nelson",168,7.8,true);
boolean isMovie10 = movie.getMovieDetails("Leo","Tamil","Action","Lokesh Kanagaraj",164,8.1,true);
boolean isMovie11 = movie.getMovieDetails("Bahubali","Telugu","Epic","S S Rajamouli",159,8.0,true);
boolean isMovie12 = movie.getMovieDetails("Pushpa","Telugu","Action","Sukumar",179,7.9,true);
boolean isMovie13 = movie.getMovieDetails("Vikram","Tamil","Action","Lokesh Kanagaraj",174,8.4,true);
boolean isMovie14 = movie.getMovieDetails("Kantara","Kannada","Thriller","Rishab Shetty",148,8.6,true);
boolean isMovie15 = movie.getMovieDetails("Drishyam","Malayalam","Thriller","Jeethu Joseph",160,8.5,true);
boolean isMovie16 = movie.getMovieDetails("","English","Action","Director",120,7.0,true);
boolean isMovie17 = movie.getMovieDetails("MovieX","","Drama","Director",120,7.0,true);
boolean isMovie18 = movie.getMovieDetails("MovieY","English","","Director",120,7.0,true);
boolean isMovie19 = movie.getMovieDetails("MovieZ","English","Drama","",120,7.0,true);
boolean isMovie20 = movie.getMovieDetails("MovieA","English","Drama","Director",-10,7.0,true);
boolean isMovie21 = movie.getMovieDetails("MovieB","English","Drama","Director",120,-1.0,true);
boolean isMovie22 = movie.getMovieDetails("MovieC","English","Drama","Director",120,7.5,false);
boolean isMovie23 = movie.getMovieDetails(null,"English","Drama","Director",120,7.5,true);
boolean isMovie24 = movie.getMovieDetails("MovieD",null,"Drama","Director",120,7.5,true);
boolean isMovie25 = movie.getMovieDetails("MovieE","English",null,"Director",120,7.5,true);
boolean isMovie26 = movie.getMovieDetails("MovieF","English","Drama",null,120,7.5,true);
boolean isMovie27 = movie.getMovieDetails("MovieG","English","Drama","Director",120,0.0,true);
boolean isMovie28 = movie.getMovieDetails("MovieH","English","Drama","Director",90,6.8,true);
boolean isMovie29 = movie.getMovieDetails("MovieI","Hindi","Comedy","Director",140,7.2,true);
boolean isMovie30 = movie.getMovieDetails("MovieJ","Kannada","Drama","Director",150,8.0,true);
boolean isMovie31 = movie.getMovieDetails("MovieK","Tamil","Action","Director",160,7.9,true);
boolean isMovie32 = movie.getMovieDetails("MovieL","Telugu","Romance","Director",145,7.4,true);
boolean isMovie33 = movie.getMovieDetails("MovieM","Malayalam","Drama","Director",130,8.1,true);
boolean isMovie34 = movie.getMovieDetails("MovieN","English","Horror","Director",110,6.9,true);
boolean isMovie35 = movie.getMovieDetails("MovieO","Hindi","Action","Director",170,7.6,true);
boolean isMovie36 = movie.getMovieDetails("MovieP","English","Sci-Fi","Director",155,8.3,true);
boolean isMovie37 = movie.getMovieDetails("MovieQ","Kannada","Drama","Director",142,7.8,true);

        if (isMovie1) {
            movie.fetchDetails();
        } else if (isMovie2) {
            movie.fetchDetails();
        } else if (isMovie3) {
            movie.fetchDetails();
        } else if (isMovie4) {
            movie.fetchDetails();
        } else if (isMovie5) {
            movie.fetchDetails();
        } else if (isMovie6) {
            movie.fetchDetails();
        } else if (isMovie7) {
            movie.fetchDetails();
        } else if (isMovie8) {
            movie.fetchDetails();
        } else if (isMovie9) {
            movie.fetchDetails();
        } else if (isMovie10) {
            movie.fetchDetails();
        } else if (isMovie11) {
            movie.fetchDetails();
        } else if (isMovie12) {
            movie.fetchDetails();
        } else if (isMovie13) {
            movie.fetchDetails();
        } else if (isMovie14) {
            movie.fetchDetails();
        } else if (isMovie15) {
            movie.fetchDetails();
        } else if (isMovie16) {
            movie.fetchDetails();
        } else if (isMovie17) {
            movie.fetchDetails();
        } else if (isMovie18) {
            movie.fetchDetails();
        } else if (isMovie19) {
            movie.fetchDetails();
        } else if (isMovie20) {
            movie.fetchDetails();
        } else if (isMovie21) {
            movie.fetchDetails();
        } else if (isMovie22) {
            movie.fetchDetails();
        } else if (isMovie23) {
            movie.fetchDetails();
        } else if (isMovie24) {
            movie.fetchDetails();
        } else if (isMovie25) {
            movie.fetchDetails();
        } else if (isMovie26) {
            movie.fetchDetails();
        } else if (isMovie27) {
            movie.fetchDetails();
        } else if (isMovie28) {
            movie.fetchDetails();
        } else if (isMovie29) {
            movie.fetchDetails();
        } else if (isMovie30) {
            movie.fetchDetails();
        } else if (isMovie31) {
            movie.fetchDetails();
        } else if (isMovie32) {
            movie.fetchDetails();
        } else if (isMovie33) {
            movie.fetchDetails();
        } else if (isMovie34) {
            movie.fetchDetails();
        } else if (isMovie35) {
            movie.fetchDetails();
        } else if (isMovie36) {
            movie.fetchDetails();
        } else if (isMovie37) {
            movie.fetchDetails();
        } else {
            System.out.println("No valid movie details found");
        }
    }
}