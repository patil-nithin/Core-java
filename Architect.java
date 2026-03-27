public class Architect {
    public String interiorDesignNames[] = new String[11];
    int index;

    public boolean addInteriorDesign(String interiorDesign) {
        boolean isAdded = false;
        if (index < interiorDesignNames.length) {
            if (interiorDesign != null && !interiorDesign.isEmpty()) {
                interiorDesignNames[index++] = interiorDesign;
                isAdded = true;
            } else System.out.println(interiorDesign + " is invalid");
        } else
            System.out.println("interiorDesign index is full");
        return isAdded;
    }

    public void getInteriorDesignDetails() {
        System.out.println("The interiorDesigns are : \n");
        for (String item : interiorDesignNames)
            if (item != null) System.out.println(item);
    }

    public String getInteriorDesignByIndex(int index) {
        String interiorDesign = null;
        if (index < interiorDesignNames.length)
            interiorDesign = interiorDesignNames[index];
        else
            System.out.println("Invalid index value: " + index);
        return interiorDesign;
    }

    public int getIndexByInteriorDesign(String interiorDesign) {
        int idx = 0;
        if (interiorDesign != null) {
            for (String item : interiorDesignNames) {
                if (item != null && item.equals(interiorDesign)) {
                    return idx;
                }
                idx++;
            }
        } else System.out.println("interiorDesign name not found: " + interiorDesign);
        return -1;
    }
}
