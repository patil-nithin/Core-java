class Map {
    String title;
    boolean isDigital;
    int scaleRatio;
    double price;
    float areaCoveredSqKm;
    long downloadCount;
    short publishedYear;
    byte regionCode;
    char mapType;
    String publisher;
    boolean hasCompass;
    int updateFrequencyDays;

    public Map(String title) {
        this.title = title;
    }

    public Map(boolean isDigital) {
        this.isDigital = isDigital;
    }

    public Map(int scaleRatio) {
        this.scaleRatio = scaleRatio;
    }

    public Map(double price) {
        this.price = price;
    }

    public Map(float areaCoveredSqKm) {
        this.areaCoveredSqKm = areaCoveredSqKm;
    }

    public Map(long downloadCount) {
        this.downloadCount = downloadCount;
    }

    public Map(short publishedYear) {
        this.publishedYear = publishedYear;
    }

    public Map(byte regionCode) {
        this.regionCode = regionCode;
    }

    public Map(char mapType) {
        this.mapType = mapType;
    }

    public Map(String title, String publisher) {
        this.title = title;
        this.publisher = publisher;
    }

    public Map(boolean isDigital, boolean hasCompass) {
        this.isDigital = isDigital;
        this.hasCompass = hasCompass;
    }

    public Map(int scaleRatio, int updateFrequencyDays) {
        this.scaleRatio = scaleRatio;
        this.updateFrequencyDays = updateFrequencyDays;
    }
}
