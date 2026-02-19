class FoodPanda {

    public static double getFoodPrice(String FoodName) {

        double price = 0.0;

        if (FoodName == "Veg Pulao") {
            price = 149;

        } else if (FoodName == "Chicken Pulao") {
            price = 199;

        } else if (FoodName == "Mutton Curry") {
            price = 289;

        } else if (FoodName == "Fish Curry") {
            price = 259;

        } else if (FoodName == "Egg Curry") {
            price = 179;

        } else if (FoodName == "Veg Thali") {
            price = 169;

        } else if (FoodName == "Chicken Thali") {
            price = 249;

        } else if (FoodName == "Chapati") {
            price = 15;

        } else if (FoodName == "Butter Roti") {
            price = 20;

        } else if (FoodName == "Plain Rice") {
            price = 89;

        } else if (FoodName == "Curd Rice") {
            price = 99;

        } else if (FoodName == "Dal Fry") {
            price = 139;

        } else if (FoodName == "Paneer Curry") {
            price = 209;

        } else if (FoodName == "Chicken Curry") {
            price = 259;

        } else if (FoodName == "Tandoori Chicken") {
            price = 299;

        } else if (FoodName == "Veg Fried Rice") {
            price = 159;

        } else if (FoodName == "Chicken Fried Rice") {
            price = 199;

        } else if (FoodName == "Veg Noodles") {
            price = 149;

        } else if (FoodName == "Chicken Noodles") {
            price = 189;

        } else if (FoodName == "Veg Manchurian") {
            price = 169;

        } else if (FoodName == "Chicken Manchurian") {
            price = 219;

        } else if (FoodName == "Spring Roll Veg") {
            price = 119;

        } else if (FoodName == "Spring Roll Chicken") {
            price = 159;

        } else if (FoodName == "Burger Veg") {
            price = 99;

        } else if (FoodName == "Burger Chicken") {
            price = 129;

        } else if (FoodName == "French Fries") {
            price = 79;

        } else if (FoodName == "Cheese Fries") {
            price = 109;

        } else if (FoodName == "Veg Pizza") {
            price = 199;

        } else if (FoodName == "Chicken Pizza") {
            price = 249;

        } else if (FoodName == "Paneer Pizza") {
            price = 229;

        } else if (FoodName == "Chocolate Cake") {
            price = 99;

        } else if (FoodName == "Vanilla Cake") {
            price = 89;

        } else if (FoodName == "Brownie") {
            price = 79;

        } else if (FoodName == "Ice Cream Cup") {
            price = 49;

        } else if (FoodName == "Ice Cream Family Pack") {
            price = 229;

        } else if (FoodName == "Cold Coffee") {
            price = 99;

        } else if (FoodName == "Hot Coffee") {
            price = 59;

        } else if (FoodName == "Tea") {
            price = 30;

        } else if (FoodName == "Lassi") {
            price = 60;

        } else if (FoodName == "Buttermilk") {
            price = 40;

        } else if (FoodName == "Fresh Juice") {
            price = 80;

        } else if (FoodName == "Milkshake") {
            price = 109;

        } else if (FoodName == "Samosa") {
            price = 20;

        } else if (FoodName == "Kachori") {
            price = 25;

        } else if (FoodName == "Pani Puri") {
            price = 40;

        } else if (FoodName == "Bhel Puri") {
            price = 50;

        } else if (FoodName == "Sev Puri") {
            price = 55;

        } else if (FoodName == "Vada Pav") {
            price = 35;

        } else if (FoodName == "Pav Bhaji") {
            price = 129;

        } else if (FoodName == "Misal Pav") {
            price = 119;

        } else if (FoodName == "Paneer Biryani") {
            price = 199;

        } else if (FoodName == "Chicken Biryani") {
            price = 249;

        } else if (FoodName == "Mutton Biryani") {
            price = 299;

        } else if (FoodName == "Veg Combo") {
            price = 179;

        } else if (FoodName == "Non Veg Combo") {
            price = 229;

        } else {
            System.out.println("The Food Name is Not Found.");
        }

        return price;
    }
}
