class Light {

    static boolean isConnected;
    static int brightness = 3;
    static int maxBrightness = 5;
    static int minBrightness = 0;

    static boolean onoroff() {
        if (isConnected == false) {
            isConnected = true;
            System.out.println("The Light is turned ON...");
        } else {
            isConnected = false;
            System.out.println("The Light is turned OFF...");
        }
        return isConnected;
    }

    public static int increaseBrightness() {
        System.out.println("increaseBrightness is invoked..");

        if (isConnected == true) {
            System.out.println("Proceed to increase brightness");

            if (brightness < maxBrightness) {
                brightness++;
                System.out.println("Current brightness: " + brightness);
            } else {
                System.out.println("Maximum brightness reached...");
            }

        } else {
            System.out.println("Turn ON the light first");
        }

        return brightness;
    }

    public static int decreaseBrightness() {
        System.out.println("decreaseBrightness is invoked..");

        if (isConnected == true) {
            System.out.println("Proceed to decrease brightness");

            if (brightness > minBrightness) {
                brightness--;
                System.out.println("Current brightness: " + brightness);
            } else {
                System.out.println("Minimum brightness reached...");
            }

        } else {
            System.out.println("Turn ON the light first");
        }

        return brightness;
    }
}


