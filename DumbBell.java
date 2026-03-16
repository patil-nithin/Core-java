class DumbBell {
    String brand;
    boolean isAdjustable;
    int weightLbs;
    double price;
    float gripDiameterMm;
    long unitsSold;
    short warrantyDays;
    byte platesCount;
    char gripType;
    String material;
    int maxWeightCapacity;
    boolean isRubberCoated;

    public DumbBell(String brand) {
        this.brand = brand;
    }

    public DumbBell(boolean isAdjustable) {
        this.isAdjustable = isAdjustable;
    }

    public DumbBell(int weightLbs) {
        this.weightLbs = weightLbs;
    }

    public DumbBell(double price) {
        this.price = price;
    }

    public DumbBell(float gripDiameterMm) {
        this.gripDiameterMm = gripDiameterMm;
    }

    public DumbBell(long unitsSold) {
        this.unitsSold = unitsSold;
    }

    public DumbBell(short warrantyDays) {
        this.warrantyDays = warrantyDays;
    }

    public DumbBell(byte platesCount) {
        this.platesCount = platesCount;
    }

    public DumbBell(char gripType) {
        this.gripType = gripType;
    }

    public DumbBell(String brand, String material) {
        this.brand = brand;
        this.material = material;
    }

    public DumbBell(int weightLbs, int maxWeightCapacity) {
        this.weightLbs = weightLbs;
        this.maxWeightCapacity = maxWeightCapacity;
    }

    public DumbBell(boolean isAdjustable, boolean isRubberCoated) {
        this.isAdjustable = isAdjustable;
        this.isRubberCoated = isRubberCoated;
    }
}

