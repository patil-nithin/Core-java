class Mall{

   String mallName;
   String location;
   int floors;
   String openingYear;
   Shop shop;

   public void getMallDetails(){
       System.out.println("The mall name is: " + mallName);
       System.out.println("The mall location is: " + location);
       System.out.println("The number of floors in the mall is: " + floors);
       System.out.println("The mall opening year is: " + openingYear);
       this.shop.getShopDetails();
   }
}