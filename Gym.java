public class Gym {
    public String equipments[] = new String[16];
    int index;

    public boolean addEquipment(String equipment) {
        boolean isAdded = false;
        if (index < equipments.length) {
            if (equipment != null && !equipment.isEmpty()) {
                equipments[index++] = equipment;
                isAdded = true;
            } else System.out.println(equipment + " is invalid");
        } else
            System.out.println("equipment index is full");
        return isAdded;
    }

    public void getEquipmentDetails() {
        System.out.println("The equipments are : \n");
        for (String item : equipments)
            if (item != null) System.out.println(item);
    }

    public String getEquipmentByIndex(int index) {
        String equipment = null;
        if (index < equipments.length)
            equipment = equipments[index];
        else
            System.out.println("Invalid index value: " + index);
        return equipment;
    }

    public int getIndexByEquipment(String equipment) {
        int idx = 0;
        if (equipment != null) {
            for (String item : equipments) {
                if (item != null && item.equals(equipment)) {
                    return idx;
                }
                idx++;
            }
        } else System.out.println("equipment name not found: " + equipment);
        return -1;
    }
}
