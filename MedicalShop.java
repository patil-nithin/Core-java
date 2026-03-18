class MedicalShop {

	int shopId;
	double price;
	String shopName;
	String owner;
	String location;
	String licenseNumber;
	boolean is24Hours;
	String type;
	String city;
	int totalMedicines;
	String phone;
	double discount;
	boolean isAvailable;
	String openTime;
	String closeTime;
	boolean isOnlineDelivery;
	String specialization;
	double rating;
	String affiliation;
	boolean hasPharmacist;

	public MedicalShop() {
		this(1, 0.0, "Apollo Pharmacy", "Ramesh Kumar", "MG Road", "KA-PHM-2024-001", true, "Retail Pharmacy", "Bangalore", 5000, "9876543210", 10.0, true, "08:00 AM", "10:00 PM", true, "General Medicines", 4.5, "Apollo Hospitals", true);
	}

	public MedicalShop(int shopId, double price, String shopName, String owner, String location, String licenseNumber, boolean is24Hours, String type, String city, int totalMedicines, String phone, double discount, boolean isAvailable, String openTime, String closeTime, boolean isOnlineDelivery, String specialization, double rating, String affiliation, boolean hasPharmacist) {
		System.out.println("MedicalShop ShopId : " + shopId);
		System.out.println("MedicalShop Price : " + price);
		System.out.println("MedicalShop ShopName : " + shopName);
		System.out.println("MedicalShop Owner : " + owner);
		System.out.println("MedicalShop Location : " + location);
		System.out.println("MedicalShop LicenseNumber : " + licenseNumber);
		System.out.println("MedicalShop Is24Hours : " + is24Hours);
		System.out.println("MedicalShop Type : " + type);
		System.out.println("MedicalShop City : " + city);
		System.out.println("MedicalShop TotalMedicines : " + totalMedicines);
		System.out.println("MedicalShop Phone : " + phone);
		System.out.println("MedicalShop Discount : " + discount);
		System.out.println("MedicalShop IsAvailable : " + isAvailable);
		System.out.println("MedicalShop OpenTime : " + openTime);
		System.out.println("MedicalShop CloseTime : " + closeTime);
		System.out.println("MedicalShop IsOnlineDelivery : " + isOnlineDelivery);
		System.out.println("MedicalShop Specialization : " + specialization);
		System.out.println("MedicalShop Rating : " + rating);
		System.out.println("MedicalShop Affiliation : " + affiliation);
		System.out.println("MedicalShop HasPharmacist : " + hasPharmacist);
	}
}