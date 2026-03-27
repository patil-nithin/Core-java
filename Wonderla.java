public class Wonderla {
    public String waterGames[] = new String[20];
    int index;

    public boolean addWaterGame(String waterGame) {
        boolean isAdded = false;
        if (index < waterGames.length) {
            if (waterGame != null && !waterGame.isEmpty()) {
                waterGames[index++] = waterGame;
                isAdded = true;
            } else System.out.println(waterGame + " is invalid");
        } else
            System.out.println("waterGame index is full");
        return isAdded;
    }

    public void getWaterGameDetails() {
        System.out.println("The waterGames are : \n");
        for (String item : waterGames)
            if (item != null) System.out.println(item);
    }

    public String getWaterGameByIndex(int index) {
        String waterGame = null;
        if (index < waterGames.length)
            waterGame = waterGames[index];
        else
            System.out.println("Invalid index value: " + index);
        return waterGame;
    }

    public int getIndexByWaterGame(String waterGame) {
        int idx = 0;
        if (waterGame != null) {
            for (String item : waterGames) {
                if (item != null && item.equals(waterGame)) {
                    return idx;
                }
                idx++;
            }
        } else System.out.println("waterGame name not found: " + waterGame);
        return -1;
    }
}
