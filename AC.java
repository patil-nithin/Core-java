class AC{
static boolean isConnected;
static boolean onOrOff(){
if(isConnected==false){
isConnected=true;
System.out.println("The Ac is Turned on..");
}else{
System.out.println("The Ac is Turned Off..);
}
return isConnected;
}
}
