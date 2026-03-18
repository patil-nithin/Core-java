class Wire {

	double lengthInMeters;
	double price;
	String type;
	String brand;
	String material;
	double diameter;
	boolean isInsulated;
	String color;
	String origin;
	int quantity;
	String batchNumber;
	double voltageRating;
	double currentRating;
	boolean isAvailable;
	String usage;
	String certification;
	String gauge;
	boolean isFlameRetardant;
	String manufacturer;
	double resistancePerMeter;

	public Wire() {
		this(100.0, 850.0, "Copper", "Havells", "Copper", 2.5, true, "Red", "India", 50, "WR2024A", 240.0, 16.0, true, "Electrical Wiring", "ISI Marked", "14 AWG", true, "Havells India Ltd", 0.0068);
	}

	public Wire(double lengthInMeters, double price, String type, String brand, String material, double diameter, boolean isInsulated, String color, String origin, int quantity, String batchNumber, double voltageRating, double currentRating, boolean isAvailable, String usage, String certification, String gauge, boolean isFlameRetardant, String manufacturer, double resistancePerMeter) {
		System.out.println("Wire LengthInMeters : " + lengthInMeters);
		System.out.println("Wire Price : " + price);
		System.out.println("Wire Type : " + type);
		System.out.println("Wire Brand : " + brand);
		System.out.println("Wire Material : " + material);
		System.out.println("Wire Diameter : " + diameter);
		System.out.println("Wire IsInsulated : " + isInsulated);
		System.out.println("Wire Color : " + color);
		System.out.println("Wire Origin : " + origin);
		System.out.println("Wire Quantity : " + quantity);
		System.out.println("Wire BatchNumber : " + batchNumber);
		System.out.println("Wire VoltageRating : " + voltageRating);
		System.out.println("Wire CurrentRating : " + currentRating);
		System.out.println("Wire IsAvailable : " + isAvailable);
		System.out.println("Wire Usage : " + usage);
		System.out.println("Wire Certification : " + certification);
		System.out.println("Wire Gauge : " + gauge);
		System.out.println("Wire IsFlameRetardant : " + isFlameRetardant);
		System.out.println("Wire Manufacturer : " + manufacturer);
		System.out.println("Wire ResistancePerMeter : " + resistancePerMeter);
	}
}