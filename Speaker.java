class Speaker{

static boolean isConnected;

   static boolean onoroff(){
   if(isConnected==false){
      isConnected=true;
	  System.out.println("the Speaker is turned on...");
	  }else if(isConnected==true){
	          isConnected=false;
	  System.out.println("the Speaker is turned off...");
}
return isConnected;
}
}
	  