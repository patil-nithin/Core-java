public class PlayList {
    public String songNames[] = new String[15];
    int index;

    public boolean addSong(String song) {
        boolean isAdded = false;
        if (index < songNames.length) {
            if (song != null && !song.isEmpty()) {
                songNames[index++] = song;
                isAdded = true;
            } else System.out.println(song + " is invalid");
        } else
            System.out.println("song index is full");
        return isAdded;
    }

    public void getSongDetails() {
        System.out.println("The songs are : \n");
        for (String item : songNames)
            if (item != null) System.out.println(item);
    }

    public String getSongByIndex(int index) {
        String song = null;
        if (index < songNames.length)
            song = songNames[index];
        else
            System.out.println("Invalid index value: " + index);
        return song;
    }

    public int getIndexBySong(String song) {
        int idx = 0;
        if (song != null) {
            for (String item : songNames) {
                if (item != null && item.equals(song)) {
                    return idx;
                }
                idx++;
            }
        } else System.out.println("song name not found: " + song);
        return -1;
    }
}
