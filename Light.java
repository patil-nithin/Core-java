class Light {

    static boolean isConnected;

    static boolean onoroff() {
        if (isConnected == false) {
            isConnected = true;
            System.out.println("The light is turned ON...");
        } else if (isConnected == true) {
            isConnected = false;
            System.out.println("The light is turned OFF...");
        }
        return isConnected;
    }
}

