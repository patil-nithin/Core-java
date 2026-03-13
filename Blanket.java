
class Blanket {
    String material;
    String size;
    String color;
    double price;
    boolean isWashable;
    int weight; // in pounds

    Blanket() {}

    Blanket(String material, String size, String color, double price, boolean isWashable, int weight) {
        this.material = material;
        this.size = size;
        this.color = color;
        this.price = price;
        this.isWashable = isWashable;
        this.weight = weight;
    }
}
