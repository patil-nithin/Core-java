class DumbBellRunner {
    public static void main(String[] args) {

        System.out.println("\n");

        DumbBell d1 = new DumbBell("Bowflex");
        System.out.println("1. The dumbbell is manufactured by " + d1.brand + ".");

        DumbBell d2 = new DumbBell(true);
        System.out.println("2. Is this dumbbell fully adjustable? " + d2.isAdjustable + ".");

        DumbBell d3 = new DumbBell(52);
        System.out.println("3. The current weight setting is " + d3.weightLbs + " lbs.");

        DumbBell d4 = new DumbBell(399.00);
        System.out.println("4. A pair of these dumbbells costs $" + d4.price + ".");

        DumbBell d5 = new DumbBell(34.5f);
        System.out.println("5. The handle has a grip diameter of " + d5.gripDiameterMm + " millimeters.");

        DumbBell d6 = new DumbBell(2500000L);
        System.out.println("6. The company has officially sold " + d6.unitsSold + " units worldwide.");

        DumbBell d7 = new DumbBell((short)365);
        System.out.println("7. The manufacturer provides a warranty of " + d7.warrantyDays + " days.");

        DumbBell d8 = new DumbBell((byte)10);
        System.out.println("8. This adjustable set includes " + d8.platesCount + " weight plates per dumbbell.");

        DumbBell d9 = new DumbBell('K');
        System.out.println("9. The handle features a '" + d9.gripType + "' style knurling pattern.");

        DumbBell d10 = new DumbBell("Rogue", "Urethane");
        System.out.println("10. This " + d10.brand + " dumbbell is constructed using heavy-duty " + d10.material + ".");

        DumbBell d11 = new DumbBell(10, 90);
        System.out.println("11. The base weight is " + d11.weightLbs + " lbs but expands to a maximum capacity of " + d11.maxWeightCapacity + " lbs.");

        DumbBell d12 = new DumbBell(false, true);
        System.out.println("12. Adjustable: " + d12.isAdjustable + ". Is it protected by a rubber coating? " + d12.isRubberCoated + ".");
    }
}