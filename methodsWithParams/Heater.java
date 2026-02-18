class Heater {

    static boolean isConnected;
    static int currentTemp = 20;
    static int maxTemp = 30;
    static int minTemp = 10;

    static boolean onoroff() {
        if (isConnected == false) {
            isConnected = true;
            System.out.println("The Heater is turned ON...");
        } else {
            isConnected = false;
            System.out.println("The Heater is turned OFF...");
        }
        return isConnected;
    }

    public static int increaseTemp() {
        System.out.println("increaseTemp is invoked..");

        if (isConnected == true) {
            System.out.println("Proceed to increase temperature");

            if (currentTemp < maxTemp) {
                currentTemp++;
                System.out.println("Temperature is: " + currentTemp);
            } else {
                System.out.println("Maximum temperature reached...");
            }

        } else {
            System.out.println("Turn ON the heater first");
        }

        return currentTemp;
    }

    public static int decreaseTemp() {
        System.out.println("decreaseTemp is invoked..");

        if (isConnected == true) {
            System.out.println("Proceed to decrease temperature");

            if (currentTemp > minTemp) {
                currentTemp--;
                System.out.println("Temperature is: " + currentTemp);
            } else {
                System.out.println("Minimum temperature reached...");
            }

        } else {
            System.out.println("Turn ON the heater first");
        }

        return currentTemp;
    }
}

