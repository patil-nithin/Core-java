public class Wonderla {
    private String waterGames[] = new String[20];
    int index;

    public boolean addWaterGame(String game) {
        boolean isGame = false;
        if (game != null && !game.isEmpty()) {
            waterGames[index] = game;
            index++;
            isGame = true;
        } else {
            System.out.println(game + " is invalid");
        }
        return isGame;
    }

    public void getWaterGames() {
        System.out.println(" Wonderla Water Games ");
        for (String game : waterGames)
            System.out.println(game);
    }
}
