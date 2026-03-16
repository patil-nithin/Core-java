class Shop{

   String shopName;
   String category;
   String ownerName;
   int employees;

   public void getShopDetails(){
       System.out.println("The shop name is: " + shopName);
       System.out.println("The shop category is: " + category);
       System.out.println("The shop owner name is: " + ownerName);
       System.out.println("The number of employees working in the shop is: " + employees);
   }
}