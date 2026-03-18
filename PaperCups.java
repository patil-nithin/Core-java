class PaperCups {

	double weight;
	double price;
	String type;
	String brand;
	String material;
	double capacity;
	boolean isWaterproof;
	String color;
	String origin;
	int quantity;
	String batchNumber;
	double diameter;
	double height;
	boolean isAvailable;
	String usage;
	boolean isBiodegradable;
	String coating;
	boolean isMicrowaveSafe;
	String manufacturer;
	String packSize;

	public PaperCups() {
		this(200.0, 89.0, "Disposable", "Bibo", "Food Grade Paper", 150.0, true, "White", "India", 100, "PC2024A", 7.0, 9.5, true, "Hot Beverages", false, "PE Coated", false, "Bibo Industries", "100 Pieces");
	}

	public PaperCups(double weight, double price, String type, String brand, String material, double capacity, boolean isWaterproof, String color, String origin, int quantity, String batchNumber, double diameter, double height, boolean isAvailable, String usage, boolean isBiodegradable, String coating, boolean isMicrowaveSafe, String manufacturer, String packSize) {
		System.out.println("PaperCups Weight : " + weight);
		System.out.println("PaperCups Price : " + price);
		System.out.println("PaperCups Type : " + type);
		System.out.println("PaperCups Brand : " + brand);
		System.out.println("PaperCups Material : " + material);
		System.out.println("PaperCups Capacity : " + capacity);
		System.out.println("PaperCups IsWaterproof : " + isWaterproof);
		System.out.println("PaperCups Color : " + color);
		System.out.println("PaperCups Origin : " + origin);
		System.out.println("PaperCups Quantity : " + quantity);
		System.out.println("PaperCups BatchNumber : " + batchNumber);
		System.out.println("PaperCups Diameter : " + diameter);
		System.out.println("PaperCups Height : " + height);
		System.out.println("PaperCups IsAvailable : " + isAvailable);
		System.out.println("PaperCups Usage : " + usage);
		System.out.println("PaperCups IsBiodegradable : " + isBiodegradable);
		System.out.println("PaperCups Coating : " + coating);
		System.out.println("PaperCups IsMicrowaveSafe : " + isMicrowaveSafe);
		System.out.println("PaperCups Manufacturer : " + manufacturer);
		System.out.println("PaperCups PackSize : " + packSize);
	}
}