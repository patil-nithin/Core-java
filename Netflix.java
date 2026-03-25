public class Netflix {
    private String webSeries[] = new String[18];
    int index;

    public boolean addWebSeries(String series) {
        boolean isWebSeries = false;
        if (series != null && !series.isEmpty()) {
            webSeries[index] = series;
            index++;
            isWebSeries = true;
        } else {
            System.out.println(series + " is invalid");
        }
        return isWebSeries;
    }

    public void getWebSeries() {
        System.out.println(" Netflix Web Series ");
        for (String series : webSeries)
            System.out.println(series);
    }
}
