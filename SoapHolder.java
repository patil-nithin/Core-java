class SoapHolder {

	double weight;
	double price;
	String type;
	String brand;
	String material;
	String color;
	boolean isWaterproof;
	String shape;
	String origin;
	int quantity;
	String batchNumber;
	double loadCapacity;
	double length;
	double width;
	boolean isAvailable;
	String mounting;
	String finish;
	boolean isRustProof;
	String manufacturer;
	String targetRoom;

	public SoapHolder() {
		this(150.0, 120.0, "Wall Mounted", "Cello", "Plastic", "White", true, "Rectangular", "India", 200, "SH2024A", 0.5, 12.0, 8.0, true, "Wall Mount", "Matte", true, "Cello Industries", "Bathroom");
	}

	public SoapHolder(double weight, double price, String type, String brand, String material, String color, boolean isWaterproof, String shape, String origin, int quantity, String batchNumber, double loadCapacity, double length, double width, boolean isAvailable, String mounting, String finish, boolean isRustProof, String manufacturer, String targetRoom) {
		System.out.println("SoapHolder Weight : " + weight);
		System.out.println("SoapHolder Price : " + price);
		System.out.println("SoapHolder Type : " + type);
		System.out.println("SoapHolder Brand : " + brand);
		System.out.println("SoapHolder Material : " + material);
		System.out.println("SoapHolder Color : " + color);
		System.out.println("SoapHolder IsWaterproof : " + isWaterproof);
		System.out.println("SoapHolder Shape : " + shape);
		System.out.println("SoapHolder Origin : " + origin);
		System.out.println("SoapHolder Quantity : " + quantity);
		System.out.println("SoapHolder BatchNumber : " + batchNumber);
		System.out.println("SoapHolder LoadCapacity : " + loadCapacity);
		System.out.println("SoapHolder Length : " + length);
		System.out.println("SoapHolder Width : " + width);
		System.out.println("SoapHolder IsAvailable : " + isAvailable);
		System.out.println("SoapHolder Mounting : " + mounting);
		System.out.println("SoapHolder Finish : " + finish);
		System.out.println("SoapHolder IsRustProof : " + isRustProof);
		System.out.println("SoapHolder Manufacturer : " + manufacturer);
		System.out.println("SoapHolder TargetRoom : " + targetRoom);
	}
}