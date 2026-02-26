class food {

    static String name;
    static String type;
    static String cuisine;
    static double price;
    static boolean isVeg;

    static boolean getFoodDetails(String fName, String fType, String fCuisine, double fPrice, boolean veg) {

        boolean isFoodCreated = false;
        boolean isName = false;
        boolean isTypeValid = false;
        boolean isCuisine = false;
        boolean isPrice = false;
        boolean isVegValid = false;

        if (fName != null && !fName.isEmpty()) {
            isName = true;
            name = fName;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (fType != null && !fType.isEmpty()) {
            isTypeValid = true;
            type = fType;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (fCuisine != null && !fCuisine.isEmpty()) {
            isCuisine = true;
            cuisine = fCuisine;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (fPrice > 0) {
            isPrice = true;
            price = fPrice;
        } else {
            System.out.println("The input is either Zero or Negative");
        }

        if (veg == true) {
            isVegValid = true;
            isVeg = veg;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (isName == true && isTypeValid == true && isCuisine == true &&
            isPrice == true && isVegValid == true) {

            isFoodCreated = true;
        }

        return isFoodCreated;
    }

    static void fetchDetails() {

        System.out.println("fetching details......");
        System.out.println("Food Name is:" + name);
        System.out.println("Food Type is:" + type);
        System.out.println("Cuisine is:" + cuisine);
        System.out.println("Price is:" + price);
        System.out.println("Veg is:" + isVeg);
    }
}