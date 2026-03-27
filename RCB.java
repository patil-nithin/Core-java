public class RCB {
    public String playerNames[] = new String[15];
    int index;

    public boolean addPlayer(String player) {
        boolean isAdded = false;
        if (index < playerNames.length) {
            if (player != null && !player.isEmpty()) {
                playerNames[index++] = player;
                isAdded = true;
            } else System.out.println(player + " is invalid");
        } else
            System.out.println("player index is full");
        return isAdded;
    }

    public void getPlayerDetails() {
        System.out.println("The players are : \n");
        for (String item : playerNames)
            if (item != null) System.out.println(item);
    }

    public String getPlayerByIndex(int index) {
        String player = null;
        if (index < playerNames.length)
            player = playerNames[index];
        else
            System.out.println("Invalid index value: " + index);
        return player;
    }

    public int getIndexByPlayer(String player) {
        int idx = 0;
        if (player != null) {
            for (String item : playerNames) {
                if (item != null && item.equals(player)) {
                    return idx;
                }
                idx++;
            }
        } else System.out.println("player name not found: " + player);
        return -1;
    }
}
