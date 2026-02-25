class WashingMachine {
    static boolean isConnected;

    static boolean onOrOff() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("The Washing Machine is Turned ON");
        } else {
            isConnected = false;
            System.out.println("The Washing Machine is Turned OFF");
        }
        return isConnected;
    }
}