public class WonderlaExecutor {
    public static void main(String[] args) {
        Wonderla wonderla = new Wonderla();
        wonderla.addWaterGame("Wave Pool");
        wonderla.addWaterGame("Lazy River");
        wonderla.addWaterGame("Water Slide");
        wonderla.addWaterGame("Rain Disco");
        wonderla.addWaterGame("Splash Zone");
        wonderla.addWaterGame("Aqua Dance");
        wonderla.addWaterGame("Speed Slides");
        wonderla.addWaterGame("Tube Slides");
        wonderla.addWaterGame("Body Slides");
        wonderla.addWaterGame("Boomerang");
        wonderla.addWaterGame("Kids Pool");
        wonderla.addWaterGame("Tornado");
        wonderla.addWaterGame("Kamikaze");
        wonderla.addWaterGame("Space Bowl");
        wonderla.addWaterGame("Aqualoop");
        wonderla.addWaterGame("Flowrider");
        wonderla.addWaterGame("Aqua Trail");
        wonderla.addWaterGame("Cliff Jump");
        wonderla.addWaterGame("Rapid River");
        wonderla.addWaterGame("Super Flume");
        wonderla.getWaterGameDetails();
        int index = 5;
        String gameByIndex = wonderla.getWaterGameByIndex(index);
        System.out.println("Water game at index " + index + " is: " + gameByIndex);
        String gameName = "Boomerang";
        int gameIndex = wonderla.getIndexByWaterGame(gameName);
        System.out.println("Index of " + gameName + " is: " + gameIndex);
    }
}
