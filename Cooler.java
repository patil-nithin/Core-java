class Cooler{

static boolean isconnected;

static boolean onoroff(){
if(isconnected==false){
   isconnected=true;
System.out.println("the cooler is turned on..");
}
else{
    isconnected=false;
System.out.println("the cooler is turned off...");
}
return isconnected;
}
}	