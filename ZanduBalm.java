class ZanduBalm {

	double weight;
	double price;
	String type;
	String brand;
	String flavor;
	double volume;
	boolean isMedicated;
	String packaging;
	String origin;
	String expiryDate;
	int quantity;
	String batchNumber;
	double discount;
	boolean isAvailable;
	String targetUse;
	String composition;
	String size;
	boolean isOrganic;
	String manufacturer;
	String certification;

	public ZanduBalm() {
		this(100.35, 120.00, "Regular", "Zandu", "Menthol", 10.0, true, "Tube", "India", "2026-12", 50, "ZB2024A", 5.0, true, "Pain Relief", "Menthol Camphor", "Small", false, "Emami Ltd", "ISO Certified");
	}

	public ZanduBalm(double weight, double price, String type, String brand, String flavor, double volume, boolean isMedicated, String packaging, String origin, String expiryDate, int quantity, String batchNumber, double discount, boolean isAvailable, String targetUse, String composition, String size, boolean isOrganic, String manufacturer, String certification) {
		System.out.println("ZanduBalm Weight : " + weight);
		System.out.println("ZanduBalm Price : " + price);
		System.out.println("ZanduBalm Type : " + type);
		System.out.println("ZanduBalm Brand : " + brand);
		System.out.println("ZanduBalm Flavor : " + flavor);
		System.out.println("ZanduBalm Volume : " + volume);
		System.out.println("ZanduBalm IsMedicated : " + isMedicated);
		System.out.println("ZanduBalm Packaging : " + packaging);
		System.out.println("ZanduBalm Origin : " + origin);
		System.out.println("ZanduBalm ExpiryDate : " + expiryDate);
		System.out.println("ZanduBalm Quantity : " + quantity);
		System.out.println("ZanduBalm BatchNumber : " + batchNumber);
		System.out.println("ZanduBalm Discount : " + discount);
		System.out.println("ZanduBalm IsAvailable : " + isAvailable);
		System.out.println("ZanduBalm TargetUse : " + targetUse);
		System.out.println("ZanduBalm Composition : " + composition);
		System.out.println("ZanduBalm Size : " + size);
		System.out.println("ZanduBalm IsOrganic : " + isOrganic);
		System.out.println("ZanduBalm Manufacturer : " + manufacturer);
		System.out.println("ZanduBalm Certification : " + certification);
	}
}