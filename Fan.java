class Fan {
    static boolean isConnected;

    static boolean onOrOff() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("The Fan is Turned ON");
        } else {
            isConnected = false;
            System.out.println("The Fan is Turned OFF");
        }
        return isConnected;
    }
}