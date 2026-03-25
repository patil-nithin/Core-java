public class AirAsia {
    private String passengers[] = new String[30];
    int index;

    public boolean addPassenger(String passenger) {
        boolean isPassenger = false;
        if (passenger != null && !passenger.isEmpty()) {
            passengers[index] = passenger;
            index++;
            isPassenger = true;
        } else {
            System.out.println(passenger + " is invalid");
        }
        return isPassenger;
    }

    public void getPassengers() {
        System.out.println(" AirAsia Passengers ");
        for (String passenger : passengers)
            System.out.println(passenger);
    }
}
