class UberEats {

    public static double getFoodPrice(String FoodName) {

        double price = 0.0;

        if (FoodName == "Grilled Sandwich") {
            price = 149;

        } else if (FoodName == "Club Sandwich") {
            price = 179;

        } else if (FoodName == "Veg Burger") {
            price = 99;

        } else if (FoodName == "Chicken Burger") {
            price = 129;

        } else if (FoodName == "Double Patty Burger") {
            price = 169;

        } else if (FoodName == "Veg Pizza Slice") {
            price = 99;

        } else if (FoodName == "Chicken Pizza Slice") {
            price = 129;

        } else if (FoodName == "Pepperoni Pizza Slice") {
            price = 149;

        } else if (FoodName == "French Fries") {
            price = 79;

        } else if (FoodName == "Peri Peri Fries") {
            price = 99;

        } else if (FoodName == "Cheese Fries") {
            price = 109;

        } else if (FoodName == "Veg Wrap") {
            price = 119;

        } else if (FoodName == "Chicken Wrap") {
            price = 159;

        } else if (FoodName == "Veg Noodles") {
            price = 149;

        } else if (FoodName == "Chicken Noodles") {
            price = 189;

        } else if (FoodName == "Veg Fried Rice") {
            price = 159;

        } else if (FoodName == "Chicken Fried Rice") {
            price = 199;

        } else if (FoodName == "Paneer Butter Masala") {
            price = 209;

        } else if (FoodName == "Butter Chicken") {
            price = 259;

        } else if (FoodName == "Tandoori Chicken") {
            price = 299;

        } else if (FoodName == "Veg Manchurian") {
            price = 169;

        } else if (FoodName == "Chicken Manchurian") {
            price = 219;

        } else if (FoodName == "Spring Roll Veg") {
            price = 119;

        } else if (FoodName == "Spring Roll Chicken") {
            price = 159;

        } else if (FoodName == "Chocolate Cake") {
            price = 99;

        } else if (FoodName == "Brownie") {
            price = 79;

        } else if (FoodName == "Cupcake") {
            price = 69;

        } else if (FoodName == "Donut") {
            price = 59;

        } else if (FoodName == "Ice Cream Cup") {
            price = 49;

        } else if (FoodName == "Milkshake") {
            price = 109;

        } else if (FoodName == "Cold Coffee") {
            price = 99;

        } else if (FoodName == "Hot Coffee") {
            price = 59;

        } else if (FoodName == "Tea") {
            price = 30;

        } else if (FoodName == "Lemon Juice") {
            price = 49;

        } else if (FoodName == "Fresh Orange Juice") {
            price = 80;

        } else if (FoodName == "Veg Thali") {
            price = 169;

        } else if (FoodName == "Chicken Thali") {
            price = 249;

        } else if (FoodName == "Paneer Biryani") {
            price = 199;

        } else if (FoodName == "Chicken Biryani") {
            price = 249;

        } else if (FoodName == "Mutton Biryani") {
            price = 299;

        } else if (FoodName == "Chapati") {
            price = 15;

        } else if (FoodName == "Butter Naan") {
            price = 35;

        } else if (FoodName == "Garlic Naan") {
            price = 45;

        } else if (FoodName == "Jeera Rice") {
            price = 109;

        } else if (FoodName == "Dal Fry") {
            price = 139;

        } else if (FoodName == "Paneer Curry") {
            price = 209;

        } else if (FoodName == "Chicken Curry") {
            price = 259;

        } else if (FoodName == "Veg Combo") {
            price = 179;

        } else if (FoodName == "Non Veg Combo") {
            price = 229;

        } else if (FoodName == "Samosa") {
            price = 20;

        } else if (FoodName == "Kachori") {
            price = 25;

        } else if (FoodName == "Pani Puri") {
            price = 40;

        } else if (FoodName == "Bhel Puri") {
            price = 50;

        } else {
            System.out.println("The Food Name is Not Found.");
        }

        return price;
    }
}
