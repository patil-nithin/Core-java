class TV {

    static boolean isConnected;
    static int currentVolume = 10;
    static int maxVolume = 20;
    static int minVolume = 0;

    static boolean onoroff() {
        if (isConnected == false) {
            isConnected = true;
            System.out.println("The TV is turned ON...");
        } else {
            isConnected = false;
            System.out.println("The TV is turned OFF...");
        }
        return isConnected;
    }

    public static int increaseVolume() {
        System.out.println("increaseVolume is invoked..");

        if (isConnected == true) {
            System.out.println("Proceed to increase volume");

            if (currentVolume < maxVolume) {
                currentVolume++;
                System.out.println("Current volume is: " + currentVolume);
            } else {
                System.out.println("Maximum volume reached...");
            }

        } else {
            System.out.println("Turn ON the TV first");
        }

        return currentVolume;
    }

    public static int decreaseVolume() {
        System.out.println("decreaseVolume is invoked..");

        if (isConnected == true) {
            System.out.println("Proceed to decrease volume");

            if (currentVolume > minVolume) {
                currentVolume--;
                System.out.println("Current volume is: " + currentVolume);
            } else {
                System.out.println("Minimum volume reached...");
            }

        } else {
            System.out.println("Turn ON the TV first");
        }

        return currentVolume;
    }
}

