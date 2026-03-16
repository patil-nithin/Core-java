class Hotel{
    
	
	int hotelId;
	String hotelName;
	String ownerName;
	Floor floor;
	
	public void getHotelDetails(){
	System.out.println("The hotelId is " +this.hotelId);
	System.out.println("The hotelName is "+ this.hotelName);
	System.out.println("The ownerName is " + this.ownerName);
    this.floor.getFloorDetails();
	
	}


}