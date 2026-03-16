class TrophyRunner {
    public static void main(String[] args) {

        System.out.println("\n");

        Trophy t1 = new Trophy("World Cup");
        System.out.println("1. The trophy is awarded for the " + t1.eventName + " tournament.");

        Trophy t2 = new Trophy(true);
        System.out.println("2. Is the championship trophy gold-plated? " + t2.isGoldPlated + ".");

        Trophy t3 = new Trophy(2026);
        System.out.println("3. The trophy was officially awarded in the year " + t3.winningYear + ".");

        Trophy t4 = new Trophy(6.1);
        System.out.println("4. The solid metal trophy weighs " + t4.weightKg + " kilograms.");

        Trophy t5 = new Trophy(36.8f);
        System.out.println("5. The trophy stands at an impressive height of " + t5.heightCm + " centimeters.");

        Trophy t6 = new Trophy(42000000L);
        System.out.println("6. The winning team received a staggering prize money of $" + t6.prizeMoney + ".");

        Trophy t7 = new Trophy((short)11);
        System.out.println("7. The trophy was lifted by a team consisting of " + t7.teamSize + " starting players.");

        Trophy t8 = new Trophy((byte)1);
        System.out.println("8. This specific trophy is given to the team finishing in rank position " + t8.rankPosition + ".");

        Trophy t9 = new Trophy('A');
        System.out.println("9. The material quality grade of this award is '" + t9.grade + "'.");

        Trophy t10 = new Trophy("Champions League", "Real Madrid");
        System.out.println("10. The " + t10.eventName + " trophy was proudly received by " + t10.recipient + ".");

        Trophy t11 = new Trophy(2024, 250);
        System.out.println("11. Awarded in " + t11.winningYear + ", the custom engraving cost $" + t11.engravingCost + ".");

        Trophy t12 = new Trophy(true, true);
        System.out.println("12. Gold plated: " + t12.isGoldPlated + ". Includes a wooden base: " + t12.hasBase + ".");
    }
}