public class PetShop {
    public String petAccessories[] = new String[20];
    int index;

    public boolean addAccessory(String accessory) {
        boolean isAdded = false;
        if (index < petAccessories.length) {
            if (accessory != null && !accessory.isEmpty()) {
                petAccessories[index++] = accessory;
                isAdded = true;
            } else System.out.println(accessory + " is invalid");
        } else
            System.out.println("accessory index is full");
        return isAdded;
    }

    public void getAccessoryDetails() {
        System.out.println("The accessorys are : \n");
        for (String item : petAccessories)
            if (item != null) System.out.println(item);
    }

    public String getAccessoryByIndex(int index) {
        String accessory = null;
        if (index < petAccessories.length)
            accessory = petAccessories[index];
        else
            System.out.println("Invalid index value: " + index);
        return accessory;
    }

    public int getIndexByAccessory(String accessory) {
        int idx = 0;
        if (accessory != null) {
            for (String item : petAccessories) {
                if (item != null && item.equals(accessory)) {
                    return idx;
                }
                idx++;
            }
        } else System.out.println("accessory name not found: " + accessory);
        return -1;
    }
}
