public class Universe {
    private String galaxies[] = new String[17];
    int index;

    public boolean addGalaxy(String galaxy) {
        boolean isGalaxy = false;
        if (galaxy != null && !galaxy.isEmpty()) {
            galaxies[index] = galaxy;
            index++;
            isGalaxy = true;
        } else {
            System.out.println(galaxy + " is invalid");
        }
        return isGalaxy;
    }

    public void getGalaxies() {
        System.out.println(" Universe Galaxies ");
        for (String galaxy : galaxies)
            System.out.println(galaxy);
    }
}
