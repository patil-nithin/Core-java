class MixerExecuter {

    public static void main(String[] arg) {

        boolean ref = Mixer.onoroff();
        System.out.println("The Mixer is connected " + ref);

        int speedRef = Mixer.increaseSpeed();
        System.out.println("Mixer speed is " + speedRef);
		
        speedRef = Mixer.decreaseSpeed();
        System.out.println("Mixer speed is " + speedRef);
    }
}
