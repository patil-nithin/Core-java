class Toxic {
    String title;
    String director;
    int releaseYear;
    int durationMinutes;
    double boxOfficeGross;
    double budget;
    boolean isBlockbuster;
    boolean hasSequel;
    float imdbRating;
    long ticketSales;
    short screenCount;
    char ageRating;

    public Toxic(String title) {
        this.title = title;
    }

    public Toxic(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Toxic(double boxOfficeGross) {
        this.boxOfficeGross = boxOfficeGross;
    }

    public Toxic(boolean isBlockbuster) {
        this.isBlockbuster = isBlockbuster;
    }

    public Toxic(float imdbRating) {
        this.imdbRating = imdbRating;
    }

    public Toxic(long ticketSales) {
        this.ticketSales = ticketSales;
    }

    public Toxic(short screenCount) {
        this.screenCount = screenCount;
    }

    public Toxic(char ageRating) {
        this.ageRating = ageRating;
    }

    public Toxic(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public Toxic(int releaseYear, int durationMinutes) {
        this.releaseYear = releaseYear;
        this.durationMinutes = durationMinutes;
    }

    public Toxic(double boxOfficeGross, double budget) {
        this.boxOfficeGross = boxOfficeGross;
        this.budget = budget;
    }

    public Toxic(boolean isBlockbuster, boolean hasSequel) {
        this.isBlockbuster = isBlockbuster;
        this.hasSequel = hasSequel;
    }
}

