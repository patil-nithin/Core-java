class LightExecuter {

    public static void main(String[] arg) {

        boolean ref = Light.onoroff();
        System.out.println("The Light is connected " + ref);

        int brightRef = Light.increaseBrightness();
        System.out.println("Light brightness is " + brightRef);
		
        brightRef = Light.decreaseBrightness();
        System.out.println("Light brightness is " + brightRef);
    }
}

