class EatSure {

    public static double getFoodPrice(String FoodName) {

        double price = 0.0;

        if (FoodName == "Mini Veg Thali") {
            price = 149;

        } else if (FoodName == "Deluxe Veg Thali") {
            price = 249;

        } else if (FoodName == "Mini Chicken Thali") {
            price = 199;

        } else if (FoodName == "Deluxe Chicken Thali") {
            price = 299;

        } else if (FoodName == "Paneer Roll") {
            price = 129;

        } else if (FoodName == "Chicken Roll") {
            price = 159;

        } else if (FoodName == "Veg Wrap") {
            price = 119;

        } else if (FoodName == "Chicken Wrap") {
            price = 169;

        } else if (FoodName == "Veg Burger") {
            price = 99;

        } else if (FoodName == "Chicken Burger") {
            price = 129;

        } else if (FoodName == "French Fries") {
            price = 79;

        } else if (FoodName == "Cheese Fries") {
            price = 109;

        } else if (FoodName == "Veg Sandwich") {
            price = 89;

        } else if (FoodName == "Chicken Sandwich") {
            price = 119;

        } else if (FoodName == "Grilled Sandwich") {
            price = 139;

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

        } else if (FoodName == "Dal Tadka") {
            price = 139;

        } else if (FoodName == "Jeera Rice") {
            price = 109;

        } else if (FoodName == "Tandoori Roti") {
            price = 20;

        } else if (FoodName == "Butter Naan") {
            price = 35;

        } else if (FoodName == "Garlic Naan") {
            price = 45;

        } else if (FoodName == "Veg Manchurian") {
            price = 169;

        } else if (FoodName == "Chicken Manchurian") {
            price = 219;

        } else if (FoodName == "Spring Roll Veg") {
            price = 119;

        } else if (FoodName == "Spring Roll Chicken") {
            price = 159;

        } else if (FoodName == "Chole Bhature") {
            price = 149;

        } else if (FoodName == "Rajma Chawal") {
            price = 139;

        } else if (FoodName == "Pav Bhaji") {
            price = 129;

        } else if (FoodName == "Vada Pav") {
            price = 39;

        } else if (FoodName == "Samosa") {
            price = 20;

        } else if (FoodName == "Kachori") {
            price = 25;

        } else if (FoodName == "Gulab Jamun") {
            price = 60;

        } else if (FoodName == "Rasgulla") {
            price = 65;

        } else if (FoodName == "Jalebi") {
            price = 70;

        } else if (FoodName == "Ice Cream Sundae") {
            price = 120;

        } else if (FoodName == "Chocolate Shake") {
            price = 119;

        } else if (FoodName == "Strawberry Shake") {
            price = 109;

        } else if (FoodName == "Cold Coffee") {
            price = 99;

        } else if (FoodName == "Hot Coffee") {
            price = 59;

        } else if (FoodName == "Masala Tea") {
            price = 39;

        } else if (FoodName == "Lemon Juice") {
            price = 49;

        } else if (FoodName == "Buttermilk") {
            price = 40;

        } else if (FoodName == "Fresh Lime Soda") {
            price = 60;

        } else if (FoodName == "Veg Combo Meal") {
            price = 179;

        } else if (FoodName == "Chicken Combo Meal") {
            price = 229;

        } else if (FoodName == "Paneer Biryani") {
            price = 199;

        } else if (FoodName == "Chicken Biryani") {
            price = 249;

        } else if (FoodName == "Mutton Biryani") {
            price = 299;

        } else if (FoodName == "Veg Pulao") {
            price = 159;

        } else {
            System.out.println("The Food Name is Not Found.");
        }

        return price;
    }
}