class BrainRunner {
    public static void main(String[] args) {

        System.out.println("\n");

        Brain b1 = new Brain("Cognition and Control");
        System.out.println("1. The primary function of the brain is " + b1.primaryFunction + ".");

        Brain b2 = new Brain(true);
        System.out.println("2. Is the neurological scan indicating the brain is healthy? " + b2.isHealthy + ".");

        Brain b3 = new Brain(86);
        System.out.println("3. The human brain contains approximately " + b3.neuronCountBillions + " billion neurons.");

        Brain b4 = new Brain(1.4);
        System.out.println("4. The average weight of the adult human brain is " + b4.weightKg + " kilograms.");

        Brain b5 = new Brain(1260.5f);
        System.out.println("5. The brain occupies a volume of approximately " + b5.volumeCc + " cubic centimeters.");

        Brain b6 = new Brain(100000000000000L);
        System.out.println("6. The complex network relies on " + b6.synapseCountTrillions + " neural synapses.");

        Brain b7 = new Brain((short)750);
        System.out.println("7. The cerebral blood flow operates at roughly " + b7.bloodFlowMlPerMin + " milliliters per minute.");

        Brain b8 = new Brain((byte)4);
        System.out.println("8. The brain's cerebral cortex is divided into " + b8.lobeCount + " main lobes.");

        Brain b9 = new Brain('L');
        System.out.println("9. This specific neural activity was isolated in the '" + b9.hemisphere + "' hemisphere.");

        Brain b10 = new Brain("Motor Control", "Right");
        System.out.println("10. Its primary function focuses on " + b10.primaryFunction + " and is governed by the " + b10.dominantSide + " side.");

        Brain b11 = new Brain(86, 130);
        System.out.println("11. With " + b11.neuronCountBillions + " billion neurons active, the tested IQ score is " + b11.iqScore + ".");

        Brain b12 = new Brain(false, true);
        System.out.println("12. Is the brain perfectly healthy? " + b12.isHealthy + ". Has a concussion been detected? " + b12.hasConcussion + ".");
    }
}