class Sunscreen {

	double weight;
	double price;
	String type;
	String brand;
	String variant;
	double volume;
	boolean isParabenFree;
	int spf;
	String origin;
	int quantity;
	String batchNumber;
	double discount;
	boolean isAvailable;
	String skinType;
	String keyIngredient;
	String texture;
	boolean isWaterproof;
	String packaging;
	String manufacturer;
	boolean isBroadSpectrum;

	public Sunscreen() {
		this(75.0, 349.0, "Lotion", "Neutrogena", "Ultra Sheer", 88.0, true, 50, "USA", 80, "SS2024A", 15.0, true, "Oily Skin", "Zinc Oxide", "Gel", true, "Tube", "Neutrogena Corp", true);
	}

	public Sunscreen(double weight, double price, String type, String brand, String variant, double volume, boolean isParabenFree, int spf, String origin, int quantity, String batchNumber, double discount, boolean isAvailable, String skinType, String keyIngredient, String texture, boolean isWaterproof, String packaging, String manufacturer, boolean isBroadSpectrum) {
		System.out.println("Sunscreen Weight : " + weight);
		System.out.println("Sunscreen Price : " + price);
		System.out.println("Sunscreen Type : " + type);
		System.out.println("Sunscreen Brand : " + brand);
		System.out.println("Sunscreen Variant : " + variant);
		System.out.println("Sunscreen Volume : " + volume);
		System.out.println("Sunscreen IsParabenFree : " + isParabenFree);
		System.out.println("Sunscreen Spf : " + spf);
		System.out.println("Sunscreen Origin : " + origin);
		System.out.println("Sunscreen Quantity : " + quantity);
		System.out.println("Sunscreen BatchNumber : " + batchNumber);
		System.out.println("Sunscreen Discount : " + discount);
		System.out.println("Sunscreen IsAvailable : " + isAvailable);
		System.out.println("Sunscreen SkinType : " + skinType);
		System.out.println("Sunscreen KeyIngredient : " + keyIngredient);
		System.out.println("Sunscreen Texture : " + texture);
		System.out.println("Sunscreen IsWaterproof : " + isWaterproof);
		System.out.println("Sunscreen Packaging : " + packaging);
		System.out.println("Sunscreen Manufacturer : " + manufacturer);
		System.out.println("Sunscreen IsBroadSpectrum : " + isBroadSpectrum);
	}
}