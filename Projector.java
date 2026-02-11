class Projector {

    static boolean isOn;

    static boolean onoroff() {
        if (isOn == false) {
            isOn = true;
            System.out.println("Projector is ON...");
        } else if (isOn == true) {
            isOn = false;
            System.out.println("Projector is OFF...");
        }
        return isOn;
    }
}
