class Conditioner {
    String brand;
    boolean isLeaveIn;
    int volumeMl;
    double price;
    float hydrationLevel;
    long productCode;
    short expirationDays;
    byte viscosity;
    char targetGender;
    String keyIngredient;
    int unitsInStock;
    boolean isColorSafe;
    String scent;
    double weightGrams;
    float phBalance;
    long barcode;
    short daysToManufacture;
    byte packagingType;
    char bottleSize;
    boolean isOrganic;

    public Conditioner(String brand) {
        this.brand = brand;
    }

    public Conditioner(boolean isLeaveIn) {
        this.isLeaveIn = isLeaveIn;
    }

    public Conditioner(int volumeMl) {
        this.volumeMl = volumeMl;
    }

    public Conditioner(double price) {
        this.price = price;
    }

    public Conditioner(float hydrationLevel) {
        this.hydrationLevel = hydrationLevel;
    }

    public Conditioner(long productCode) {
        this.productCode = productCode;
    }

    public Conditioner(short expirationDays) {
        this.expirationDays = expirationDays;
    }

    public Conditioner(byte viscosity) {
        this.viscosity = viscosity;
    }

    public Conditioner(char targetGender) {
        this.targetGender = targetGender;
    }

    public Conditioner(String brand, String keyIngredient) {
        this.brand = brand;
        this.keyIngredient = keyIngredient;
    }

    public Conditioner(int volumeMl, int unitsInStock) {
        this.volumeMl = volumeMl;
        this.unitsInStock = unitsInStock;
    }

    public Conditioner(boolean isLeaveIn, boolean isColorSafe) {
        this.isLeaveIn = isLeaveIn;
        this.isColorSafe = isColorSafe;
    }
}

