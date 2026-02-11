class Heater {

    static boolean isOn;

    static boolean onoroff() {
        if (isOn == false) {
            isOn = true;
            System.out.println("Heater is ON...");
        } else if (isOn == true) {
            isOn = false;
            System.out.println("Heater is OFF...");
        }
        return isOn;
    }
}
