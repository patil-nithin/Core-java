public class Goa {
    private String beachNames[] = new String[19];
    int index;

    public boolean addBeach(String beach) {
        boolean isBeach = false;
        if (beach != null && !beach.isEmpty()) {
            beachNames[index] = beach;
            index++;
            isBeach = true;
        } else {
            System.out.println(beach + " is invalid");
        }
        return isBeach;
    }

    public void getBeaches() {
        System.out.println(" Goa Beach Names ");
        for (String beach : beachNames)
           System.out.println(beach);
    }
}
