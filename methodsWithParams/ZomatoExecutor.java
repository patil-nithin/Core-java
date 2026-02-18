class ZomatoExecutor{

public static void main(String [] args){

    String foodName="Burger";
	double ref= Zomato.search( foodName);
	System.out.println("the price of " +foodName  + " is :"+ ref);
	}
	} 