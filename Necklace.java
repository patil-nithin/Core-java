
class Necklace {
    String material;
    String style;
    String gemstone;
    double chainLength; // in inches
    double weight; // in grams
    String claspType;
    double price;
    String brand;
    boolean isEngraved;
    boolean isAdjustable;
    boolean hasPendant;
    int karat; // 0 if not gold
    String finish;
    String origin;
    int warrantyYears;
    String targetGender;
    String collectionName;
    int stockQuantity;
    String chainType;
    String color;

    Necklace() {}

    Necklace(String material, String style, String gemstone, double chainLength, double weight, 
             String claspType, double price, String brand, boolean isEngraved, boolean isAdjustable, 
             boolean hasPendant, int karat, String finish, String origin, int warrantyYears, 
             String targetGender, String collectionName, int stockQuantity, String chainType, String color) {
        this.material = material;
        this.style = style;
        this.gemstone = gemstone;
        this.chainLength = chainLength;
        this.weight = weight;
        this.claspType = claspType;
        this.price = price;
        this.brand = brand;
        this.isEngraved = isEngraved;
        this.isAdjustable = isAdjustable;
        this.hasPendant = hasPendant;
        this.karat = karat;
        this.finish = finish;
        this.origin = origin;
        this.warrantyYears = warrantyYears;
        this.targetGender = targetGender;
        this.collectionName = collectionName;
        this.stockQuantity = stockQuantity;
        this.chainType = chainType;
        this.color = color;
    }
}
