class SpeakerExecuter {

    public static void main(String[] arg) {

        boolean ref = Speaker.onoroff();
        System.out.println("The Speaker is connected " + ref);

        int volumeRef = Speaker.increaseVolume();
        System.out.println("Speaker volume is " + volumeRef);
		
		  volumeRef = Speaker.decreaseVolume();
        System.out.println("Speaker volume is " + volumeRef);
    }
}





