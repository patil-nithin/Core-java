class TediBarLotion {

	double weight;
	double price;
	String type;
	String brand;
	String variant;
	double volume;
	boolean isParabenFree;
	String packaging;
	String origin;
	String expiryDate;
	int quantity;
	String batchNumber;
	double discount;
	boolean isAvailable;
	String skinType;
	String keyIngredient;
	String fragrance;
	boolean isDermatologistTested;
	String manufacturer;
	String targetAge;

	public TediBarLotion() {
		this(250.0, 299.99, "Moisturizing", "Teddy", "Soft Skin", 250.0, true, "Bottle", "India", "2027-06", 100, "TBL2024A", 10.0, true, "All Skin Types", "Shea Butter", "Floral", true, "TediCare Ltd", "Adults");
	}

	public TediBarLotion(double weight, double price, String type, String brand, String variant, double volume, boolean isParabenFree, String packaging, String origin, String expiryDate, int quantity, String batchNumber, double discount, boolean isAvailable, String skinType, String keyIngredient, String fragrance, boolean isDermatologistTested, String manufacturer, String targetAge) {
		System.out.println("TediBarLotion Weight : " + weight);
		System.out.println("TediBarLotion Price : " + price);
		System.out.println("TediBarLotion Type : " + type);
		System.out.println("TediBarLotion Brand : " + brand);
		System.out.println("TediBarLotion Variant : " + variant);
		System.out.println("TediBarLotion Volume : " + volume);
		System.out.println("TediBarLotion IsParabenFree : " + isParabenFree);
		System.out.println("TediBarLotion Packaging : " + packaging);
		System.out.println("TediBarLotion Origin : " + origin);
		System.out.println("TediBarLotion ExpiryDate : " + expiryDate);
		System.out.println("TediBarLotion Quantity : " + quantity);
		System.out.println("TediBarLotion BatchNumber : " + batchNumber);
		System.out.println("TediBarLotion Discount : " + discount);
		System.out.println("TediBarLotion IsAvailable : " + isAvailable);
		System.out.println("TediBarLotion SkinType : " + skinType);
		System.out.println("TediBarLotion KeyIngredient : " + keyIngredient);
		System.out.println("TediBarLotion Fragrance : " + fragrance);
		System.out.println("TediBarLotion IsDermatologistTested : " + isDermatologistTested);
		System.out.println("TediBarLotion Manufacturer : " + manufacturer);
		System.out.println("TediBarLotion TargetAge : " + targetAge);
	}
}