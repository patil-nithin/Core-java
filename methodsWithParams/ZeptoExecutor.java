class ZeptoExecutor {

    public static void main(String[] args) {

        String FoodName = "Energy Bars";

        double ref = Zepto.getFoodPrice(FoodName);

        System.out.println("The Price of the Food " + FoodName + " is : " + ref);
    }
}