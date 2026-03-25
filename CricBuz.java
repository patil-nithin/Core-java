public class CricBuz {
    private String teamNames[] = new String[8];
    int index;

    public boolean addTeam(String team) {
        boolean isTeam = false;
        if (team != null && !team.isEmpty()) {
            teamNames[index] = team;
            index++;
            isTeam = true;
        } else {
            System.out.println(team + " is invalid");
        }
        return isTeam;
    }

    public void getTeams() {
        System.out.println(" CricBuz Team Names ");
        for (String team : teamNames)
             System.out.println(team);
    }
}
