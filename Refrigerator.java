class Refrigerator {

    static boolean powerStatus;

    static int currentCoolingLevel;
    static int maxCoolingLevel = 5;
    static int minCoolingLevel = 0;

    static boolean switchPower() {

        if (powerStatus == false) {
            powerStatus = true;
            System.out.println("Refrigerator is turned ON...");
        } else {
            powerStatus = false;
            System.out.println("Refrigerator is turned OFF...");
        }

        return powerStatus;
    }

    static void increaseCoolingLevel() {
        System.out.println("increaseCoolingLevel is invoked...");
        System.out.println("number of args : " + 0);

        if (powerStatus == true) {
            if (currentCoolingLevel < maxCoolingLevel) {
                currentCoolingLevel = currentCoolingLevel + 1;
                System.out.println("Current cooling level is : " + currentCoolingLevel);
            } else {
                System.out.println("Maximum cooling level reached");
            }
        } else {
            System.out.println("First turn on the Refrigerator");
        }
    }

    static void decreaseCoolingLevel() {
        System.out.println("decreaseCoolingLevel is invoked...");
        System.out.println("number of args : " + 0);

        if (powerStatus == true) {
            if (currentCoolingLevel > minCoolingLevel) {
                currentCoolingLevel = currentCoolingLevel - 1;
                System.out.println("Current cooling level is : " + currentCoolingLevel);
            } else {
                System.out.println("Minimum cooling level reached");
            }
        } else {
            System.out.println("First turn on the Refrigerator");
        }
    }
}
