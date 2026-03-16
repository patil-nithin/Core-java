class Organizer {
    String brand;
    boolean isPortable;
    int compartmentsCount;
    double price;
    float weightKg;
    long barcode;
    short warrantyDays;
    byte tierLevel;
    char sizeCategory;
    String material;
    int capacityLiters;
    boolean isWaterproof;

    public Organizer(String brand) {
        this.brand = brand;
    }

    public Organizer(boolean isPortable) {
        this.isPortable = isPortable;
    }

    public Organizer(int compartmentsCount) {
        this.compartmentsCount = compartmentsCount;
    }

    public Organizer(double price) {
        this.price = price;
    }

    public Organizer(float weightKg) {
        this.weightKg = weightKg;
    }

    public Organizer(long barcode) {
        this.barcode = barcode;
    }

    public Organizer(short warrantyDays) {
        this.warrantyDays = warrantyDays;
    }

    public Organizer(byte tierLevel) {
        this.tierLevel = tierLevel;
    }

    public Organizer(char sizeCategory) {
        this.sizeCategory = sizeCategory;
    }

    public Organizer(String brand, String material) {
        this.brand = brand;
        this.material = material;
    }

    public Organizer(int compartmentsCount, int capacityLiters) {
        this.compartmentsCount = compartmentsCount;
        this.capacityLiters = capacityLiters;
    }

    public Organizer(boolean isPortable, boolean isWaterproof) {
        this.isPortable = isPortable;
        this.isWaterproof = isWaterproof;
    }
}

