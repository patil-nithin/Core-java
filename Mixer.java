class Mixer {

    static boolean isConnected;
    static int currentSpeed = 1;
    static int maxSpeed = 3;
    static int minSpeed = 0;

    static boolean onoroff() {
        if (isConnected == false) {
            isConnected = true;
            System.out.println("The Mixer is turned ON...");
        } else {
            isConnected = false;
            System.out.println("The Mixer is turned OFF...");
        }
        return isConnected;
    }

    public static int increaseSpeed() {
        System.out.println("increaseSpeed is invoked..");
        System.out.println("No of Args: 0");

        if (isConnected == true) {
            System.out.println("Proceed to increase speed");

            if (currentSpeed < maxSpeed) {
                currentSpeed = currentSpeed + 1;
                System.out.println("Current speed is: " + currentSpeed);
            } else {
                System.out.println("Maximum speed reached...");
            }

        } else {
            System.out.println("Turn ON the mixer first");
        }

        return currentSpeed;
    }

    public static int decreaseSpeed() {
        System.out.println("decreaseSpeed is invoked..");

        if (isConnected == true) {
            System.out.println("Proceed to decrease speed");

            if (currentSpeed > minSpeed) {
                currentSpeed = currentSpeed - 1;
                System.out.println("Current speed is: " + currentSpeed);
            } else {
                System.out.println("Minimum speed reached...");
            }

        } else {
            System.out.println("Turn ON the mixer first");
        }

        return currentSpeed;
    }
}
