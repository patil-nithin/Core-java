class PlayStore{

   String storeName;
   String company;
   int totalApps;
   String launchYear;
   Application application;

   public void getPlayStoreDetails(){
       System.out.println("The store name is: " + storeName);
       System.out.println("The company that owns the store is: " + company);
       System.out.println("The total number of apps available in the store is: " + totalApps);
       System.out.println("The launch year of the store is: " + launchYear);
       this.application.getApplicationDetails();
   }
}