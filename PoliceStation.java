class PoliceStation {

    public static void main(String[] args) {

        String stationName = "TOWN POLICE STATION";
        String stationInspector = "Kumar";
        String stationLocation = "Mysore";

        String unitList[] = {"Traffic", "Crime", "Cyber", "Women Safety"};
        String staffMembers[] = {"Ravi", "Arjun", "Vinay", "Deepak"};

        System.out.println("The Police Station Name is : " + stationName);
        System.out.println("The Inspector Name is : " + stationInspector);
        System.out.println("The Address is : " + stationLocation);

        System.out.println("The Number of Departments is " + unitList.length);
        for (String unit : unitList) {
            System.out.println(unit);
        }

        System.out.println("The Number of Officers are " + staffMembers.length);
        for (String staff : staffMembers) {
            System.out.println(staff);
        }
    }
}
