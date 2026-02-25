class Swiggy {

    public static double getFoodPrice(String FoodName) {

        double price = 0.0;

        if (FoodName == "Masala Dosa") {
            price = 90;

        } else if (FoodName == "Rava Dosa") {
            price = 110;

        } else if (FoodName == "Plain Dosa") {
            price = 70;

        } else if (FoodName == "Idli Vada Combo") {
            price = 85;

        } else if (FoodName == "Poori Sagu") {
            price = 95;

        } else if (FoodName == "Bisibele Bath") {
            price = 120;

        } else if (FoodName == "Puliyogare") {
            price = 100;

        } else if (FoodName == "Curd Rice") {
            price = 80;

        } else if (FoodName == "Tomato Rice") {
            price = 90;

        } else if (FoodName == "Veg Biryani") {
            price = 150;

        } else if (FoodName == "Chicken Biryani") {
            price = 220;

        } else if (FoodName == "Mutton Biryani") {
            price = 280;

        } else if (FoodName == "Paneer Butter Masala") {
            price = 190;

        } else if (FoodName == "Butter Chicken") {
            price = 250;

        } else if (FoodName == "Palak Paneer") {
            price = 180;

        } else if (FoodName == "Chole Bhature") {
            price = 140;

        } else if (FoodName == "Rajma Chawal") {
            price = 130;

        } else if (FoodName == "Dal Tadka") {
            price = 120;

        } else if (FoodName == "Jeera Rice") {
            price = 100;

        } else if (FoodName == "Tandoori Roti") {
            price = 25;

        } else if (FoodName == "Butter Naan") {
            price = 35;

        } else if (FoodName == "Garlic Naan") {
            price = 45;

        } else if (FoodName == "Veg Fried Rice") {
            price = 140;

        } else if (FoodName == "Chicken Fried Rice") {
            price = 190;

        } else if (FoodName == "Veg Manchurian") {
            price = 160;

        } else if (FoodName == "Gobi Manchurian") {
            price = 150;

        } else if (FoodName == "Chicken Manchurian") {
            price = 210;

        } else if (FoodName == "Hakka Noodles") {
            price = 130;

        } else if (FoodName == "Schezwan Noodles") {
            price = 150;

        } else if (FoodName == "Egg Noodles") {
            price = 160;

        } else if (FoodName == "Veg Spring Roll") {
            price = 120;

        } else if (FoodName == "Chicken Spring Roll") {
            price = 170;

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
            price = 30;

        } else if (FoodName == "Pav Bhaji") {
            price = 110;

        } else if (FoodName == "Misal Pav") {
            price = 100;

        } else if (FoodName == "Upma") {
            price = 70;

        } else if (FoodName == "Kesari Bath") {
            price = 80;

        } else if (FoodName == "Gulab Jamun") {
            price = 60;

        } else if (FoodName == "Rasgulla") {
            price = 65;

        } else if (FoodName == "Jalebi") {
            price = 70;

        } else if (FoodName == "Kaju Katli") {
            price = 90;

        } else if (FoodName == "Ice Cream Sundae") {
            price = 120;

        } else if (FoodName == "Falooda") {
            price = 140;

        } else if (FoodName == "Lassi") {
            price = 60;

        } else if (FoodName == "Buttermilk") {
            price = 40;

        } else if (FoodName == "Filter Coffee") {
            price = 30;

        } else if (FoodName == "Masala Tea") {
            price = 25;

        } else if (FoodName == "Cold Coffee") {
            price = 90;

        } else if (FoodName == "Fresh Orange Juice") {
            price = 80;

        } else if (FoodName == "Mango Milkshake") {
            price = 110;

        } else {
            System.out.println("The Food Name is Not Found.");
        }

        return price;
    }
}
