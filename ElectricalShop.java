public class ElectricalShop {
    public String appliances[] = new String[20];
    int index;

    public boolean addAppliance(String appliance) {
        boolean isAdded = false;
        if (index < appliances.length) {
            if (appliance != null && !appliance.isEmpty()) {
                appliances[index++] = appliance;
                isAdded = true;
            } else System.out.println(appliance + " is invalid");
        } else
            System.out.println("appliance index is full");
        return isAdded;
    }

    public void getApplianceDetails() {
        System.out.println("The appliances are : \n");
        for (String item : appliances)
            if (item != null) System.out.println(item);
    }

    public String getApplianceByIndex(int index) {
        String appliance = null;
        if (index < appliances.length)
            appliance = appliances[index];
        else
            System.out.println("Invalid index value: " + index);
        return appliance;
    }

    public int getIndexByAppliance(String appliance) {
        int idx = 0;
        if (appliance != null) {
            for (String item : appliances) {
                if (item != null && item.equals(appliance)) {
                    return idx;
                }
                idx++;
            }
        } else System.out.println("appliance name not found: " + appliance);
        return -1;
    }
}
