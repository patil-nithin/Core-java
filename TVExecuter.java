class TVExecuter {

    public static void main(String[] arg) {

        boolean ref = TV.onoroff();
        System.out.println("The TV is connected " + ref);

        int volumeRef = TV.increaseVolume();
        System.out.println("TV volume is " + volumeRef);
		
        volumeRef = TV.decreaseVolume();
        System.out.println("TV volume is " + volumeRef);
    }
}
