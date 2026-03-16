class Lotion {
    String brand;
    boolean isScented;
    int volumeMl;
    double price;
    float spfRating;
    long barcode;
    short shelfLifeDays;
    byte moistureLevel;
    char skinType;
    String mainIngredient;
    int stockQuantity;
    boolean isVegan;

    public Lotion(String brand) {
        this.brand = brand;
    }

    public Lotion(boolean isScented) {
        this.isScented = isScented;
    }

    public Lotion(int volumeMl) {
        this.volumeMl = volumeMl;
    }

    public Lotion(double price) {
        this.price = price;
    }

    public Lotion(float spfRating) {
        this.spfRating = spfRating;
    }

    public Lotion(long barcode) {
        this.barcode = barcode;
    }

    public Lotion(short shelfLifeDays) {
        this.shelfLifeDays = shelfLifeDays;
    }

    public Lotion(byte moistureLevel) {
        this.moistureLevel = moistureLevel;
    }

    public Lotion(char skinType) {
        this.skinType = skinType;
    }

    public Lotion(String brand, String mainIngredient) {
        this.brand = brand;
        this.mainIngredient = mainIngredient;
    }

    public Lotion(int volumeMl, int stockQuantity) {
        this.volumeMl = volumeMl;
        this.stockQuantity = stockQuantity;
    }

    public Lotion(boolean isScented, boolean isVegan) {
        this.isScented = isScented;
        this.isVegan = isVegan;
    }
}
