
class ShoeLace {
    String material;
    String color;
    int length; 
    String shape;
    String agletMaterial;
    boolean isElastic;
    String pattern;
    String brand;
    double width; 
    double price;

    ShoeLace() {}

    ShoeLace(String material, String color, int length, String shape, String agletMaterial, 
             boolean isElastic, String pattern, String brand, double width, double price) {
        this.material = material;
        this.color = color;
        this.length = length;
        this.shape = shape;
        this.agletMaterial = agletMaterial;
        this.isElastic = isElastic;
        this.pattern = pattern;
        this.brand = brand;
        this.width = width;
        this.price = price;
    }
}
