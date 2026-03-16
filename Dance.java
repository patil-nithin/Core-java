class Dance{

   String danceStyle;
   String originCountry;
   String famousPerformer;
   int popularityRank;
   Form form;

   public void getDanceDetails(){
       System.out.println("The dance style is: " + danceStyle);
       System.out.println("The origin country of the dance is: " + originCountry);
       System.out.println("The famous performer of this dance is: " + famousPerformer);
       System.out.println("The popularity rank of this dance is: " + popularityRank);
       this.form.getFormDetails();
   }
}