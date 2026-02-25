class RefrigeratorExecutor {

    public static void main(String[] args) {

        boolean on = Refrigerator.switchPower();
        System.out.println("The Refrigerator is currently turned On : " + on);

        Refrigerator.increaseCoolingLevel();
        Refrigerator.increaseCoolingLevel();
        Refrigerator.increaseCoolingLevel();
        Refrigerator.increaseCoolingLevel();
        Refrigerator.increaseCoolingLevel();

        Refrigerator.decreaseCoolingLevel();
        Refrigerator.decreaseCoolingLevel();
        Refrigerator.decreaseCoolingLevel();
        Refrigerator.decreaseCoolingLevel();
        Refrigerator.decreaseCoolingLevel();

        boolean off = Refrigerator.switchPower();
        System.out.println("The Refrigerator is currently turned On : " + off);
    }
}
