class FoodPandaExecutor {

    public static void main(String[] args) {

        String FoodName = "Pav Bhaji";

        double ref = FoodPanda.getFoodPrice(FoodName);

        System.out.println("The Price of the Food " + FoodName + " is : " + ref);
    }
}