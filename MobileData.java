class MobileData {

    static boolean isConnected;
    static int currentSpeed = 2;
    static int maxSpeed = 5;
    static int minSpeed = 0;

    static boolean onoroff() {
        if (isConnected == false) {
            isConnected = true;
            System.out.println("Mobile Data is turned ON...");
        } else {
            isConnected = false;
            System.out.println("Mobile Data is turned OFF...");
        }
        return isConnected;
    }

    public static int increaseSpeed() {
        System.out.println("increaseSpeed is invoked..");
        System.out.println("No of Args: 0");

        if (isConnected == true) {
            System.out.println("Proceed to increase data speed");

            if (currentSpeed < maxSpeed) {
                currentSpeed = currentSpeed + 1;
                System.out.println("Current data speed is: " + currentSpeed);
            } else {
                System.out.println("Maximum data speed reached...");
            }

        } else {
            System.out.println("Turn ON mobile data first");
        }

        return currentSpeed;
    }

    public static int decreaseSpeed() {
        System.out.println("decreaseSpeed is invoked..");
        System.out.println("No of Args: 0");

        if (isConnected == true) {
            System.out.println("Proceed to decrease data speed");

            if (currentSpeed > minSpeed) {
                currentSpeed = currentSpeed - 1;
                System.out.println("Current data speed is: " + currentSpeed);
            } else {
                System.out.println("Minimum data speed reached...");
            }

        } else {
            System.out.println("Turn ON mobile data first");
        }

        return currentSpeed;
    }
}

