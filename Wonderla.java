class Wonderla{

   String parkName;
   String location;
   int rides;
   String openingYear;
   LazyPool lazypool;

   public void getWonderlaDetails(){
       System.out.println("The parkName is: " + parkName);
       System.out.println("The location is: " + location);
       System.out.println("The rides is: " + rides);
       System.out.println("The openingYear is: " + openingYear);
       this.lazypool.getLazyPoolDetails();
   }
}