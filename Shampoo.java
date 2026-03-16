class Shampoo {
    String brand;
    boolean isSulfateFree;
    int volumeMl;
    double price;
    float phLevel;
    long barcode;
    short shelfLifeMonths;
    byte rating;
    char hairType;
    String scent;
    int bottlesSold;
    boolean isVegan;
    String targetAudience;
    double weightGrams;
    float concentration;
    long batchNumber;
    short restockDays;
    byte foamLevel;
    char sizeCategory;
    boolean isAntiDandruff;

    public Shampoo(String brand) {
        this.brand = brand;
    }

    public Shampoo(boolean isSulfateFree) {
        this.isSulfateFree = isSulfateFree;
    }

    public Shampoo(int volumeMl) {
        this.volumeMl = volumeMl;
    }

    public Shampoo(double price) {
        this.price = price;
    }

    public Shampoo(float phLevel) {
        this.phLevel = phLevel;
    }

    public Shampoo(long barcode) {
        this.barcode = barcode;
    }

    public Shampoo(short shelfLifeMonths) {
        this.shelfLifeMonths = shelfLifeMonths;
    }

    public Shampoo(byte rating) {
        this.rating = rating;
    }

    public Shampoo(char hairType) {
        this.hairType = hairType;
    }

    public Shampoo(String brand, String scent) {
        this.brand = brand;
        this.scent = scent;
    }

    public Shampoo(int volumeMl, int bottlesSold) {
        this.volumeMl = volumeMl;
        this.bottlesSold = bottlesSold;
    }

    public Shampoo(boolean isSulfateFree, boolean isVegan) {
        this.isSulfateFree = isSulfateFree;
        this.isVegan = isVegan;
    }
}

