public class Architect {
    private String interiorDesignNames[] = new String[11];
    int index;

    public boolean addInteriorDesign(String design) {
        boolean isDesign = false;
        if (design != null && !design.isEmpty()) {
            interiorDesignNames[index] = design;
            index++;
            isDesign = true;
        } else {
            System.out.println(design + " is invalid");
        }
        return isDesign;
    }

    public void getInteriorDesigns() {
        System.out.println(" Architect Interior Designs ");
        for (String design : interiorDesignNames)
            System.out.println(design);
    }
}
