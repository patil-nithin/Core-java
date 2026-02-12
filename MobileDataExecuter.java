class MobileDataExecuter {

    public static void main(String[] arg) {

        boolean ref = MobileData.onoroff();
        System.out.println("Mobile Data is connected " + ref);

        int speedRef = MobileData.increaseSpeed();
        System.out.println("Mobile data speed is " + speedRef);
		
        speedRef = MobileData.decreaseSpeed();
        System.out.println("Mobile data speed is " + speedRef);
    }
}

