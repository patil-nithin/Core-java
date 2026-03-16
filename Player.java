class Player{

   String playerName;
   String teamName;
   int runs;
   String role;

   public void getPlayerDetails(){
       System.out.println("The player name is: " + playerName);
       System.out.println("The team name of the player is: " + teamName);
       System.out.println("The total runs scored by the player are: " + runs);
       System.out.println("The role of the player in the team is: " + role);
   }
}