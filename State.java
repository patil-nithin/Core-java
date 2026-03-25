public class State {
    private String highwayNames[] = new String[9];
    int index;

    public boolean addHighway(String highway) {
        boolean isHighway = false;
        if (highway != null && !highway.isEmpty()) {
            highwayNames[index] = highway;
            index++;
            isHighway = true;
        } else {
            System.out.println(highway + " is invalid");
        }
        return isHighway;
    }

    public void getHighways() {
        System.out.println(" State Highway Names ");
        for (String highway : highwayNames)
           System.out.println(highway);
    }
}
