class Printer {

    static boolean printingMode;

    static int currentPrintSpeed;
    static int maxPrintSpeed = 10;
    static int minPrintSpeed = 0;

    static boolean controlPrinter() {

        if (printingMode == false) {
            printingMode = true;
            System.out.println("Printer is turned on ..");
        } else {
            printingMode = false;
            System.out.println("Printer is turned off ..");
        }

        return printingMode;
    }

    static void increasePrintSpeed() {
        System.out.println("increasePrintSpeed is invoked...");
        System.out.println("number of args : " + 0);

        if (printingMode == true) {
            if (currentPrintSpeed < maxPrintSpeed) {
                currentPrintSpeed = currentPrintSpeed + 1;
                System.out.println("Current print speed is : " + currentPrintSpeed + " ppm");
            } else {
                System.out.println("Maximum print speed reached");
            }
        } else {
            System.out.println("First turn on the Printer");
        }
    }

    static void decreasePrintSpeed() {
        System.out.println("decreasePrintSpeed is invoked...");
        System.out.println("number of args : " + 0);

        if (printingMode == true) {
            if (currentPrintSpeed > minPrintSpeed) {
                currentPrintSpeed = currentPrintSpeed - 1;
                System.out.println("Current print speed is : " + currentPrintSpeed + " ppm");
            } else {
                System.out.println("Minimum print speed reached");
            }
        } else {
            System.out.println("First turn on the Printer");
        }
    }
}
