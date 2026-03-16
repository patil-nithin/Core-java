class GarlicRunner {
    public static void main(String[] args) {
        

        Garlic g1 = new Garlic("Hardneck");
        System.out.println("1. The garlic variety is " + g1.variety + ".");

        Garlic g2 = new Garlic("Softneck", true);
        System.out.println("2. The garlic variety is " + g2.variety + ", and is it organic? " + g2.isOrganic + ".");

        Garlic g3 = new Garlic("Elephant Garlic", false, 6);
        System.out.println("3. The garlic variety is " + g3.variety + ". Is it organic? " + g3.isOrganic + ". It typically has " + g3.clovesPerBulb + " cloves per bulb.");

        Garlic g4 = new Garlic("Creole", true, 12, 'M');
        System.out.println("4. The garlic variety is " + g4.variety + ". It has " + g4.clovesPerBulb + " cloves, and falls under size grade '" + g4.sizeGrade + "'.");

        Garlic g5 = new Garlic("Porcelain", false, 4, 'L', 12.50);
        System.out.println("5. The garlic variety is " + g5.variety + ", under size grade '" + g5.sizeGrade + "'. The garlic cost is $" + g5.pricePerKg + " per kilogram.");

        Garlic g6 = new Garlic("Rocambole", true, 9, 'M', 15.00, 45.5f);
        System.out.println("6. The garlic variety is " + g6.variety + ". The garlic cost is $" + g6.pricePerKg + " per kg, and the average bulb weight is " + g6.weightInGrams + " grams.");

        Garlic g7 = new Garlic("Purple Stripe", true, 10, 'S', 18.00, 35.0f, (short)120);
        System.out.println("7. The garlic variety is " + g7.variety + ". The average weight is " + g7.weightInGrams + " grams, and the garlic shelf life is " + g7.shelfLifeDays + " days.");

        Garlic g8 = new Garlic("Artichoke", false, 15, 'L', 5.50, 60.0f, (short)240, (byte)4);
        System.out.println("8. The garlic variety is " + g8.variety + " (Organic? " + g8.isOrganic + "). The garlic shelf life is " + g8.shelfLifeDays + " days, and it holds a pungency level of " + g8.pungencyLevel + " out of 10.");

        Garlic g9 = new Garlic("Silverskin", true, 20, 'S', 8.99, 30.0f, (short)300, (byte)8, 25000000L);
        System.out.println("9. The garlic variety is " + g9.variety + ". It holds a strong pungency level of " + g9.pungencyLevel + "! The estimated annual production is " + g9.annualProductionTons + " tons.");

        Garlic g10 = new Garlic("Black Garlic", false, 12, 'M', 45.00, 50.0f, (short)90, (byte)2, 500000L, "South Korea");
        System.out.println("10. The garlic variety is " + g10.variety + ". The origin country is " + g10.originCountry + ". The garlic cost is $" + g10.pricePerKg + " per kg, and the annual production is " + g10.annualProductionTons + " tons.");

        Garlic g11 = new Garlic("Aglio Rosso", true, 14, 'M', 22.00, 40.0f, (short)180, (byte)6, 120000L, "Italy", "Red-Purple");
        System.out.println("11. The garlic variety is " + g11.variety + ". The origin country is " + g11.originCountry + " and it has a beautiful " + g11.skinColor + " skin color. It costs $" + g11.pricePerKg + " per kg.");

        Garlic g12 = new Garlic("Pre-packaged White", false, 10, 'S', 9.50, 25.0f, (short)30, (byte)5, 15000000L, "China", "White", true);
        System.out.println("12. The garlic variety is " + g12.variety + ". The skin color is " + g12.skinColor + " (Peeled: " + g12.isPeeled + "). It has " + g12.clovesPerBulb + " cloves per bulb and costs $" + g12.pricePerKg + " per kg.");
    }
}