public class CricBuzExecutor {
    public static void main(String[] args) {
        CricBuz cricBuz = new CricBuz();
        cricBuz.addTeam("India");
        cricBuz.addTeam("Australia");
        cricBuz.addTeam("England");
        cricBuz.addTeam("South Africa");
        cricBuz.addTeam("New Zealand");
        cricBuz.addTeam("Pakistan");
        cricBuz.addTeam("Sri Lanka");
        cricBuz.addTeam("West Indies");
        cricBuz.getTeamDetails();
        int index = 0;
        String teamByIndex = cricBuz.getTeamByIndex(index);
        System.out.println("Team at index " + index + " is: " + teamByIndex);
        String teamName = "Pakistan";
        int teamIndex = cricBuz.getIndexByTeam(teamName);
        System.out.println("Index of " + teamName + " is: " + teamIndex);
    }
}
