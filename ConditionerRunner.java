class ConditionerRunner {
    public static void main(String[] args) {

        System.out.println("\n");

        Conditioner c1 = new Conditioner("Pantene");
        System.out.println("1. The conditioner brand is " + c1.brand + ".");

        Conditioner c2 = new Conditioner(true);
        System.out.println("2. Is this a leave-in conditioner? " + c2.isLeaveIn + ".");

        Conditioner c3 = new Conditioner(350);
        System.out.println("3. The bottle holds exactly " + c3.volumeMl + " ml of conditioner.");

        Conditioner c4 = new Conditioner(14.50);
        System.out.println("4. The cost of this deep conditioner is $" + c4.price + ".");

        Conditioner c5 = new Conditioner(8.5f);
        System.out.println("5. This product provides a deep hydration level of " + c5.hydrationLevel + " out of 10.");

        Conditioner c6 = new Conditioner(4455667788L);
        System.out.println("6. The internal factory product code is " + c6.productCode + ".");

        Conditioner c7 = new Conditioner((short)730);
        System.out.println("7. After opening, the conditioner expires in " + c7.expirationDays + " days.");

        Conditioner c8 = new Conditioner((byte)7);
        System.out.println("8. The fluid viscosity thickness is rated at level " + c8.viscosity + ".");

        Conditioner c9 = new Conditioner('U');
        System.out.println("9. The target demographic gender for this scent is '" + c9.targetGender + "' (Unisex).");

        Conditioner c10 = new Conditioner("Garnier", "Argan Oil");
        System.out.println("10. The " + c10.brand + " conditioner features " + c10.keyIngredient + " as its key ingredient.");

        Conditioner c11 = new Conditioner(500, 12500);
        System.out.println("11. We have " + c11.unitsInStock + " units of the " + c11.volumeMl + "ml size currently in stock.");

        Conditioner c12 = new Conditioner(false, true);
        System.out.println("12. Leave-in: " + c12.isLeaveIn + ". Is it safe for color-treated hair? " + c12.isColorSafe + ".");
    }
}