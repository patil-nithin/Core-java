class Refrigerator {
    static boolean isConnected;

    static boolean onOrOff() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("The Refrigerator is Turned ON");
        } else {
            isConnected = false;
            System.out.println("The Refrigerator is Turned OFF");
        }
        return isConnected;
    }
}