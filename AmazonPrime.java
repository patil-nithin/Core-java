class AmazonPrime {

    public static void main(String[] args) {

        String platformName = "Amazon Prime Video";
        String owner = "Amazon";
        String headquarters = "Seattle";
        String primeContent[] = {
            "Mirzapur","The Family Man","Paatal Lok","Farzi","Made in Heaven",
            "Breathe","Panchayat","Citadel","Reacher","Jack Ryan",
            "The Boys","Invincible"
        };

        System.out.println("the amazon prime platform info is:");
        System.out.println("the name of platform is:" + platformName);
        System.out.println("the owner name is:" + owner);
        System.out.println("the headquarters is:" + headquarters);

        System.out.println("the no of contents available are:" + primeContent.length);
        System.out.println("the list of contents available:");
        for (String content : primeContent) {
            System.out.println(content);
        }
    }
}
