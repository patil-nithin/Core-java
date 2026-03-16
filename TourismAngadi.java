class TourismAngadi{

   String name;
   String location;
   int size;
   String description;
   Package package;

   public void getTourismAngadiDetails(){
       System.out.println("The name is: " + name);
       System.out.println("The location is: " + location);
       System.out.println("The size is: " + size);
       System.out.println("The description is: " + description);
       this.package.getPackageDetails();
   }
}