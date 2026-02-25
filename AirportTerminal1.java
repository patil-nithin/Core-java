class AirportTerminal1 {

    public static void main(String[] args) {

        String terminalTitle = "INTERNATIONAL TERMINAL";
        String terminalHead = "Mahendra";
        String terminalAddress = "Kempegowda Airport";

        String airlineList[] = {"Indigo", "Air India", "Emirates", "Vistara"};
        String terminalStaff[] = {"Suresh", "Kavya", "Nitin", "Harini"};

        System.out.println("The Terminal Name is : " + terminalTitle);
        System.out.println("The Director Name is : " + terminalHead);
        System.out.println("The Location is : " + terminalAddress);

        System.out.println("The Number of Airlines is " + airlineList.length);
        for (String airlineName : airlineList) {
            System.out.println(airlineName);
        }

        System.out.println("The Number of Staff are " + terminalStaff.length);
        for (String staffMember : terminalStaff) {
            System.out.println(staffMember);
        }
    }
}