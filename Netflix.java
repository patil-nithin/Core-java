class Netflix {

    public static void main(String[] args) {

        String platformName = "Netflix";
        String owner = "Netflix Inc.";
        String headquarters = "Los Gatos, California";
        String netflixShows[] = {
            "Stranger Things","Money Heist","Wednesday","Dark","The Witcher",
            "Breaking Bad","Peaky Blinders","Narcos","Lucifer"
        };

        System.out.println("the netflix platform info is:");
        System.out.println("the name of platform is:" + platformName);
        System.out.println("the owner name is:" + owner);
        System.out.println("the headquarters is:" + headquarters);

        System.out.println("the no of shows available are:" + netflixShows.length);
        System.out.println("the list of shows available:");
        for (String show : netflixShows) {
            System.out.println(show);
        }
    }
}

