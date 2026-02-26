class movie {

    static String name;
    static String language;
    static String genre;
    static String director;
    static int durationMinutes;
    static double rating;
    static boolean isReleased;

 static boolean getMovieDetails(String mName, String mLanguage, String mGenre, String mDirector, int mDuration, double mRating, boolean mReleased) {

        boolean isMovieCreated = false;

        boolean isName = false;
        boolean isLanguage = false;
        boolean isGenre = false;
        boolean isDirector = false;
        boolean isDuration = false;
        boolean isRating = false;
        boolean isReleasedFlag = false;

        if (mName != null && !mName.isEmpty()) {
            name = mName;
            isName = true;
        } else {
            System.out.println("Movie name is null or empty");
        }

        if (mLanguage != null && !mLanguage.isEmpty()) {
            language = mLanguage;
            isLanguage = true;
        } else {
            System.out.println("Movie language is null or empty");
        }

        if (mGenre != null && !mGenre.isEmpty()) {
            genre = mGenre;
            isGenre = true;
        } else {
            System.out.println("Movie genre is null or empty");
        }

        if (mDirector != null && !mDirector.isEmpty()) {
            director = mDirector;
            isDirector = true;
        } else {
            System.out.println("Movie director is null or empty");
        }

        if (mDuration > 0) {
            durationMinutes = mDuration;
            isDuration = true;
        } else {
            System.out.println("Movie duration is zero or negative");
        }

        if (mRating >= 0 && mRating <= 10) {
            rating = mRating;
            isRating = true;
        } else {
            System.out.println("Movie rating is invalid");
        }

        if (mReleased) {
            isReleased = mReleased;
            isReleasedFlag = true;
        } else {
            System.out.println("Movie not released");
        }

        if (isName && isLanguage && isGenre && isDirector &&
            isDuration && isRating && isReleasedFlag) {

            isMovieCreated = true;
        }

        return isMovieCreated;
    }

    static void fetchDetails() {

        System.out.println("fetching movie details......");
        System.out.println("Movie Name is:" + name);
        System.out.println("Language is:" + language);
        System.out.println("Genre is:" + genre);
        System.out.println("Director is:" + director);
        System.out.println("Duration (min) is:" + durationMinutes);
        System.out.println("Rating is:" + rating);
        System.out.println("Released is:" + isReleased);
    }
}