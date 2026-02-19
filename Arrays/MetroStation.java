class MetroStation {

    public static void main(String[] args) {

        String metroStationTitle = "MAJESTIC METRO";
        String stationController = "Shivraj";
        String metroCity = "Bangalore";

        String routeLines[] = {"Purple Line", "Green Line"};
        String metroStaff[] = {"Ajith", "Megha", "Suraj", "Kavitha"};

        System.out.println("The Metro Station Name is : " + metroStationTitle);
        System.out.println("The Controller Name is : " + stationController);
        System.out.println("The City is : " + metroCity);

        System.out.println("The Number of Lines is " + routeLines.length);
        for (String route : routeLines) {
            System.out.println(route);
        }

        System.out.println("The Number of Staff are " + metroStaff.length);
        for (String staffMember : metroStaff) {
            System.out.println(staffMember);
        }
    }
}
