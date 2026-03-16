class Salon{

   String name;
   String location;
   int size;
   String description;
   Service service;

   public void getSalonDetails(){
       System.out.println("The name is: " + name);
       System.out.println("The location is: " + location);
       System.out.println("The size is: " + size);
       System.out.println("The description is: " + description);
       this.service.getServiceDetails();
   }
}