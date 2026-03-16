class CellRunner {
    public static void main(String[] args) {

        System.out.println("\n");

        Cell c1 = new Cell("Red Blood Cell");
        System.out.println("1. The specific classification of this cell is " + c1.type + ".");

        Cell c2 = new Cell(false);
        System.out.println("2. Does this mature cell contain a nucleus? " + c2.hasNucleus + ".");

        Cell c3 = new Cell(120);
        System.out.println("3. The average biological lifespan of this cell is " + c3.lifespanDays + " days.");

        Cell c4 = new Cell(7.5);
        System.out.println("4. The measured physical diameter is " + c4.diameterMicrometers + " micrometers.");

        Cell c5 = new Cell(24.0f);
        System.out.println("5. The cell undergoes mitosis division roughly every " + c5.divisionRateHours + " hours.");

        Cell c6 = new Cell(250000000L);
        System.out.println("6. A single cell can contain " + c6.moleculesCount + " complex molecules.");

        Cell c7 = new Cell((short)2000);
        System.out.println("7. This highly active cell contains " + c7.mitochondriaCount + " energy-producing mitochondria.");

        Cell c8 = new Cell((byte)23);
        System.out.println("8. The nucleus contains exactly " + c8.chromosomePairs + " pairs of chromosomes.");

        Cell c9 = new Cell('D');
        System.out.println("9. The physical morphology falls into shape category '" + c9.shapeCategory + "'.");

        Cell c10 = new Cell("Neuron", "Signal Transmission");
        System.out.println("10. The " + c10.type + " is primarily responsible for " + c10.function + ".");

        Cell c11 = new Cell(true, true);
        System.out.println("11. Has nucleus: " + c11.hasNucleus + ". Is it classified as a eukaryotic cell? " + c11.isEukaryotic + ".");

        Cell c12 = new Cell(30, 1000000);
        System.out.println("12. With a lifespan of " + c12.lifespanDays + " days, it generates " + c12.energyAtpProduced + " ATP units of energy per cycle.");
    }
}