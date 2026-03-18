class PlasticPlate {

	double weight;
	double price;
	String type;
	String brand;
	String material;
	String color;
	boolean isReusable;
	double diameter;
	String origin;
	int quantity;
	String batchNumber;
	double depth;
	boolean isAvailable;
	String usage;
	boolean isMicrowaveSafe;
	boolean isDishwasherSafe;
	String packSize;
	boolean isBPAFree;
	String manufacturer;
	String shape;

	public PlasticPlate() {
		this(80.0, 149.0, "Round", "Cello", "Polypropylene", "White", true, 25.0, "India", 300, "PP2024A", 2.5, true, "Dining", true, true, "6 Pieces", true, "Cello Industries", "Round");
	}

	public PlasticPlate(double weight, double price, String type, String brand, String material, String color, boolean isReusable, double diameter, String origin, int quantity, String batchNumber, double depth, boolean isAvailable, String usage, boolean isMicrowaveSafe, boolean isDishwasherSafe, String packSize, boolean isBPAFree, String manufacturer, String shape) {
		System.out.println("PlasticPlate Weight : " + weight);
		System.out.println("PlasticPlate Price : " + price);
		System.out.println("PlasticPlate Type : " + type);
		System.out.println("PlasticPlate Brand : " + brand);
		System.out.println("PlasticPlate Material : " + material);
		System.out.println("PlasticPlate Color : " + color);
		System.out.println("PlasticPlate IsReusable : " + isReusable);
		System.out.println("PlasticPlate Diameter : " + diameter);
		System.out.println("PlasticPlate Origin : " + origin);
		System.out.println("PlasticPlate Quantity : " + quantity);
		System.out.println("PlasticPlate BatchNumber : " + batchNumber);
		System.out.println("PlasticPlate Depth : " + depth);
		System.out.println("PlasticPlate IsAvailable : " + isAvailable);
		System.out.println("PlasticPlate Usage : " + usage);
		System.out.println("PlasticPlate IsMicrowaveSafe : " + isMicrowaveSafe);
		System.out.println("PlasticPlate IsDishwasherSafe : " + isDishwasherSafe);
		System.out.println("PlasticPlate PackSize : " + packSize);
		System.out.println("PlasticPlate IsBPAFree : " + isBPAFree);
		System.out.println("PlasticPlate Manufacturer : " + manufacturer);
		System.out.println("PlasticPlate Shape : " + shape);
	}
}