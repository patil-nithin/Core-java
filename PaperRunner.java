class PaperRunner {
    public static void main(String[] args) {
        
        Paper p1 = new Paper("Hammermill");
        System.out.println("1. The paper brand is " + p1.brand + ".");

        Paper p2 = new Paper("Navigator", true);
        System.out.println("2. The paper brand is " + p2.brand + ", and is it recycled? " + p2.isRecycled + ".");

        Paper p3 = new Paper("Double A", false, 80);
        System.out.println("3. The paper brand is " + p3.brand + ". Is it recycled? " + p3.isRecycled + ". It has a thickness of " + p3.gsm + " GSM.");

        Paper p4 = new Paper("HP Everyday", true, 75, 'A');
        System.out.println("4. The paper brand is " + p4.brand + ". It has a thickness of " + p4.gsm + " GSM, and falls under size category " + p4.sizeCategory + ".");

        Paper p5 = new Paper("Epson", false, 100, 'A', 12.99);
        System.out.println("5. The paper brand is " + p5.brand + ", under size category " + p5.sizeCategory + ". The paper cost is $" + p5.pricePerReam + " per ream.");

        Paper p6 = new Paper("Xerox", true, 90, 'B', 8.50, 92.5f);
        System.out.println("6. The paper brand is " + p6.brand + ". The paper cost is $" + p6.pricePerReam + " per ream, and it has a brightness of " + p6.brightnessPercent + "%.");

        Paper p7 = new Paper("Georgia-Pacific", true, 75, 'A', 6.00, 90.0f, (short)500);
        System.out.println("7. The paper brand is " + p7.brand + ". It has a brightness of " + p7.brightnessPercent + "%, and the total paper sheet count is " + p7.sheetCount + " sheets per ream.");

        Paper p8 = new Paper("Mohawk", false, 120, 'A', 18.00, 98.0f, (short)250, (byte)5);
        System.out.println("8. The paper brand is " + p8.brand + " (Recycled? " + p8.isRecycled + "). The paper sheet count is " + p8.sheetCount + " sheets, and it holds a premium grade level of " + p8.gradeLevel + " out of 5.");

        Paper p9 = new Paper("Neenah", true, 110, 'B', 22.50, 96.5f, (short)200, (byte)4, 1500000000L);
        System.out.println("9. The paper brand is " + p9.brand + ". It holds a grade level of " + p9.gradeLevel + "! The estimated global sales volume is " + p9.globalSalesVolume + " reams.");

        Paper p10 = new Paper("Strathmore", false, 130, 'A', 25.00, 94.0f, (short)100, (byte)5, 500000000L, "Ivory");
        System.out.println("10. The paper brand is " + p10.brand + ". The paper color is " + p10.color + ". The paper cost is $" + p10.pricePerReam + " per ream, and the global sales volume is " + p10.globalSalesVolume + ".");

        Paper p11 = new Paper("Canson", true, 150, 'A', 30.00, 90.0f, (short)50, (byte)5, 200000000L, "White", "Woven");
        System.out.println("11. The paper brand is " + p11.brand + ". The paper color is " + p11.color + " with a " + p11.texture + " texture. It costs $" + p11.pricePerReam + " per ream.");

        Paper p12 = new Paper("Kodak Photo", false, 200, 'A', 35.00, 99.0f, (short)100, (byte)5, 800000000L, "Glossy White", "Smooth", true);
        System.out.println("12. The paper brand is " + p12.brand + ". The paper texture is " + p12.texture + " (Coated: " + p12.isCoated + "). It has a thickness of " + p12.gsm + " GSM and costs $" + p12.pricePerReam + " per ream.");
    }
}