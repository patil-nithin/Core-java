class Form{

   String formName;
   String difficultyLevel;
   String costumeType;
   int averageDuration;

   public void getFormDetails(){
       System.out.println("The dance form name is: " + formName);
       System.out.println("The difficulty level of the form is: " + difficultyLevel);
       System.out.println("The costume type used in the form is: " + costumeType);
       System.out.println("The average duration of the performance is: " + averageDuration + " minutes");
   }
}