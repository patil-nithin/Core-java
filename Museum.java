public class Museum {
    private String historicalMonuments[] = new String[16];
    int index;

    public boolean addMonument(String monument) {
        boolean isMonument = false;
        if (monument != null && !monument.isEmpty()) {
            historicalMonuments[index] = monument;
            index++;
            isMonument = true;
        } else {
            System.out.println(monument + " is invalid");
        }
        return isMonument;
    }

    public void getMonuments() {
        System.out.println(" Museum Historical Monuments ");
        for (String monument : historicalMonuments)
            System.out.println(monument);
    }
}
