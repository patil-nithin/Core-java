class Brain {
    String primaryFunction;
    boolean isHealthy;
    int neuronCountBillions;
    double weightKg;
    float volumeCc;
    long synapseCountTrillions;
    short bloodFlowMlPerMin;
    byte lobeCount;
    char hemisphere;
    String dominantSide;
    boolean hasConcussion;
    int iqScore;
    double oxygenConsumptionPercent;
    float surfaceAreaSqMeters;
    long memoryCapacityTb;
    short reactionTimeMs;
    byte brainWavesHz;
    char bloodType;
    String scanType;
    String condition;

    public Brain(String primaryFunction) {
        this.primaryFunction = primaryFunction;
    }

    public Brain(boolean isHealthy) {
        this.isHealthy = isHealthy;
    }

    public Brain(int neuronCountBillions) {
        this.neuronCountBillions = neuronCountBillions;
    }

    public Brain(double weightKg) {
        this.weightKg = weightKg;
    }

    public Brain(float volumeCc) {
        this.volumeCc = volumeCc;
    }

    public Brain(long synapseCountTrillions) {
        this.synapseCountTrillions = synapseCountTrillions;
    }

    public Brain(short bloodFlowMlPerMin) {
        this.bloodFlowMlPerMin = bloodFlowMlPerMin;
    }

    public Brain(byte lobeCount) {
        this.lobeCount = lobeCount;
    }

    public Brain(char hemisphere) {
        this.hemisphere = hemisphere;
    }

    public Brain(String primaryFunction, String dominantSide) {
        this.primaryFunction = primaryFunction;
        this.dominantSide = dominantSide;
    }

    public Brain(int neuronCountBillions, int iqScore) {
        this.neuronCountBillions = neuronCountBillions;
        this.iqScore = iqScore;
    }

    public Brain(boolean isHealthy, boolean hasConcussion) {
        this.isHealthy = isHealthy;
        this.hasConcussion = hasConcussion;
    }
}

