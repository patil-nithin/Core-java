public class ArchitectExecutor {
    public static void main(String[] args) {
        Architect architect = new Architect();
        architect.addInteriorDesign("Modern Minimalist");
        architect.addInteriorDesign("Scandinavian");
        architect.addInteriorDesign("Industrial");
        architect.addInteriorDesign("Bohemian");
        architect.addInteriorDesign("Contemporary");
        architect.addInteriorDesign("Traditional");
        architect.addInteriorDesign("Mediterranean");
        architect.addInteriorDesign("Art Deco");
        architect.addInteriorDesign("Rustic");
        architect.addInteriorDesign("Coastal");
        architect.addInteriorDesign("Mid Century Modern");
        architect.getInteriorDesignDetails();
        int index = 4;
        String designByIndex = architect.getInteriorDesignByIndex(index);
        System.out.println("Interior design at index " + index + " is: " + designByIndex);
        String designName = "Industrial";
        int designIndex = architect.getIndexByInteriorDesign(designName);
        System.out.println("Index of " + designName + " is: " + designIndex);
    }
}
