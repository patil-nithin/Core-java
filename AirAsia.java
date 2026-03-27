public class AirAsia {
    public String passengers[] = new String[30];
    int index;

    public boolean addPassenger(String passenger) {
        boolean isAdded = false;
        if (index < passengers.length) {
            if (passenger != null && !passenger.isEmpty()) {
                passengers[index++] = passenger;
                isAdded = true;
            } else System.out.println(passenger + " is invalid");
        } else
            System.out.println("passenger index is full");
        return isAdded;
    }

    public void getPassengerDetails() {
        System.out.println("The passengers are : \n");
        for (String item : passengers)
            if (item != null) System.out.println(item);
    }

    public String getPassengerByIndex(int index) {
        String passenger = null;
        if (index < passengers.length)
            passenger = passengers[index];
        else
            System.out.println("Invalid index value: " + index);
        return passenger;
    }

    public int getIndexByPassenger(String passenger) {
        int idx = 0;
        if (passenger != null) {
            for (String item : passengers) {
                if (item != null && item.equals(passenger)) {
                    return idx;
                }
                idx++;
            }
        } else System.out.println("passenger name not found: " + passenger);
        return -1;
    }
}
