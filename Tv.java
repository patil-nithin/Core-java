class Tv{

   String tvBrand;
   String model;
   int screenSize;
   String resolution;
   Channel channel;

   public void getTvDetails(){
       System.out.println("The tvBrand is: " + tvBrand);
       System.out.println("The model is: " + model);
       System.out.println("The screenSize is: " + screenSize);
       System.out.println("The resolution is: " + resolution);
       this.channel.getChannelDetails();
   }
}