public class Universe {
    public String galaxies[] = new String[17];
    int index;

    public boolean addGalaxy(String galaxy) {
        boolean isAdded = false;
        if (index < galaxies.length) {
            if (galaxy != null && !galaxy.isEmpty()) {
                galaxies[index++] = galaxy;
                isAdded = true;
            } else System.out.println(galaxy + " is invalid");
        } else
            System.out.println("galaxy index is full");
        return isAdded;
    }

    public void getGalaxyDetails() {
        System.out.println("The galaxys are : \n");
        for (String item : galaxies)
            if (item != null) System.out.println(item);
    }

    public String getGalaxyByIndex(int index) {
        String galaxy = null;
        if (index < galaxies.length)
            galaxy = galaxies[index];
        else
            System.out.println("Invalid index value: " + index);
        return galaxy;
    }

    public int getIndexByGalaxy(String galaxy) {
        int idx = 0;
        if (galaxy != null) {
            for (String item : galaxies) {
                if (item != null && item.equals(galaxy)) {
                    return idx;
                }
                idx++;
            }
        } else System.out.println("galaxy name not found: " + galaxy);
        return -1;
    }
}
