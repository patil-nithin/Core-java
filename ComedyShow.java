class ComedyShow {

	int showId;
	double ticketPrice;
	String showName;
	String comedian;
	String venue;
	int duration;
	boolean isLive;
	String language;
	String city;
	int totalSeats;
	String date;
	String time;
	String genre;
	boolean isAvailable;
	int ageLimit;
	String organizer;
	double rating;
	boolean isRecorded;
	String platform;
	String category;

	public ComedyShow() {
		this(1, 999.0, "Laugh Factory", "Zakir Khan", "NSCI Dome", 120, true, "Hindi", "Mumbai", 2000, "2025-03-15", "8:00 PM", "Stand-Up", true, 18, "BookMyShow", 4.8, true, "Amazon Prime", "Adult Comedy");
	}

	public ComedyShow(int showId, double ticketPrice, String showName, String comedian, String venue, int duration, boolean isLive, String language, String city, int totalSeats, String date, String time, String genre, boolean isAvailable, int ageLimit, String organizer, double rating, boolean isRecorded, String platform, String category) {
		System.out.println("ComedyShow ShowId : " + showId);
		System.out.println("ComedyShow TicketPrice : " + ticketPrice);
		System.out.println("ComedyShow ShowName : " + showName);
		System.out.println("ComedyShow Comedian : " + comedian);
		System.out.println("ComedyShow Venue : " + venue);
		System.out.println("ComedyShow Duration : " + duration);
		System.out.println("ComedyShow IsLive : " + isLive);
		System.out.println("ComedyShow Language : " + language);
		System.out.println("ComedyShow City : " + city);
		System.out.println("ComedyShow TotalSeats : " + totalSeats);
		System.out.println("ComedyShow Date : " + date);
		System.out.println("ComedyShow Time : " + time);
		System.out.println("ComedyShow Genre : " + genre);
		System.out.println("ComedyShow IsAvailable : " + isAvailable);
		System.out.println("ComedyShow AgeLimit : " + ageLimit);
		System.out.println("ComedyShow Organizer : " + organizer);
		System.out.println("ComedyShow Rating : " + rating);
		System.out.println("ComedyShow IsRecorded : " + isRecorded);
		System.out.println("ComedyShow Platform : " + platform);
		System.out.println("ComedyShow Category : " + category);
	}
}