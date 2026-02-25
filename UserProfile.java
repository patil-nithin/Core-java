class UserProfile {

    static int userName;

    public static void main(String[] args) {

        String userName = "Baba";   
        userName = "Das";

        UserProfile.userName = 78;  

        System.out.println(userName);
        System.out.println(UserProfile.userName);
    }
}

