class LionDates {

	double weight;
	double price;
	String type;
	String brand;
	String origin;
	String variety;
	boolean isOrganic;
	String packaging;
	String grade;
	int quantity;
	String batchNumber;
	double discount;
	boolean isAvailable;
	String expiryDate;
	double moisture;
	String color;
	boolean isPitted;
	String size;
	String manufacturer;
	String certification;

	public LionDates() {
		this(500.0, 299.0, "Dry Fruit", "Lion", "Saudi Arabia", "Medjool", true, "Box", "Premium", 200, "LD2024A", 10.0, true, "2026-06", 18.5, "Brown", true, "Large", "Lion Foods Pvt Ltd", "FSSAI Approved");
	}

	public LionDates(double weight, double price, String type, String brand, String origin, String variety, boolean isOrganic, String packaging, String grade, int quantity, String batchNumber, double discount, boolean isAvailable, String expiryDate, double moisture, String color, boolean isPitted, String size, String manufacturer, String certification) {
		System.out.println("LionDates Weight : " + weight);
		System.out.println("LionDates Price : " + price);
		System.out.println("LionDates Type : " + type);
		System.out.println("LionDates Brand : " + brand);
		System.out.println("LionDates Origin : " + origin);
		System.out.println("LionDates Variety : " + variety);
		System.out.println("LionDates IsOrganic : " + isOrganic);
		System.out.println("LionDates Packaging : " + packaging);
		System.out.println("LionDates Grade : " + grade);
		System.out.println("LionDates Quantity : " + quantity);
		System.out.println("LionDates BatchNumber : " + batchNumber);
		System.out.println("LionDates Discount : " + discount);
		System.out.println("LionDates IsAvailable : " + isAvailable);
		System.out.println("LionDates ExpiryDate : " + expiryDate);
		System.out.println("LionDates Moisture : " + moisture);
		System.out.println("LionDates Color : " + color);
		System.out.println("LionDates IsPitted : " + isPitted);
		System.out.println("LionDates Size : " + size);
		System.out.println("LionDates Manufacturer : " + manufacturer);
		System.out.println("LionDates Certification : " + certification);
	}
}