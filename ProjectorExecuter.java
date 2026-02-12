class ProjectorExecuter {

    public static void main(String[] arg) {

        boolean ref = Projector.onoroff();
        System.out.println("The Projector is connected " + ref);

        int brightRef = Projector.increaseBrightness();
        System.out.println("Projector brightness is " + brightRef);
		
        brightRef = Projector.decreaseBrightness();
        System.out.println("Projector brightness is " + brightRef);
    }
}

