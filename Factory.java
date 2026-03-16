class Factory{

   String factoryName;
   String location;
   int workers;
   String industryType;
   Machine machine;

   public void getFactoryDetails(){
       System.out.println("The factoryName is: " + factoryName);
       System.out.println("The location is: " + location);
       System.out.println("The workers is: " + workers);
       System.out.println("The industryType is: " + industryType);
       this.machine.getMachineDetails();
   }
}