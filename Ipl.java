class Ipl{

   String season;
   String sponsor;
   int totalTeams;
   String hostCountry;
   Player player;

   public void getIplDetails(){
       System.out.println("The IPL season is: " + season);
       System.out.println("The sponsor of the IPL is: " + sponsor);
       System.out.println("The total number of teams in IPL is: " + totalTeams);
       System.out.println("The host country of IPL is: " + hostCountry);
       this.player.getPlayerDetails();
   }
}