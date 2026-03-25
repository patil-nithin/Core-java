public class TelevisionExecutor {
    public static void main(String[] args) {
        Television television = new Television();
        television.addChannel("Star Plus");
        television.addChannel("Sony TV");
        television.addChannel("Zee TV");
        television.addChannel("Colors TV");
        television.addChannel("Sun TV");
        television.addChannel("Vijay TV");
        television.addChannel("DD National");
        television.addChannel("News18");
        television.addChannel("NDTV");
        television.addChannel("Aaj Tak");
        television.addChannel("Republic TV");
        television.addChannel("ESPN");
        television.addChannel("Star Sports");
        television.addChannel("Discovery");
        television.addChannel("National Geographic");
        television.addChannel("Cartoon Network");
        television.addChannel("Pogo");
        television.getChannels();
    }
}
