class Organ {
    String name;
    boolean isVital;
    int weightGrams;
    double bloodFlowLiters;
    float oxygenDemandPercent;
    long cellCountBillions;
    short averageLifespanYears;
    byte systemId;
    char locationCode;
    String systemName;
    boolean isTransplantable;
    int dailyFunctionCycles;

    public Organ(String name) {
        this.name = name;
    }

    public Organ(boolean isVital) {
        this.isVital = isVital;
    }

    public Organ(int weightGrams) {
        this.weightGrams = weightGrams;
    }

    public Organ(double bloodFlowLiters) {
        this.bloodFlowLiters = bloodFlowLiters;
    }

    public Organ(float oxygenDemandPercent) {
        this.oxygenDemandPercent = oxygenDemandPercent;
    }

    public Organ(long cellCountBillions) {
        this.cellCountBillions = cellCountBillions;
    }

    public Organ(short averageLifespanYears) {
        this.averageLifespanYears = averageLifespanYears;
    }

    public Organ(byte systemId) {
        this.systemId = systemId;
    }

    public Organ(char locationCode) {
        this.locationCode = locationCode;
    }

    public Organ(String name, String systemName) {
        this.name = name;
        this.systemName = systemName;
    }

    public Organ(boolean isVital, boolean isTransplantable) {
        this.isVital = isVital;
        this.isTransplantable = isTransplantable;
    }

    public Organ(int weightGrams, int dailyFunctionCycles) {
        this.weightGrams = weightGrams;
        this.dailyFunctionCycles = dailyFunctionCycles;
    }
}
