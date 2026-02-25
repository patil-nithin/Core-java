class TV {
    static boolean isConnected;

    static boolean onOrOff() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("The TV is Turned ON");
        } else {
            isConnected = false;
            System.out.println("The TV is Turned OFF");
        }
        return isConnected;
    }
}