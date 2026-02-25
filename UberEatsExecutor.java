class UberEatsExecutor {

    public static void main(String[] args) {

        String FoodName = "Brownie";

        double ref = UberEats.getFoodPrice(FoodName);

        System.out.println("The Price of the Food " + FoodName + " is : " + ref);
    }
}