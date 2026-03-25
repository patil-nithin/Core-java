public class Gym {
    private String equipments[] = new String[16];
    int index;

    public boolean addEquipment(String equipment) {
        boolean isEquipment = false;
        if (equipment != null && !equipment.isEmpty()) {
            equipments[index] = equipment;
            index++;
            isEquipment = true;
        } else {
            System.out.println(equipment + " is invalid");
        }
        return isEquipment;
    }

    public void getEquipments() {
        System.out.println(" Gym Equipments ");
        for (String equipment : equipments)
           System.out.println(equipment);
    }
}
