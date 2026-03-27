public class TravelAgency {
    public String places[] = new String[17];
    int index;

    public boolean addPlace(String place) {
        boolean isAdded = false;
        if (index < places.length) {
            if (place != null && !place.isEmpty()) {
                places[index++] = place;
                isAdded = true;
            } else System.out.println(place + " is invalid");
        } else
            System.out.println("place index is full");
        return isAdded;
    }

    public void getPlaceDetails() {
        System.out.println("The places are : \n");
        for (String item : places)
            if (item != null) System.out.println(item);
    }

    public String getPlaceByIndex(int index) {
        String place = null;
        if (index < places.length)
            place = places[index];
        else
            System.out.println("Invalid index value: " + index);
        return place;
    }

    public int getIndexByPlace(String place) {
        int idx = 0;
        if (place != null) {
            for (String item : places) {
                if (item != null && item.equals(place)) {
                    return idx;
                }
                idx++;
            }
        } else System.out.println("place name not found: " + place);
        return -1;
    }
}
