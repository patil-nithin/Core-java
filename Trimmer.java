class Trimmer{
static boolean isConnected;
static boolean onOrOff(){
if(isConnected==false){
isConnected=true;
System.out.println("The Trimmer is Turned on");
}else{
isConnected=false;
System.out.println("The Trimmer is Turned Off");
}
return isConnected;
}
} 