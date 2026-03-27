public class Television {
    public String channelNames[] = new String[17];
    int index;

    public boolean addChannel(String channel) {
        boolean isAdded = false;
        if (index < channelNames.length) {
            if (channel != null && !channel.isEmpty()) {
                channelNames[index++] = channel;
                isAdded = true;
            } else System.out.println(channel + " is invalid");
        } else
            System.out.println("channel index is full");
        return isAdded;
    }

    public void getChannelDetails() {
        System.out.println("The channels are : \n");
        for (String item : channelNames)
            if (item != null) System.out.println(item);
    }

    public String getChannelByIndex(int index) {
        String channel = null;
        if (index < channelNames.length)
            channel = channelNames[index];
        else
            System.out.println("Invalid index value: " + index);
        return channel;
    }

    public int getIndexByChannel(String channel) {
        int idx = 0;
        if (channel != null) {
            for (String item : channelNames) {
                if (item != null && item.equals(channel)) {
                    return idx;
                }
                idx++;
            }
        } else System.out.println("channel name not found: " + channel);
        return -1;
    }
}
