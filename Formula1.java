class Formula1{

   String teamName;
   String country;
   String teamPrincipal;
   int championships;
   Franchise franchise;

   public void getFormula1Details(){
       System.out.println("The Formula1 team name is: " + teamName);
       System.out.println("The country of the team is: " + country);
       System.out.println("The team principal is: " + teamPrincipal);
       System.out.println("The number of championships won is: " + championships);
       this.franchise.getFranchiseDetails();
   }
}