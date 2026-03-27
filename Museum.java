public class Museum {
    public String historicalMonuments[] = new String[16];
    int index;

    public boolean addMonument(String monument) {
        boolean isAdded = false;
        if (index < historicalMonuments.length) {
            if (monument != null && !monument.isEmpty()) {
                historicalMonuments[index++] = monument;
                isAdded = true;
            } else System.out.println(monument + " is invalid");
        } else
            System.out.println("monument index is full");
        return isAdded;
    }

    public void getMonumentDetails() {
        System.out.println("The monuments are : \n");
        for (String item : historicalMonuments)
            if (item != null) System.out.println(item);
    }

    public String getMonumentByIndex(int index) {
        String monument = null;
        if (index < historicalMonuments.length)
            monument = historicalMonuments[index];
        else
            System.out.println("Invalid index value: " + index);
        return monument;
    }

    public int getIndexByMonument(String monument) {
        int idx = 0;
        if (monument != null) {
            for (String item : historicalMonuments) {
                if (item != null && item.equals(monument)) {
                    return idx;
                }
                idx++;
            }
        } else System.out.println("monument name not found: " + monument);
        return -1;
    }
}
