class Hardware{

   String componentName;
   String manufacturer;
   String type;
   int price;

   public void getHardwareDetails(){
       System.out.println("The hardware component name is: " + componentName);
       System.out.println("The manufacturer of the hardware is: " + manufacturer);
       System.out.println("The type of the hardware component is: " + type);
       System.out.println("The price of the hardware component is: " + price);
   }
}