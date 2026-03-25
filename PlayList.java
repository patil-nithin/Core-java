public class PlayList {
    private String songNames[] = new String[15];
    int index;

    public boolean addSong(String song) {
        boolean isSong = false;
        if (song != null && !song.isEmpty()) {
            songNames[index] = song;
            index++;
            isSong = true;
        } else {
            System.out.println(song + " is invalid");
        }
        return isSong;
    }

    public void getSongs() {
        System.out.println(" PlayList Songs ");
        for (String song : songNames)
            System.out.println(song);
    }
}
