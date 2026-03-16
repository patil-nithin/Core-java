class Office {
    String location;
    boolean isHeadquarters;
    int employeeCapacity;
    double monthlyRent;
    float areaSquareMeters;
    long annualRevenue;
    short deskCount;
    byte floorNumber;
    char energyRating;
    String companyName;
    int meetingRooms;
    boolean hasParking;

    public Office(String location) {
        this.location = location;
    }

    public Office(boolean isHeadquarters) {
        this.isHeadquarters = isHeadquarters;
    }

    public Office(int employeeCapacity) {
        this.employeeCapacity = employeeCapacity;
    }

    public Office(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public Office(float areaSquareMeters) {
        this.areaSquareMeters = areaSquareMeters;
    }

    public Office(long annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public Office(short deskCount) {
        this.deskCount = deskCount;
    }

    public Office(byte floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Office(char energyRating) {
        this.energyRating = energyRating;
    }

    public Office(String location, String companyName) {
        this.location = location;
        this.companyName = companyName;
    }

    public Office(int employeeCapacity, int meetingRooms) {
        this.employeeCapacity = employeeCapacity;
        this.meetingRooms = meetingRooms;
    }

    public Office(boolean isHeadquarters, boolean hasParking) {
        this.isHeadquarters = isHeadquarters;
        this.hasParking = hasParking;
    }
}

