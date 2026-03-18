class Comb {

	double weight;
	double price;
	String type;
	String brand;
	String material;
	String color;
	boolean isAntiStatic;
	int teethCount;
	String origin;
	int quantity;
	String batchNumber;
	double length;
	double width;
	boolean isAvailable;
	String hairType;
	String teeth;
	String handle;
	boolean isHeatResistant;
	String manufacturer;
	String targetAge;

	public Comb() {
		this(20.0, 45.0, "Fine Tooth", "Kent", "Nylon", "Black", true, 120, "India", 500, "CM2024A", 18.0, 4.0, true, "All Hair Types", "Fine", "Ergonomic", true, "Kent Brushes", "Adults");
	}

	public Comb(double weight, double price, String type, String brand, String material, String color, boolean isAntiStatic, int teethCount, String origin, int quantity, String batchNumber, double length, double width, boolean isAvailable, String hairType, String teeth, String handle, boolean isHeatResistant, String manufacturer, String targetAge) {
		System.out.println("Comb Weight : " + weight);
		System.out.println("Comb Price : " + price);
		System.out.println("Comb Type : " + type);
		System.out.println("Comb Brand : " + brand);
		System.out.println("Comb Material : " + material);
		System.out.println("Comb Color : " + color);
		System.out.println("Comb IsAntiStatic : " + isAntiStatic);
		System.out.println("Comb TeethCount : " + teethCount);
		System.out.println("Comb Origin : " + origin);
		System.out.println("Comb Quantity : " + quantity);
		System.out.println("Comb BatchNumber : " + batchNumber);
		System.out.println("Comb Length : " + length);
		System.out.println("Comb Width : " + width);
		System.out.println("Comb IsAvailable : " + isAvailable);
		System.out.println("Comb HairType : " + hairType);
		System.out.println("Comb Teeth : " + teeth);
		System.out.println("Comb Handle : " + handle);
		System.out.println("Comb IsHeatResistant : " + isHeatResistant);
		System.out.println("Comb Manufacturer : " + manufacturer);
		System.out.println("Comb TargetAge : " + targetAge);
	}
}