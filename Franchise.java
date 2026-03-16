class Franchise{

   String franchiseName;
   String owner;
   int foundedYear;
   String headquarters;

   public void getFranchiseDetails(){
       System.out.println("The franchise name is: " + franchiseName);
       System.out.println("The franchise owner is: " + owner);
       System.out.println("The franchise founded year is: " + foundedYear);
       System.out.println("The franchise headquarters is located in: " + headquarters);
   }
}