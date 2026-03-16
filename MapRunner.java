class MapRunner {
    public static void main(String[] args) {

        System.out.println("\n");

        Map m1 = new Map("Global Topography Map");
        System.out.println("1. The map title is " + m1.title + ".");

        Map m2 = new Map(true);
        System.out.println("2. Is this map available in a digital format? " + m2.isDigital + ".");

        Map m3 = new Map(50000);
        System.out.println("3. The map scale ratio is 1:" + m3.scaleRatio + ".");

        Map m4 = new Map(15.99);
        System.out.println("4. The cost of this map is $" + m4.price + ".");

        Map m5 = new Map(12500.5f);
        System.out.println("5. The map covers a total area of " + m5.areaCoveredSqKm + " square kilometers.");

        Map m6 = new Map(8500000000L);
        System.out.println("6. The digital map has reached " + m6.downloadCount + " downloads globally.");

        Map m7 = new Map((short)2024);
        System.out.println("7. This edition of the map was published in the year " + m7.publishedYear + ".");

        Map m8 = new Map((byte)7);
        System.out.println("8. The map corresponds to geographic region code " + m8.regionCode + ".");

        Map m9 = new Map('R');
        System.out.println("9. The map type classification code is '" + m9.mapType + "'.");

        Map m10 = new Map("City Streets", "National Geographic");
        System.out.println("10. The map title is " + m10.title + " and it is published by " + m10.publisher + ".");

        Map m11 = new Map(false, true);
        System.out.println("11. Is this map digital? " + m11.isDigital + ". Does it include a compass rose? " + m11.hasCompass + ".");

        Map m12 = new Map(100000, 30);
        System.out.println("12. The map scale ratio is 1:" + m12.scaleRatio + " and it receives updates every " + m12.updateFrequencyDays + " days.");
    }
}