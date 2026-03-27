public class RCBExecutor {
    public static void main(String[] args) {
        RCB rcb = new RCB();
        rcb.addPlayer("Virat Kohli");
        rcb.addPlayer("Faf du Plessis");
        rcb.addPlayer("Glenn Maxwell");
        rcb.addPlayer("Mohammed Siraj");
        rcb.addPlayer("Dinesh Karthik");
        rcb.addPlayer("Harshal Patel");
        rcb.addPlayer("Wanindu Hasaranga");
        rcb.addPlayer("Josh Hazlewood");
        rcb.addPlayer("Rajat Patidar");
        rcb.addPlayer("Anuj Rawat");
        rcb.addPlayer("Shahbaz Ahmed");
        rcb.addPlayer("David Willey");
        rcb.addPlayer("Reece Topley");
        rcb.addPlayer("Suyash Prabhudessai");
        rcb.addPlayer("Karn Sharma");
        rcb.getPlayerDetails();
        int index = 0;
        String playerByIndex = rcb.getPlayerByIndex(index);
        System.out.println("Player at index " + index + " is: " + playerByIndex);
        String playerName = "Glenn Maxwell";
        int playerIndex = rcb.getIndexByPlayer(playerName);
        System.out.println("Index of " + playerName + " is: " + playerIndex);
    }
}
