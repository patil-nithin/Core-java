public class Netflix {
    public String webSeries[] = new String[18];
    int index;

    public boolean addWebSeries(String webSeries) {
        boolean isAdded = false;
        if (index < webSeries.length) {
            if (webSeries != null && !webSeries.isEmpty()) {
                webSeries[index++] = webSeries;
                isAdded = true;
            } else System.out.println(webSeries + " is invalid");
        } else
            System.out.println("webSeries index is full");
        return isAdded;
    }

    public void getWebSeriesDetails() {
        System.out.println("The webSeriess are : \n");
        for (String item : webSeries)
            if (item != null) System.out.println(item);
    }

    public String getWebSeriesByIndex(int index) {
        String webSeries = null;
        if (index < webSeries.length)
            webSeries = webSeries[index];
        else
            System.out.println("Invalid index value: " + index);
        return webSeries;
    }

    public int getIndexByWebSeries(String webSeries) {
        int idx = 0;
        if (webSeries != null) {
            for (String item : webSeries) {
                if (item != null && item.equals(webSeries)) {
                    return idx;
                }
                idx++;
            }
        } else System.out.println("webSeries name not found: " + webSeries);
        return -1;
    }
}
