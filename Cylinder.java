class Cylinder {

	double weight;
	double price;
	String type;
	String brand;
	String material;
	double capacity;
	boolean isBIS;
	String color;
	String origin;
	int quantity;
	String batchNumber;
	double pressure;
	double height;
	double diameter;
	boolean isAvailable;
	String gasType;
	String valve;
	boolean isRefillable;
	String manufacturer;
	String safetyRating;

	public Cylinder() {
		this(14900.0, 950.0, "LPG", "Indane", "Steel", 14.2, true, "Red", "India", 10, "CY2024A", 8.5, 59.0, 31.5, true, "LPG", "Brass Valve", true, "Indian Oil Corporation", "A Grade");
	}

	public Cylinder(double weight, double price, String type, String brand, String material, double capacity, boolean isBIS, String color, String origin, int quantity, String batchNumber, double pressure, double height, double diameter, boolean isAvailable, String gasType, String valve, boolean isRefillable, String manufacturer, String safetyRating) {
		System.out.println("Cylinder Weight : " + weight);
		System.out.println("Cylinder Price : " + price);
		System.out.println("Cylinder Type : " + type);
		System.out.println("Cylinder Brand : " + brand);
		System.out.println("Cylinder Material : " + material);
		System.out.println("Cylinder Capacity : " + capacity);
		System.out.println("Cylinder IsBIS : " + isBIS);
		System.out.println("Cylinder Color : " + color);
		System.out.println("Cylinder Origin : " + origin);
		System.out.println("Cylinder Quantity : " + quantity);
		System.out.println("Cylinder BatchNumber : " + batchNumber);
		System.out.println("Cylinder Pressure : " + pressure);
		System.out.println("Cylinder Height : " + height);
		System.out.println("Cylinder Diameter : " + diameter);
		System.out.println("Cylinder IsAvailable : " + isAvailable);
		System.out.println("Cylinder GasType : " + gasType);
		System.out.println("Cylinder Valve : " + valve);
		System.out.println("Cylinder IsRefillable : " + isRefillable);
		System.out.println("Cylinder Manufacturer : " + manufacturer);
		System.out.println("Cylinder SafetyRating : " + safetyRating);
	}
}