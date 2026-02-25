class Light {
static boolean isConnected;
static boolean onOrOff(){
if(isConnected==false){
isConnected=true;
System.out.println("The Light is Turned on..");
}else{
isConnected=false;
System.out.println("The Light is Turned off..");
}
return isConnected;
}
}