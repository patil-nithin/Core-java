class Zomato{

 public static double search(String foodName){
	 
	 double price=0.0;
	 
	 if(foodName=="Burger"){
		 price=99.00;
		 return price;
	 }else if(foodName=="Benne Dosa"){
		   price=80;
		  return price;
     }else if(foodName=="Pizza"){
            price=150;
            return price;
     }else if(foodName=="rice Dal"){
             price=45;
             return price;
	 }else if(foodName=="Egg Rice"){
             price=55;
             return price;
	 }else if(foodName=="Masala Dosa"){
             price=95;
             return price;
	 }else if(foodName=="Single vada"){
             price=15;
             return price;
	 }else if(foodName=="upma"){
             price=35;
             return price;
	 }else if(foodName=="Rava Dosa"){
             price=25;
             return price;
	 }else if(foodName=="kababa"){
             price=65;
             return price;
	 }
	 else{
    System.out.println("No Food Name is Found");
     }	
    return price;
 }






}