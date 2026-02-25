class SpotifyAccount {

    public static void main(String[] args) {
        createAccount(
            "mahadev@gmail.com",
            101,
            "Mahadev",
            "P",
            "12/02/2003",
            "India",
            "maha211",
            "maha211",
            "Premium"
        );
    }

    static void createAccount(
            String emailId,
            int userId,
            String firstName,
            String lastName,
            String DOB,
            String country,
            String password,
            String repeatPassword,
            String subscriptionType) {

        System.out.println("Email Id : " + emailId);
        System.out.println("User Id : " + userId);
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);
        System.out.println("Date Of Birth : " + DOB);
        System.out.println("Country : " + country);
        System.out.println("Password : " + password);
        System.out.println("Repeat Password : " + repeatPassword);
        System.out.println("Subscription Type : " + subscriptionType);
    }
} 
