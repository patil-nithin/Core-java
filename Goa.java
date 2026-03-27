public class Goa {
    public String beachNames[] = new String[19];
    int index;

    public boolean addBeach(String beach) {
        boolean isAdded = false;
        if (index < beachNames.length) {
            if (beach != null && !beach.isEmpty()) {
                beachNames[index++] = beach;
                isAdded = true;
            } else System.out.println(beach + " is invalid");
        } else
            System.out.println("beach index is full");
        return isAdded;
    }

    public void getBeachDetails() {
        System.out.println("The beachs are : \n");
        for (String item : beachNames)
            if (item != null) System.out.println(item);
    }

    public String getBeachByIndex(int index) {
        String beach = null;
        if (index < beachNames.length)
            beach = beachNames[index];
        else
            System.out.println("Invalid index value: " + index);
        return beach;
    }

    public int getIndexByBeach(String beach) {
        int idx = 0;
        if (beach != null) {
            for (String item : beachNames) {
                if (item != null && item.equals(beach)) {
                    return idx;
                }
                idx++;
            }
        } else System.out.println("beach name not found: " + beach);
        return -1;
    }
}
