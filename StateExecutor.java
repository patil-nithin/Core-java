public class StateExecutor {
    public static void main(String[] args) {
        State state = new State();
        state.addHighway("NH 44 - Srinagar to Kanyakumari");
        state.addHighway("NH 48 - Delhi to Chennai");
        state.addHighway("NH 19 - Delhi to Kolkata");
        state.addHighway("NH 27 - East West Corridor");
        state.addHighway("NH 16 - Kolkata to Chennai");
        state.addHighway("NH 52 - Pathankot to Silchar");
        state.addHighway("NH 30 - Sitapur to Ibrahimpur");
        state.addHighway("NH 66 - Panvel to Kanyakumari");
        state.addHighway("NH 75 - Gwalior to Jharkhand");
        state.getHighways();
    }
}
