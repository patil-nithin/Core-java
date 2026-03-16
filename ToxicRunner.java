class ToxicRunner {
    public static void main(String[] args) {

        System.out.println("\n");

        Toxic t1 = new Toxic("Toxic: The Movie");
        System.out.println("1. The movie title is " + t1.title + ".");

        Toxic t2 = new Toxic(2025);
        System.out.println("2. The movie was officially released in the year " + t2.releaseYear + ".");

        Toxic t3 = new Toxic(150.5);
        System.out.println("3. The worldwide box office gross is $" + t3.boxOfficeGross + " million.");

        Toxic t4 = new Toxic(true);
        System.out.println("4. Is this movie considered a blockbuster? " + t4.isBlockbuster + ".");

        Toxic t5 = new Toxic(8.7f);
        System.out.println("5. The movie received a stellar IMDb rating of " + t5.imdbRating + "/10.");

        Toxic t6 = new Toxic(12500000L);
        System.out.println("6. The movie achieved a total of " + t6.ticketSales + " ticket sales globally.");

        Toxic t7 = new Toxic((short)4500);
        System.out.println("7. The movie premiered across " + t7.screenCount + " screens worldwide.");

        Toxic t8 = new Toxic('A');
        System.out.println("8. The official age rating certification for the movie is '" + t8.ageRating + "'.");

        Toxic t9 = new Toxic("Toxic: Fairy Tale for Grown-ups", "Geetu Mohandas");
        System.out.println("9. The movie title is " + t9.title + " and it is masterfully directed by " + t9.director + ".");

        Toxic t10 = new Toxic(2025, 165);
        System.out.println("10. Released in " + t10.releaseYear + ", the total runtime is " + t10.durationMinutes + " minutes.");

        Toxic t11 = new Toxic(200.0, 75.0);
        System.out.println("11. The movie grossed $" + t11.boxOfficeGross + " million against a budget of $" + t11.budget + " million.");

        Toxic t12 = new Toxic(true, false);
        System.out.println("12. Blockbuster status: " + t12.isBlockbuster + ". Has a sequel been announced? " + t12.hasSequel + ".");
    }
}