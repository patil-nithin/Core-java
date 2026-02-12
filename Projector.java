class Projector {

    static boolean isConnected;
    static int currentBrightness = 5;
    static int maxBrightness = 10;
    static int minBrightness = 0;

    static boolean onoroff() {
        if (isConnected == false) {
            isConnected = true;
            System.out.println("The Projector is turned ON...");
        } else {
            isConnected = false;
            System.out.println("The Projector is turned OFF...");
        }
        return isConnected;
    }

    public static int increaseBrightness() {
        System.out.println("increaseBrightness is invoked..");
        System.out.println("No of Args: 0");

        if (isConnected == true) {
            System.out.println("Proceed to increase brightness");

            if (currentBrightness < maxBrightness) {
                currentBrightness = currentBrightness + 1;
                System.out.println("Current brightness is: " + currentBrightness);
            } else {
                System.out.println("Maximum brightness reached...");
            }

        } else {
            System.out.println("Turn ON the projector first");
        }

        return currentBrightness;
    }

    public static int decreaseBrightness() {
        System.out.println("decreaseBrightness is invoked..");
        System.out.println("No of Args: 0");

        if (isConnected == true) {
            System.out.println("Proceed to decrease brightness");

            if (currentBrightness > minBrightness) {
                currentBrightness = currentBrightness - 1;
                System.out.println("Current brightness is: " + currentBrightness);
            } else {
                System.out.println("Minimum brightness reached...");
            }

        } else {
            System.out.println("Turn ON the projector first");
        }

        return currentBrightness;
    }
}



