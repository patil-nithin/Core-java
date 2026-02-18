class RedCrossBlood {

    public static void main(String[] bloodDonation) {
        createDonorAccount(
            "mahadev@2511",
            2505,
            "mahadev",
            "p",
            "12/2/2003",
            45627,
            "maha211",
            "maha211",
            "o+ve"
        );
    }

    static void createDonorAccount(
            String emailId,
            int donorId,
            String firstName,
            String lastName,
            String DOB,
            int zipCode,
            String password,
            String repeatPassword,
            String bloodGroup) {

        System.out.println("Donor Email Id : " + emailId);
        System.out.println("Donor Id : " + donorId);
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);
        System.out.println("Date Of Birth : " + DOB);
        System.out.println("Zip Code : " + zipCode);
        System.out.println("Password : " + password);
        System.out.println("Repeat Password : " + repeatPassword);
        System.out.println("Blood Group : " + bloodGroup);
    }
}


	 
 
 
 
 
 