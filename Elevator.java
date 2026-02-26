class Elevator {

    static String brand;
    static int capacity;
    static int maxFloor;
    static String type;
    static String powerType;
    static double speed;
    static boolean emergencyAlarm;

    static boolean createElevator(
            String eBrand,
            int eCapacity,
            int eMaxFloor,
            String eType,
            String ePowerType,
            double eSpeed,
            boolean eEmergencyAlarm) {

        boolean isElevatorCreated = false;
        boolean isBrand = false;
        boolean isCapacity = false;
        boolean isMaxFloor = false;
        boolean isType = false;
        boolean isPowerType = false;
        boolean isSpeed = false;
        boolean isAlarm = false;

        if (eBrand != null && !eBrand.isEmpty()) {
            isBrand = true;
            brand = eBrand;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (eCapacity > 0) {
            isCapacity = true;
            capacity = eCapacity;
        } else {
            System.out.println("The input is either Zero or Negative");
        }

        if (eMaxFloor > 0) {
            isMaxFloor = true;
            maxFloor = eMaxFloor;
        } else {
            System.out.println("The input is either Zero or Negative");
        }

        if (eType != null && !eType.isEmpty()) {
            isType = true;
            type = eType;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (ePowerType != null && !ePowerType.isEmpty()) {
            isPowerType = true;
            powerType = ePowerType;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (eSpeed > 0) {
            isSpeed = true;
            speed = eSpeed;
        } else {
            System.out.println("The input is either Zero or Negative");
        }

        if (eEmergencyAlarm == true) {
            isAlarm = true;
            emergencyAlarm = eEmergencyAlarm;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (isBrand == true && isCapacity == true && isMaxFloor == true &&
            isType == true && isPowerType == true &&
            isSpeed == true && isAlarm == true) {

            isElevatorCreated = true;
        }

        return isElevatorCreated;
    }

    static void fetchDetails() {

        System.out.println("fetching details......");
        System.out.println("Brand is:" + brand);
        System.out.println("Capacity is:" + capacity);
        System.out.println("Max Floors is:" + maxFloor);
        System.out.println("Type is:" + type);
        System.out.println("Power Type is:" + powerType);
        System.out.println("Speed is:" + speed);
        System.out.println("Emergency Alarm is:" + emergencyAlarm);
    }
}