class PhonePeAccount {

    public static void main(String[] args) {
        createAccount(
            "ganesh@upi",
            9123456780L,
            "ganesh",
            "Patil",
            "05/08/2002",
            585101,
            "ganesh@321",
            "ga@321",
            "Current"
        );
    }

    static void createAccount(
            String upiId,
            long mobileNumber,
            String firstName,
            String lastName,
            String DOB,
            int pinCode,
            String password,
            String repeatPassword,
            String accountType) {

        System.out.println("UPI Id : " + upiId);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);
        System.out.println("Date Of Birth : " + DOB);
        System.out.println("Pin Code : " + pinCode);
        System.out.println("Password : " + password);
        System.out.println("Repeat Password : " + repeatPassword);
        System.out.println("Account Type : " + accountType);
    }
}
