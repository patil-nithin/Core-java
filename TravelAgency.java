public class TravelAgency {
    private String places[] = new String[17];
    int index;

    public boolean addPlace(String place) {
        boolean isPlace = false;
        if (place != null && !place.isEmpty()) {
            places[index] = place;
            index++;
            isPlace = true;
        } else {
            System.out.println(place + " is invalid");
        }
        return isPlace;
    }

    public void getPlaces() {
        System.out.println(" TravelAgency Places ");
        for (String place : places)
            System.out.println(place);
    }
}
