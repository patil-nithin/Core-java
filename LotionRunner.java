class LotionRunner {
    public static void main(String[] args) {

        System.out.println("\n");

        Lotion l1 = new Lotion("Aveeno");
        System.out.println("1. The moisturizing lotion brand is " + l1.brand + ".");

        Lotion l2 = new Lotion(false);
        System.out.println("2. Is this particular lotion formula scented? " + l2.isScented + ".");

        Lotion l3 = new Lotion(250);
        System.out.println("3. The pump bottle contains exactly " + l3.volumeMl + " ml of lotion.");

        Lotion l4 = new Lotion(18.50);
        System.out.println("4. The retail price for this skincare product is $" + l4.price + ".");

        Lotion l5 = new Lotion(30.0f);
        System.out.println("5. The lotion provides sun protection with an SPF rating of " + l5.spfRating + ".");

        Lotion l6 = new Lotion(885522114477L);
        System.out.println("6. The unique inventory tracking barcode is " + l6.barcode + ".");

        Lotion l7 = new Lotion((short)365);
        System.out.println("7. Once opened, the product has a safe shelf life of " + l7.shelfLifeDays + " days.");

        Lotion l8 = new Lotion((byte)5);
        System.out.println("8. The clinical moisture retention level is graded at " + l8.moistureLevel + " on the standard scale.");

        Lotion l9 = new Lotion('D');
        System.out.println("9. This dermatologically tested formula is ideal for '" + l9.skinType + "' (Dry) skin types.");

        Lotion l10 = new Lotion("CeraVe", "Hyaluronic Acid");
        System.out.println("10. The " + l10.brand + " daily moisturizer is enriched with " + l10.mainIngredient + ".");

        Lotion l11 = new Lotion(500, 3200);
        System.out.println("11. We currently hold " + l11.stockQuantity + " units of the " + l11.volumeMl + "ml family-size bottles in the warehouse.");

        Lotion l12 = new Lotion(true, true);
        System.out.println("12. Contains artificial fragrance: " + l12.isScented + ". Is the product certified cruelty-free and vegan? " + l12.isVegan + ".");
    }
}