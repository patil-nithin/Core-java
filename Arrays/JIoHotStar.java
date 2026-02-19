class JioHotstar {

    public static void main(String[] args) {

        String platformName = "Jio Hotstar";
        String owner = "Disney Star";
        String headquarters = "Mumbai";
        String hotstarShows[] = {
            "Criminal Justice","Special Ops","Aarya","The Night Manager",
            "City of Dreams","Human","Rudra","Asur","Ghar Waapsi",
            "Hostages","Masoom"
        };

        System.out.println("the jio hotstar platform info is:");
        System.out.println("the name of platform is:" + platformName);
        System.out.println("the owner name is:" + owner);
        System.out.println("the headquarters is:" + headquarters);

        System.out.println("the no of shows available are:" + hotstarShows.length);
        System.out.println("the list of shows available:");
        for (String show : hotstarShows) {
            System.out.println(show);
        }
    }
}

