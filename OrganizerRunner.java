class OrganizerRunner {
    public static void main(String[] args) {

        System.out.println("\n");

        Organizer o1 = new Organizer("IKEA");
        System.out.println("1. The organizer brand is " + o1.brand + ".");

        Organizer o2 = new Organizer(true);
        System.out.println("2. Is this desk organizer easily portable? " + o2.isPortable + ".");

        Organizer o3 = new Organizer(12);
        System.out.println("3. This storage unit features exactly " + o3.compartmentsCount + " individual compartments.");

        Organizer o4 = new Organizer(24.99);
        System.out.println("4. The retail price for this organizational tool is $" + o4.price + ".");

        Organizer o5 = new Organizer(1.5f);
        System.out.println("5. The empty organizer weighs " + o5.weightKg + " kilograms.");

        Organizer o6 = new Organizer(987654321098L);
        System.out.println("6. The product scan barcode is " + o6.barcode + ".");

        Organizer o7 = new Organizer((short)180);
        System.out.println("7. The manufacturer provides a warranty lasting " + o7.warrantyDays + " days.");

        Organizer o8 = new Organizer((byte)3);
        System.out.println("8. This multi-level organizer consists of " + o8.tierLevel + " stacking tiers.");

        Organizer o9 = new Organizer('L');
        System.out.println("9. The standard size classification for this unit is '" + o9.sizeCategory + "'.");

        Organizer o10 = new Organizer("Muji", "Acrylic");
        System.out.println("10. The " + o10.brand + " organizer is constructed from clear " + o10.material + ".");

        Organizer o11 = new Organizer(8, 45);
        System.out.println("11. It has " + o11.compartmentsCount + " sections with a total holding volume of " + o11.capacityLiters + " liters.");

        Organizer o12 = new Organizer(false, true);
        System.out.println("12. Portable: " + o12.isPortable + ". Is the storage box fully waterproof? " + o12.isWaterproof + ".");
    }
}