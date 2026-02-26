class giriasWashingMachine {

    static String brand;
    static String model;
    static int capacityKg;
    static String machineType;
    static String motorType;
    static int spinSpeed;
    static String energyRating;
    static boolean inverter;
    static boolean childLock;
    static double price;

    static boolean getWashingMachineDetails(String wmBrand, String wmModel, int wmCapacityKg, String wmMachineType, String wmMotorType, int wmSpinSpeed, String wmEnergyRating, boolean wmInverter, boolean wmChildLock, double wmPrice) {

        boolean isWashingMachineCreated = false;
        boolean isBrand = false;
        boolean isModel = false;
        boolean isCapacity = false;
        boolean isType = false;
        boolean isMotor = false;
        boolean isSpin = false;
        boolean isEnergy = false;
        boolean isInverter = false;
        boolean isChildLock = false;
        boolean isPrice = false;

        if (wmBrand != null && !wmBrand.isEmpty()) {
            isBrand = true;
            brand = wmBrand;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (wmModel != null && !wmModel.isEmpty()) {
            isModel = true;
            model = wmModel;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (wmCapacityKg > 0) {
            isCapacity = true;
            capacityKg = wmCapacityKg;
        } else {
            System.out.println("The input is either Zero or Negative");
        }

        if (wmMachineType != null && !wmMachineType.isEmpty()) {
            isType = true;
            machineType = wmMachineType;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (wmMotorType != null && !wmMotorType.isEmpty()) {
            isMotor = true;
            motorType = wmMotorType;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (wmSpinSpeed > 0) {
            isSpin = true;
            spinSpeed = wmSpinSpeed;
        } else {
            System.out.println("The input is either Zero or Negative");
        }

        if (wmEnergyRating != null && !wmEnergyRating.isEmpty()) {
            isEnergy = true;
            energyRating = wmEnergyRating;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (wmInverter) {
            isInverter = true;
            inverter = wmInverter;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (wmChildLock) {
            isChildLock = true;
            childLock = wmChildLock;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (wmPrice > 0) {
            isPrice = true;
            price = wmPrice;
        } else {
            System.out.println("The input is either Zero or Negative");
        }

        if (isBrand == true && isModel == true && isCapacity == true &&
            isType == true && isMotor == true && isSpin == true &&
            isEnergy == true && isInverter == true &&
            isChildLock == true && isPrice == true) {

            isWashingMachineCreated = true;
        }

        return isWashingMachineCreated;
    }

    static void fetchDetails() {

        System.out.println("fetching details......");
        System.out.println("Brand is:" + brand);
        System.out.println("Model is:" + model);
        System.out.println("Capacity (Kg) is:" + capacityKg);
        System.out.println("Machine Type is:" + machineType);
        System.out.println("Motor Type is:" + motorType);
        System.out.println("Spin Speed is:" + spinSpeed);
        System.out.println("Energy Rating is:" + energyRating);
        System.out.println("Inverter is:" + inverter);
        System.out.println("Child Lock is:" + childLock);
        System.out.println("Price is:" + price);
    }
}