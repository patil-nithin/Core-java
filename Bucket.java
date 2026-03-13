
class Bucket {
    String material;
    String color;
    double capacity;
    String useCase;
    boolean hasHandle;

    Bucket() {}

    Bucket(String material, String color, double capacity, String useCase, boolean hasHandle) {
        this.material = material;
        this.color = color;
        this.capacity = capacity;
        this.useCase = useCase;
        this.hasHandle = hasHandle;
    }
}
