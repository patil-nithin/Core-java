class StandRunner {
    public static void main(String[] args) {

        System.out.println("\n");

        Stand s1 = new Stand("Hercules");
        System.out.println("1. The stand brand is " + s1.brand + ".");

        Stand s2 = new Stand("On-Stage", true);
        System.out.println("2. The stand brand is " + s2.brand + " and it is foldable: " + s2.isFoldable + ".");

        Stand s3 = new Stand("AmazonBasics", false, 50);
        System.out.println("3. The stand brand is " + s3.brand + ". Is it foldable? " + s3.isFoldable + ". It can hold up to " + s3.weightCapacityKg + " kilograms.");

        Stand s4 = new Stand("Gator", true, 30, 'M');
        System.out.println("4. The stand brand is " + s4.brand + ". It holds " + s4.weightCapacityKg + " kg and comes in size category " + s4.sizeCategory + ".");

        Stand s5 = new Stand("Lamicall", true, 5, 'S', 29.99);
        System.out.println("5. The stand brand is " + s5.brand + ", sized " + s5.sizeCategory + ". The stand cost is $" + s5.priceUsd + ".");

        Stand s6 = new Stand("K&M", false, 100, 'L', 89.50, 150.5f);
        System.out.println("6. The stand brand is " + s6.brand + ". It costs $" + s6.priceUsd + " and extends to a height of " + s6.heightCm + " cm.");

        Stand s7 = new Stand("Roost", true, 10, 'S', 74.95, 20.0f, (short)24);
        System.out.println("7. The stand brand is " + s7.brand + ". It has a height of " + s7.heightCm + " cm and a warranty of " + s7.warrantyMonths + " months.");

        Stand s8 = new Stand("VIVO", false, 15, 'M', 35.00, 30.5f, (short)12, (byte)5);
        System.out.println("8. The stand brand is " + s8.brand + " (Foldable? " + s8.isFoldable + "). The warranty is " + s8.warrantyMonths + " months, and it offers " + s8.adjustableLevels + " adjustable levels.");

        Stand s9 = new Stand("UGREEN", true, 20, 'L', 45.99, 40.0f, (short)36, (byte)3, 9876543210L);
        System.out.println("9. The stand brand is " + s9.brand + ". It has " + s9.adjustableLevels + " levels of adjustment! The unique serial number is " + s9.serialNumber + ".");

        Stand s10 = new Stand("Twelve South", false, 8, 'M', 59.99, 15.0f, (short)12, (byte)1, 1029384756L, "Aluminum");
        System.out.println("10. The stand brand is " + s10.brand + ". The material is " + s10.material + ". It costs $" + s10.priceUsd + " and its serial number is " + s10.serialNumber + ".");

        Stand s11 = new Stand("Nomad", true, 5, 'S', 99.95, 10.0f, (short)24, (byte)2, 5566778899L, "Wood", "Walnut");
        System.out.println("11. The stand brand is " + s11.brand + ". It is made of " + s11.material + " with a beautiful " + s11.color + " finish. It costs $" + s11.priceUsd + ".");

        Stand s12 = new Stand("Bose", false, 2, 'S', 129.00, 12.5f, (short)12, (byte)0, 1122334455L, "Steel", "Black", true);
        System.out.println("12. The stand brand is " + s12.brand + ". Its color is " + s12.color + " and it has an anti-slip base: " + s12.hasAntiSlip + ". It holds " + s12.weightCapacityKg + " kg and costs $" + s12.priceUsd + ".");
    }
}