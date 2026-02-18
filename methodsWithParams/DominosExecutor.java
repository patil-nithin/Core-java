class DominosExecutor {

    public static void main(String[] args) {

        String FoodName = "Spicy Veg Pizza";

        double ref = Dominos.getFoodPrice(FoodName);

        System.out.println("The Price of the Food " + FoodName + " is : " + ref);
    }
}