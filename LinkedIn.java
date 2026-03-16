class LinkedIn{

   String companyName;
   String headquarters;
   int employees;
   String ceoName;
   Profile profile;

   public void getLinkedInDetails(){
       System.out.println("The companyName is: " + companyName);
       System.out.println("The headquarters is: " + headquarters);
       System.out.println("The employees is: " + employees);
       System.out.println("The ceoName is: " + ceoName);
       this.profile.getProfileDetails();
   }
}