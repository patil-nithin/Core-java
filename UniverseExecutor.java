public class UniverseExecutor {
    public static void main(String[] args) {
        Universe universe = new Universe();
        universe.addGalaxy("Milky Way");
        universe.addGalaxy("Andromeda");
        universe.addGalaxy("Triangulum");
        universe.addGalaxy("Whirlpool");
        universe.addGalaxy("Sombrero");
        universe.addGalaxy("Pinwheel");
        universe.addGalaxy("Cartwheel");
        universe.addGalaxy("Black Eye");
        universe.addGalaxy("Cigar Galaxy");
        universe.addGalaxy("Sunflower Galaxy");
        universe.addGalaxy("Tadpole Galaxy");
        universe.addGalaxy("Antennae Galaxies");
        universe.addGalaxy("Large Magellanic Cloud");
        universe.addGalaxy("Small Magellanic Cloud");
        universe.addGalaxy("Centaurus A");
        universe.addGalaxy("NGC 1300");
        universe.addGalaxy("Messier 87");
        universe.getGalaxyDetails();
        int index = 1;
        String galaxyByIndex = universe.getGalaxyByIndex(index);
        System.out.println("Galaxy at index " + index + " is: " + galaxyByIndex);
        String galaxyName = "Sombrero";
        int galaxyIndex = universe.getIndexByGalaxy(galaxyName);
        System.out.println("Index of " + galaxyName + " is: " + galaxyIndex);
    }
}
