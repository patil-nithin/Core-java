public class TravelAgencyExecutor {
    public static void main(String[] args) {
        TravelAgency travelAgency = new TravelAgency();
        travelAgency.addPlace("Paris");
        travelAgency.addPlace("London");
        travelAgency.addPlace("Dubai");
        travelAgency.addPlace("Singapore");
        travelAgency.addPlace("Bangkok");
        travelAgency.addPlace("New York");
        travelAgency.addPlace("Tokyo");
        travelAgency.addPlace("Sydney");
        travelAgency.addPlace("Rome");
        travelAgency.addPlace("Maldives");
        travelAgency.addPlace("Bali");
        travelAgency.addPlace("Amsterdam");
        travelAgency.addPlace("Barcelona");
        travelAgency.addPlace("Istanbul");
        travelAgency.addPlace("Zurich");
        travelAgency.addPlace("Toronto");
        travelAgency.addPlace("Cape Town");
        travelAgency.getPlaceDetails();
        int index = 3;
        String placeByIndex = travelAgency.getPlaceByIndex(index);
        System.out.println("Place at index " + index + " is: " + placeByIndex);
        String placeName = "Tokyo";
        int placeIndex = travelAgency.getIndexByPlace(placeName);
        System.out.println("Index of " + placeName + " is: " + placeIndex);
    }
}
