class Cell {
    String type;
    boolean hasNucleus;
    int lifespanDays;
    double diameterMicrometers;
    float divisionRateHours;
    long moleculesCount;
    short mitochondriaCount;
    byte chromosomePairs;
    char shapeCategory;
    String function;
    boolean isEukaryotic;
    int energyAtpProduced;

    public Cell(String type) {
        this.type = type;
    }

    public Cell(boolean hasNucleus) {
        this.hasNucleus = hasNucleus;
    }

    public Cell(int lifespanDays) {
        this.lifespanDays = lifespanDays;
    }

    public Cell(double diameterMicrometers) {
        this.diameterMicrometers = diameterMicrometers;
    }

    public Cell(float divisionRateHours) {
        this.divisionRateHours = divisionRateHours;
    }

    public Cell(long moleculesCount) {
        this.moleculesCount = moleculesCount;
    }

    public Cell(short mitochondriaCount) {
        this.mitochondriaCount = mitochondriaCount;
    }

    public Cell(byte chromosomePairs) {
        this.chromosomePairs = chromosomePairs;
    }

    public Cell(char shapeCategory) {
        this.shapeCategory = shapeCategory;
    }

    public Cell(String type, String function) {
        this.type = type;
        this.function = function;
    }

    public Cell(boolean hasNucleus, boolean isEukaryotic) {
        this.hasNucleus = hasNucleus;
        this.isEukaryotic = isEukaryotic;
    }

    public Cell(int lifespanDays, int energyAtpProduced) {
        this.lifespanDays = lifespanDays;
        this.energyAtpProduced = energyAtpProduced;
    }
}
