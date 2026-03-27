public class CricBuz {
    public String teamNames[] = new String[8];
    int index;

    public boolean addTeam(String team) {
        boolean isAdded = false;
        if (index < teamNames.length) {
            if (team != null && !team.isEmpty()) {
                teamNames[index++] = team;
                isAdded = true;
            } else System.out.println(team + " is invalid");
        } else
            System.out.println("team index is full");
        return isAdded;
    }

    public void getTeamDetails() {
        System.out.println("The teams are : \n");
        for (String item : teamNames)
            if (item != null) System.out.println(item);
    }

    public String getTeamByIndex(int index) {
        String team = null;
        if (index < teamNames.length)
            team = teamNames[index];
        else
            System.out.println("Invalid index value: " + index);
        return team;
    }

    public int getIndexByTeam(String team) {
        int idx = 0;
        if (team != null) {
            for (String item : teamNames) {
                if (item != null && item.equals(team)) {
                    return idx;
                }
                idx++;
            }
        } else System.out.println("team name not found: " + team);
        return -1;
    }
}
