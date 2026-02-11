class MobileData {

    static boolean isConnected;

    static boolean onoroff() {
        if (isConnected == false) {
            isConnected = true;
            System.out.println("Mobile data is ON...");
        } else if (isConnected == true) {
            isConnected = false;
            System.out.println("Mobile data is OFF...");
        }
        return isConnected;
    }
}
