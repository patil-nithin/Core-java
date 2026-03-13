
class Bracelet {
    String material;
    String style;
    String color;
    String gemstone;
    double length; // in inches
    double weight; // in grams
    String claspType;
    double price;
    String brand;
    boolean isEngraved;
    boolean isAdjustable;
    boolean hasCharms;
    int charmCount;
    String finish;
    String origin;
    int karat; // 0 if not gold
    int warrantyYears;
    String targetGender;
    String collectionName;
    int stockQuantity;

    Bracelet() {}

    Bracelet(String material, String style, String color, String gemstone, double length, double weight, 
             String claspType, double price, String brand, boolean isEngraved, boolean isAdjustable, 
             boolean hasCharms, int charmCount, String finish, String origin, int karat, 
             int warrantyYears, String targetGender, String collectionName, int stockQuantity) {
        this.material = material;
        this.style = style;
        this.color = color;
        this.gemstone = gemstone;
        this.length = length;
        this.weight = weight;
        this.claspType = claspType;
        this.price = price;
        this.brand = brand;
        this.isEngraved = isEngraved;
        this.isAdjustable = isAdjustable;
        this.hasCharms = hasCharms;
        this.charmCount = charmCount;
        this.finish = finish;
        this.origin = origin;
        this.karat = karat;
        this.warrantyYears = warrantyYears;
        this.targetGender = targetGender;
        this.collectionName = collectionName;
        this.stockQuantity = stockQuantity;
    }
}
