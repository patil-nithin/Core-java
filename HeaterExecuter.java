class HeaterExecuter {

    public static void main(String[] arg) {

        boolean ref = Heater.onoroff();
        System.out.println("The Heater is connected " + ref);

        int tempRef = Heater.increaseTemp();
        System.out.println("Heater temperature is " + tempRef);
		
        tempRef = Heater.decreaseTemp();
        System.out.println("Heater temperature is " + tempRef);
    }
}

