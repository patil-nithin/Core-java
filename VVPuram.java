class VVPuram{

   String name;
   String location;
   int size;
   String description;
   FoodStreet foodstreet;

   public void getVVPuramDetails(){
       System.out.println("The name is: " + name);
       System.out.println("The location is: " + location);
       System.out.println("The size is: " + size);
       System.out.println("The description is: " + description);
       this.foodstreet.getFoodStreetDetails();
   }
}