
class Waiter{

static void takeOrder(String dishName){

System.out.println("Took Order");
OrderSystem.sendToKitchen(dishName);
System.out.println("Served");


}




}
