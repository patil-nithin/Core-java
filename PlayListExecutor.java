public class PlayListExecutor {
    public static void main(String[] args) {
        PlayList playList = new PlayList();
        playList.addSong("Kesariya");
        playList.addSong("Tum Hi Ho");
        playList.addSong("Raataan Lambiyan");
        playList.addSong("Tera Ban Jaunga");
        playList.addSong("Channa Mereya");
        playList.addSong("Ae Dil Hai Mushkil");
        playList.addSong("Kalank");
        playList.addSong("Hawayein");
        playList.addSong("Ik Vaari Aa");
        playList.addSong("Shayad");
        playList.addSong("Bekhayali");
        playList.addSong("Tera Fitoor");
        playList.addSong("Meri Aashiqui");
        playList.addSong("Dilbaro");
        playList.addSong("Judaai");
        playList.getSongDetails();
        int index = 3;
        String songByIndex = playList.getSongByIndex(index);
        System.out.println("Song at index " + index + " is: " + songByIndex);
        String songName = "Hawayein";
        int songIndex = playList.getIndexBySong(songName);
        System.out.println("Index of " + songName + " is: " + songIndex);
    }
}
