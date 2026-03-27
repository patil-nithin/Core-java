public class State {
    public String highwayNames[] = new String[9];
    int index;

    public boolean addHighway(String highway) {
        boolean isAdded = false;
        if (index < highwayNames.length) {
            if (highway != null && !highway.isEmpty()) {
                highwayNames[index++] = highway;
                isAdded = true;
            } else System.out.println(highway + " is invalid");
        } else
            System.out.println("highway index is full");
        return isAdded;
    }

    public void getHighwayDetails() {
        System.out.println("The highways are : \n");
        for (String item : highwayNames)
            if (item != null) System.out.println(item);
    }

    public String getHighwayByIndex(int index) {
        String highway = null;
        if (index < highwayNames.length)
            highway = highwayNames[index];
        else
            System.out.println("Invalid index value: " + index);
        return highway;
    }

    public int getIndexByHighway(String highway) {
        int idx = 0;
        if (highway != null) {
            for (String item : highwayNames) {
                if (item != null && item.equals(highway)) {
                    return idx;
                }
                idx++;
            }
        } else System.out.println("highway name not found: " + highway);
        return -1;
    }
}
