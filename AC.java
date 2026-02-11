class AC{

static boolean isOn;

static boolean onoroff(){
 if(isOn==false){
     isOn=true;
 System.out.println("AC is turned ON....");
} else{
      isOn=false; 
 System.out.println("AC is turned OFF....");
}
return isOn;
}
} 
	 
