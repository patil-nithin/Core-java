public class NetflixExecutor {
    public static void main(String[] args) {
        Netflix netflix = new Netflix();
        netflix.addWebSeries("Family Man");
        netflix.addWebSeries("Sacred Games");
        netflix.addWebSeries("Mirzapur");
        netflix.addWebSeries("Panchayat");
        netflix.addWebSeries("Scam 1992");
        netflix.addWebSeries("Aspirants");
        netflix.addWebSeries("Delhi Crime");
        netflix.addWebSeries("Breathe");
        netflix.addWebSeries("Aarya");
        netflix.addWebSeries("Paatal Lok");
        netflix.addWebSeries("Kota Factory");
        netflix.addWebSeries("TVF Pitchers");
        netflix.addWebSeries("Jamtara");
        netflix.addWebSeries("Rocket Boys");
        netflix.addWebSeries("Taj Mahal 1989");
        netflix.addWebSeries("Four More Shots");
        netflix.addWebSeries("Hostages");
        netflix.addWebSeries("Typewriter");
        netflix.getWebSeriesDetails();
        int index = 2;
        String seriesByIndex = netflix.getWebSeriesByIndex(index);
        System.out.println("Web series at index " + index + " is: " + seriesByIndex);
        String seriesName = "Panchayat";
        int seriesIndex = netflix.getIndexByWebSeries(seriesName);
        System.out.println("Index of " + seriesName + " is: " + seriesIndex);
    }
}
