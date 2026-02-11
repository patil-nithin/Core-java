class CourseraAccount {

    public static void main(String[] args) {
        createAccount(
            "mahadev@gmail.com",
            305,
            "Mahadev",
            "K",
            "15/09/2001",
            "India",
            "mahadev@321",
            "mahadev@321",
            "Data Science"
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
            String enrolledCourse) {

        System.out.println("Email Id : " + emailId);
        System.out.println("User Id : " + userId);
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);
        System.out.println("Date Of Birth : " + DOB);
        System.out.println("Country : " + country);
        System.out.println("Password : " + password);
        System.out.println("Repeat Password : " + repeatPassword);
        System.out.println("Enrolled Course : " + enrolledCourse);
    }
}
