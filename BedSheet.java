class BedSheet {

	double weight;
	double price;
	String type;
	String brand;
	String material;
	String color;
	boolean isWashable;
	int threadCount;
	String origin;
	int quantity;
	String batchNumber;
	double length;
	double width;
	boolean isAvailable;
	String pattern;
	String size;
	boolean isFadeProof;
	String care;
	String manufacturer;
	String targetBed;

	public BedSheet() {
		this(800.0, 699.0, "Double", "Bombay Dyeing", "Cotton", "Blue", true, 200, "India", 150, "BS2024A", 228.0, 259.0, true, "Floral", "Queen Size", true, "Machine Wash", "Bombay Dyeing Ltd", "Double Bed");
	}

	public BedSheet(double weight, double price, String type, String brand, String material, String color, boolean isWashable, int threadCount, String origin, int quantity, String batchNumber, double length, double width, boolean isAvailable, String pattern, String size, boolean isFadeProof, String care, String manufacturer, String targetBed) {
		System.out.println("BedSheet Weight : " + weight);
		System.out.println("BedSheet Price : " + price);
		System.out.println("BedSheet Type : " + type);
		System.out.println("BedSheet Brand : " + brand);
		System.out.println("BedSheet Material : " + material);
		System.out.println("BedSheet Color : " + color);
		System.out.println("BedSheet IsWashable : " + isWashable);
		System.out.println("BedSheet ThreadCount : " + threadCount);
		System.out.println("BedSheet Origin : " + origin);
		System.out.println("BedSheet Quantity : " + quantity);
		System.out.println("BedSheet BatchNumber : " + batchNumber);
		System.out.println("BedSheet Length : " + length);
		System.out.println("BedSheet Width : " + width);
		System.out.println("BedSheet IsAvailable : " + isAvailable);
		System.out.println("BedSheet Pattern : " + pattern);
		System.out.println("BedSheet Size : " + size);
		System.out.println("BedSheet IsFadeProof : " + isFadeProof);
		System.out.println("BedSheet Care : " + care);
		System.out.println("BedSheet Manufacturer : " + manufacturer);
		System.out.println("BedSheet TargetBed : " + targetBed);
	}
}