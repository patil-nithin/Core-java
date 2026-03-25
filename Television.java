public class Television {
    private String channelNames[] = new String[17];
    int index;

    public boolean addChannel(String channel) {
        boolean isChannel = false;
        if (channel != null && !channel.isEmpty()) {
            channelNames[index] = channel;
            index++;
            isChannel = true;
        } else {
            System.out.println(channel + " is invalid");
        }
        return isChannel;
    }

    public void getChannels() {
        System.out.println(" Television Channels ");
        for (String channel : channelNames)
           System.out.println(channel);
    }
}
