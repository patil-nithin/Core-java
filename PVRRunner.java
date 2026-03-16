class PVRRunner {
    public static void main(String[] args) {

        PVR p1 = new PVR("Forum Mall, Bengaluru");
        System.out.println("1. The PVR cinema is located at " + p1.location + ".");

        PVR p2 = new PVR(true);
        System.out.println("2. Does this PVR multiplex feature an IMAX screen? " + p2.hasIMAX + ".");

        PVR p3 = new PVR(11);
        System.out.println("3. This specific PVR branch operates " + p3.screenCount + " screens.");

        PVR p4 = new PVR(350.50);
        System.out.println("4. The average ticket price at this cinema is Rs " + p4.ticketPrice + ".");

        PVR p5 = new PVR(4.6f);
        System.out.println("5. Customer reviews give this PVR an average rating of " + p5.rating + " out of 5.");

        PVR p6 = new PVR(150000L);
        System.out.println("6. The cinema chain recorded " + p6.dailyVisitors + " daily visitors nationwide.");

        PVR p7 = new PVR((short)1200);
        System.out.println("7. The total seating capacity of this multiplex is " + p7.seatingCapacity + " seats.");

        PVR p8 = new PVR((byte)3);
        System.out.println("8. This premium location includes " + p8.premiumLounges + " VIP lounges.");

        PVR p9 = new PVR('A');
        System.out.println("9. The facility is classified under the '" + p9.cinemaGrade + "' grade standard.");

        PVR p10 = new PVR("Orion Mall", "Rajesh Kumar");
        System.out.println("10. The PVR at " + p10.location + " is currently managed by " + p10.managerName + ".");

        PVR p11 = new PVR(8, 450);
        System.out.println("11. The cinema has " + p11.screenCount + " screens and a parking capacity for " + p11.parkingCapacity + " vehicles.");

        PVR p12 = new PVR(true, false);
        System.out.println("12. IMAX availability is " + p12.hasIMAX + " and alcohol service is " + p12.servesAlcohol + ".");
    }
}