class TV {

    static boolean isOn;

    static boolean power() {
        isOn = !isOn;
        if (isOn)
            System.out.println("TV  is ON");
        else
            System.out.println("TV is OFF");

        return isOn;
    }
}
