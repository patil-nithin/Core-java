class PVR {
    String location;
    boolean hasIMAX;
    int screenCount;
    double ticketPrice;
    float rating;
    long dailyVisitors;
    short seatingCapacity;
    byte premiumLounges;
    char cinemaGrade;
    String managerName;
    int parkingCapacity;
    boolean servesAlcohol;

    public PVR(String location) {
        this.location = location;
    }

    public PVR(boolean hasIMAX) {
        this.hasIMAX = hasIMAX;
    }

    public PVR(int screenCount) {
        this.screenCount = screenCount;
    }

    public PVR(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public PVR(float rating) {
        this.rating = rating;
    }

    public PVR(long dailyVisitors) {
        this.dailyVisitors = dailyVisitors;
    }

    public PVR(short seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public PVR(byte premiumLounges) {
        this.premiumLounges = premiumLounges;
    }

    public PVR(char cinemaGrade) {
        this.cinemaGrade = cinemaGrade;
    }

    public PVR(String location, String managerName) {
        this.location = location;
        this.managerName = managerName;
    }

    public PVR(int screenCount, int parkingCapacity) {
        this.screenCount = screenCount;
        this.parkingCapacity = parkingCapacity;
    }

    public PVR(boolean hasIMAX, boolean servesAlcohol) {
        this.hasIMAX = hasIMAX;
        this.servesAlcohol = servesAlcohol;
    }
}

