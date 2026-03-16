class Diabetes {
    String type;
    boolean isType1;
    int patientCountMillions;
    double averageBloodSugar;
    float hba1cLevel;
    long globalExpenditureUsd;
    short onsetAge;
    byte riskLevel;
    char diagnosticCode;
    String medication;
    boolean requiresInsulin;
    int dailyCheckups;
    double fastingGlucose;
    float postprandialGlucose;
    long annualDeaths;
    short dietPlanId;
    byte exerciseHoursWeekly;
    char severity;
    String symptoms;
    String doctorName;

    public Diabetes(String type) {
        this.type = type;
    }

    public Diabetes(boolean isType1) {
        this.isType1 = isType1;
    }

    public Diabetes(int patientCountMillions) {
        this.patientCountMillions = patientCountMillions;
    }

    public Diabetes(double averageBloodSugar) {
        this.averageBloodSugar = averageBloodSugar;
    }

    public Diabetes(float hba1cLevel) {
        this.hba1cLevel = hba1cLevel;
    }

    public Diabetes(long globalExpenditureUsd) {
        this.globalExpenditureUsd = globalExpenditureUsd;
    }

    public Diabetes(short onsetAge) {
        this.onsetAge = onsetAge;
    }

    public Diabetes(byte riskLevel) {
        this.riskLevel = riskLevel;
    }

    public Diabetes(char diagnosticCode) {
        this.diagnosticCode = diagnosticCode;
    }

    public Diabetes(String type, String medication) {
        this.type = type;
        this.medication = medication;
    }

    public Diabetes(int patientCountMillions, int dailyCheckups) {
        this.patientCountMillions = patientCountMillions;
        this.dailyCheckups = dailyCheckups;
    }

    public Diabetes(boolean isType1, boolean requiresInsulin) {
        this.isType1 = isType1;
        this.requiresInsulin = requiresInsulin;
    }
}

