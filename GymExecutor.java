public class GymExecutor {
    public static void main(String[] args) {
        Gym gym = new Gym();
        gym.addEquipment("Treadmill");
        gym.addEquipment("Dumbbells");
        gym.addEquipment("Barbell");
        gym.addEquipment("Bench Press");
        gym.addEquipment("Pull Up Bar");
        gym.addEquipment("Rowing Machine");
        gym.addEquipment("Elliptical");
        gym.addEquipment("Leg Press");
        gym.addEquipment("Cable Machine");
        gym.addEquipment("Kettlebell");
        gym.addEquipment("Smith Machine");
        gym.addEquipment("Battle Ropes");
        gym.addEquipment("Resistance Bands");
        gym.addEquipment("Foam Roller");
        gym.addEquipment("Ab Roller");
        gym.addEquipment("Spin Bike");
        gym.getEquipmentDetails();
        int index = 1;
        String equipmentByIndex = gym.getEquipmentByIndex(index);
        System.out.println("Equipment at index " + index + " is: " + equipmentByIndex);
        String equipmentName = "Kettlebell";
        int equipmentIndex = gym.getIndexByEquipment(equipmentName);
        System.out.println("Index of " + equipmentName + " is: " + equipmentIndex);
    }
}
