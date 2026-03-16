class Universe{

   String name;
   String location;
   int size;
   String description;
   Earth earth;

   public void getUniverseDetails(){
       System.out.println("The name is: " + name);
       System.out.println("The location is: " + location);
       System.out.println("The size is: " + size);
       System.out.println("The description is: " + description);
       this.earth.getEarthDetails();
   }
}