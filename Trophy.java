class Trophy {
    String eventName;
    boolean isGoldPlated;
    int winningYear;
    double weightKg;
    float heightCm;
    long prizeMoney;
    short teamSize;
    byte rankPosition;
    char grade;
    String recipient;
    int engravingCost;
    boolean hasBase;

    public Trophy(String eventName) {
        this.eventName = eventName;
    }

    public Trophy(boolean isGoldPlated) {
        this.isGoldPlated = isGoldPlated;
    }

    public Trophy(int winningYear) {
        this.winningYear = winningYear;
    }

    public Trophy(double weightKg) {
        this.weightKg = weightKg;
    }

    public Trophy(float heightCm) {
        this.heightCm = heightCm;
    }

    public Trophy(long prizeMoney) {
        this.prizeMoney = prizeMoney;
    }

    public Trophy(short teamSize) {
        this.teamSize = teamSize;
    }

    public Trophy(byte rankPosition) {
        this.rankPosition = rankPosition;
    }

    public Trophy(char grade) {
        this.grade = grade;
    }

    public Trophy(String eventName, String recipient) {
        this.eventName = eventName;
        this.recipient = recipient;
    }

    public Trophy(int winningYear, int engravingCost) {
        this.winningYear = winningYear;
        this.engravingCost = engravingCost;
    }

    public Trophy(boolean isGoldPlated, boolean hasBase) {
        this.isGoldPlated = isGoldPlated;
        this.hasBase = hasBase;
    }
}

