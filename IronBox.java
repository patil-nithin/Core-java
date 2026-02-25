class IronBox {
    static boolean isConnected;

    static boolean onOrOff() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("The Iron Box is Turned ON");
        } else {
            isConnected = false;
            System.out.println("The Iron Box is Turned OFF");
        }
        return isConnected;
    }
}