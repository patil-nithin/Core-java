public class RCB {
    private String playerNames[] = new String[15];
    int index;

    public boolean addPlayer(String player) {
        boolean isPlayer = false;
        if (player != null && !player.isEmpty()) {
            playerNames[index] = player;
            index++;
            isPlayer = true;
        } else {
            System.out.println(player + " is invalid");
        }
        return isPlayer;
    }

    public void getPlayers() {
        System.out.println(" RCB Player Names ");
        for (String player : playerNames)
            System.out.println(player);
    }
}
