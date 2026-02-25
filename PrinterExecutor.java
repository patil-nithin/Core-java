class PrinterExecutor {

    public static void main(String[] args) {

        boolean on = Printer.controlPrinter();
        System.out.println("The printer is currently turned On : " + on);

        Printer.increasePrintSpeed();
        Printer.increasePrintSpeed();
        Printer.increasePrintSpeed();
        Printer.increasePrintSpeed();
        Printer.increasePrintSpeed();

        Printer.decreasePrintSpeed();
        Printer.decreasePrintSpeed();
        Printer.decreasePrintSpeed();
        Printer.decreasePrintSpeed();
        Printer.decreasePrintSpeed();

        boolean off = Printer.controlPrinter();
        System.out.println("The printer is currently turned On : " + off);

    }
}
