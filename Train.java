class Train{

   String trainName;
   String trainNumber;
   String source;
   String destination;
   Boggy boggy;

   public void getTrainDetails(){
       System.out.println("The train name is: " + trainName);
       System.out.println("The train number is: " + trainNumber);
       System.out.println("The source station is: " + source);
       System.out.println("The destination station is: " + destination);
       this.boggy.getBoggyDetails();
   }
}