class ShampooRunner {
    public static void main(String[] args) {

        System.out.println("\n");

        Shampoo s1 = new Shampoo("Head & Shoulders");
        System.out.println("1. The shampoo brand is " + s1.brand + ".");

        Shampoo s2 = new Shampoo(true);
        System.out.println("2. Is this formula completely sulfate-free? " + s2.isSulfateFree + ".");

        Shampoo s3 = new Shampoo(500);
        System.out.println("3. The bottle contains " + s3.volumeMl + " milliliters of shampoo.");

        Shampoo s4 = new Shampoo(12.99);
        System.out.println("4. The retail price for this shampoo is $" + s4.price + ".");

        Shampoo s5 = new Shampoo(5.5f);
        System.out.println("5. The shampoo has a perfectly balanced pH level of " + s5.phLevel + ".");

        Shampoo s6 = new Shampoo(890123456789L);
        System.out.println("6. The unique product barcode is " + s6.barcode + ".");

        Shampoo s7 = new Shampoo((short)24);
        System.out.println("7. This product has a guaranteed shelf life of " + s7.shelfLifeMonths + " months.");

        Shampoo s8 = new Shampoo((byte)5);
        System.out.println("8. Customers have given this shampoo a top rating of " + s8.rating + " stars.");

        Shampoo s9 = new Shampoo('C');
        System.out.println("9. This specific formula is optimized for '" + s9.hairType + "' (curly) hair types.");

        Shampoo s10 = new Shampoo("Herbal Essences", "Rosemary & Herbs");
        System.out.println("10. The " + s10.brand + " shampoo features a refreshing " + s10.scent + " scent.");

        Shampoo s11 = new Shampoo(400, 1500000);
        System.out.println("11. This " + s11.volumeMl + "ml bottle has successfully sold " + s11.bottlesSold + " units worldwide.");

        Shampoo s12 = new Shampoo(true, true);
        System.out.println("12. Sulfate-free: " + s12.isSulfateFree + ". Is the product certified vegan? " + s12.isVegan + ".");
    }
}