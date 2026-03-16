class HotelExecutor{

    public static void main(String[] args){
	
	Hotel hotel = new Hotel();
	hotel.hotelId = 2434;
	hotel.hotelName = "Tandoor Kitchen";
	hotel.ownerName = "Lalu";
	
	Floor floor = new Floor();
    
	floor.floorNumber = 1;
	/*Room room = new Room();
	room.roomType = "Ac";
	Floor.room=room;*/
	
	hotel.floor = floor;
	
	
	hotel.getHotelDetails();
	
	}

}