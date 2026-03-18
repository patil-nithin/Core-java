class TheoBroma {

	int orderId;
	double price;
	String itemName;
	String brand;
	String category;
	double weight;
	boolean isCustomizable;
	String flavor;
	String city;
	int quantity;
	String batchNumber;
	double discount;
	boolean isAvailable;
	String expiryDate;
	String packaging;
	boolean isEggless;
	String occasion;
	double rating;
	String deliveryTime;
	boolean isGlutenFree;

	public TheoBroma() {
		this(1001, 750.0, "Chocolate Truffle Cake", "Theobroma", "Bakery", 500.0, true, "Dark Chocolate", "Mumbai", 1, "TB2024A", 5.0, true, "2024-12-31", "Box", false, "Birthday", 4.9, "Same Day", false);
	}

	public TheoBroma(int orderId, double price, String itemName, String brand, String category, double weight, boolean isCustomizable, String flavor, String city, int quantity, String batchNumber, double discount, boolean isAvailable, String expiryDate, String packaging, boolean isEggless, String occasion, double rating, String deliveryTime, boolean isGlutenFree) {
		System.out.println("TheoBroma OrderId : " + orderId);
		System.out.println("TheoBroma Price : " + price);
		System.out.println("TheoBroma ItemName : " + itemName);
		System.out.println("TheoBroma Brand : " + brand);
		System.out.println("TheoBroma Category : " + category);
		System.out.println("TheoBroma Weight : " + weight);
		System.out.println("TheoBroma IsCustomizable : " + isCustomizable);
		System.out.println("TheoBroma Flavor : " + flavor);
		System.out.println("TheoBroma City : " + city);
		System.out.println("TheoBroma Quantity : " + quantity);
		System.out.println("TheoBroma BatchNumber : " + batchNumber);
		System.out.println("TheoBroma Discount : " + discount);
		System.out.println("TheoBroma IsAvailable : " + isAvailable);
		System.out.println("TheoBroma ExpiryDate : " + expiryDate);
		System.out.println("TheoBroma Packaging : " + packaging);
		System.out.println("TheoBroma IsEggless : " + isEggless);
		System.out.println("TheoBroma Occasion : " + occasion);
		System.out.println("TheoBroma Rating : " + rating);
		System.out.println("TheoBroma DeliveryTime : " + deliveryTime);
		System.out.println("TheoBroma IsGlutenFree : " + isGlutenFree);
	}
}