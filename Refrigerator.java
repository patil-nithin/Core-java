class Refrigerator {

    static String brand;
    static String model;
    static int capacity;
    static String doorType;
    static String coolingType;
    static String energyRating;
    static boolean inverter;
    static boolean frostFree;
    static int warranty;
    static double price;

    static boolean createRefrigerator(String rBrand,String rModel,int rCapacity,String rDoorType,String rCoolingType,String rEnergyRating,boolean rInverter,boolean rFrostFree,int rWarranty,double rPrice){

        boolean isRefrigeratorCreated = false;

        boolean isBrand = false;
        boolean isModel = false;
        boolean isCapacity = false;
        boolean isDoorType = false;
        boolean isCoolingType = false;
        boolean isEnergyRating = false;
        boolean isInverter = false;
        boolean isFrostFree = false;
        boolean isWarranty = false;
        boolean isPrice = false;

        if (rBrand != null && !rBrand.isEmpty()) {
            isBrand = true;
            brand = rBrand;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (rModel != null && !rModel.isEmpty()) {
            isModel = true;
            model = rModel;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (rCapacity > 0) {
            isCapacity = true;
            capacity = rCapacity;
        } else {
            System.out.println("The input is either Zero or Negative");
        }

        if (rDoorType != null && !rDoorType.isEmpty()) {
            isDoorType = true;
            doorType = rDoorType;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (rCoolingType != null && !rCoolingType.isEmpty()) {
            isCoolingType = true;
            coolingType = rCoolingType;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (rEnergyRating != null && !rEnergyRating.isEmpty()) {
            isEnergyRating = true;
            energyRating = rEnergyRating;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (rInverter == true) {
            isInverter = true;
            inverter = rInverter;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (rFrostFree == true) {
            isFrostFree = true;
            frostFree = rFrostFree;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (rWarranty > 0) {
            isWarranty = true;
            warranty = rWarranty;
        } else {
            System.out.println("The input is either Zero or Negative");
        }

        if (rPrice > 0) {
            isPrice = true;
            price = rPrice;
        } else {
            System.out.println("The input is either Zero or Negative");
        }

        if (isBrand == true && isModel == true && isCapacity == true &&
            isDoorType == true && isCoolingType == true &&
            isEnergyRating == true && isInverter == true &&
            isFrostFree == true && isWarranty == true &&
            isPrice == true) {

            isRefrigeratorCreated = true;
        }

        return isRefrigeratorCreated;
    }

    static void getRefrigeratorDetails() {

        System.out.println("fetching details......");
        System.out.println("Brand is:" + brand);
        System.out.println("Model is:" + model);
        System.out.println("Capacity is:" + capacity);
        System.out.println("Door Type is:" + doorType);
        System.out.println("Cooling Type is:" + coolingType);
        System.out.println("Energy Rating is:" + energyRating);
        System.out.println("Inverter is:" + inverter);
        System.out.println("Frost Free is:" + frostFree);
        System.out.println("Warranty is:" + warranty);
        System.out.println("Price is:" + price);
    }
}