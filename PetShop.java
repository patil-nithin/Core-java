public class PetShop {
    private String petAccessories[] = new String[20];
    int index;

    public boolean addAccessory(String accessory) {
        boolean isAccessory = false;
        if (accessory != null && !accessory.isEmpty()) {
            petAccessories[index] = accessory;
            index++;
            isAccessory = true;
        } else {
            System.out.println(accessory + " is invalid");
        }
        return isAccessory;
    }

    public void getAccessories() {
        System.out.println(" PetShop Accessories ");
        for (String accessory : petAccessories)
            System.out.println(accessory);
    }
}
