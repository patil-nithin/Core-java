class SonyLiv {

    public static void main(String[] args) {

        String platformName = "Sony LIV";
        String owner = "Sony Pictures Networks";
        String headquarters = "Mumbai";
        String sonyLivContent[] = {"Scam 1992","Rocket Boys","Gullak","Maharani","Undekhi","Tabbar","JL50"};

        System.out.println("the sony liv platform info is:");
        System.out.println("the name of platform is:" + platformName);
        System.out.println("the owner name is:" + owner);
        System.out.println("the headquarters is:" + headquarters);

        System.out.println("the no of shows available are:" + sonyLivContent.length);
        System.out.println("the list of shows available:");
        for (String show : sonyLivContent) {
            System.out.println(show);
        }
    }
}

