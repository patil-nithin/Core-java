
class OrderSystem{

static void sendToKitchen(String dishName){

System.out.println("Kitchen got order");
Kitchen.recieveOrder(dishName);
System.out.println("sent the order to table");


}




}
