class Education {
    String institutionName;
    boolean isPublic;
    int studentCount;
    double annualTuition;
    float graduationRate;
    long endowmentFund;
    short foundingYear;
    byte ranking;
    char accreditationGrade;
    String stateLocation;
    int staffCount;
    boolean offersOnline;

    public Education(String institutionName) {
        this.institutionName = institutionName;
    }

    public Education(boolean isPublic) {
        this.isPublic = isPublic;
    }

    public Education(int studentCount) {
        this.studentCount = studentCount;
    }

    public Education(double annualTuition) {
        this.annualTuition = annualTuition;
    }

    public Education(float graduationRate) {
        this.graduationRate = graduationRate;
    }

    public Education(long endowmentFund) {
        this.endowmentFund = endowmentFund;
    }

    public Education(short foundingYear) {
        this.foundingYear = foundingYear;
    }

    public Education(byte ranking) {
        this.ranking = ranking;
    }

    public Education(char accreditationGrade) {
        this.accreditationGrade = accreditationGrade;
    }

    public Education(String institutionName, String stateLocation) {
        this.institutionName = institutionName;
        this.stateLocation = stateLocation;
    }

    public Education(int studentCount, int staffCount) {
        this.studentCount = studentCount;
        this.staffCount = staffCount;
    }

    public Education(boolean isPublic, boolean offersOnline) {
        this.isPublic = isPublic;
        this.offersOnline = offersOnline;
    }
}

