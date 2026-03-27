public class ElectricalShopExecutor {
    public static void main(String[] args) {
        ElectricalShop electricalShop = new ElectricalShop();
        electricalShop.addAppliance("Ceiling Fan");
        electricalShop.addAppliance("Table Fan");
        electricalShop.addAppliance("LED Bulb");
        electricalShop.addAppliance("Tube Light");
        electricalShop.addAppliance("Switch Board");
        electricalShop.addAppliance("Extension Cord");
        electricalShop.addAppliance("Voltage Stabilizer");
        electricalShop.addAppliance("UPS");
        electricalShop.addAppliance("Inverter");
        electricalShop.addAppliance("Solar Panel");
        electricalShop.addAppliance("Electric Meter");
        electricalShop.addAppliance("Circuit Breaker");
        electricalShop.addAppliance("Transformer");
        electricalShop.addAppliance("Wire Cable");
        electricalShop.addAppliance("Power Strip");
        electricalShop.addAppliance("Exhaust Fan");
        electricalShop.addAppliance("Dimmer Switch");
        electricalShop.addAppliance("Smart Plug");
        electricalShop.addAppliance("Motion Sensor");
        electricalShop.addAppliance("Timer Switch");
        electricalShop.getApplianceDetails();
        int index = 2;
        String applianceByIndex = electricalShop.getApplianceByIndex(index);
        System.out.println("Appliance at index " + index + " is: " + applianceByIndex);
        String applianceName = "Inverter";
        int applianceIndex = electricalShop.getIndexByAppliance(applianceName);
        System.out.println("Index of " + applianceName + " is: " + applianceIndex);
    }
}
