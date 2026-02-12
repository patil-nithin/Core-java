class CoolerExecuter {

    public static void main(String[] arg) {

        boolean ref = Cooler.onoroff();
        System.out.println("The Cooler is connected " + ref);

        int speedRef = Cooler.increaseSpeed();
        System.out.println("Cooler speed is " + speedRef);
		
        speedRef = Cooler.decreaseSpeed();
        System.out.println("Cooler speed is " + speedRef);
    }
}
