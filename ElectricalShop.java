public class ElectricalShop {
    private String appliances[] = new String[20];
    int index;

    public boolean addAppliance(String appliance) {
        boolean isAppliance = false;
        if (appliance != null && !appliance.isEmpty()) {
            appliances[index] = appliance;
            index++;
            isAppliance = true;
        } else {
            System.out.println(appliance + " is invalid");
        }
        return isAppliance;
    }

    public void getAppliances() {
        System.out.println(" ElectricalShop Appliances ");
        for (String appliance : appliances)
           System.out.println(appliance);
    }
}
