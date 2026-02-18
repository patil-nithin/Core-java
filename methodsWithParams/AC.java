class AC{

static boolean isOn;
static int currentTemp = 24;
static int maxTemp = 30;
static int minTemp = 16;

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


static int increaseTemp(){
	if(isOn==true){
		System.out.println("proceed to increase the Temperature");
	
	if(currentTemp<maxTemp){
	currentTemp=currentTemp+1;
	System.out.println("Temperature incraesed to:"+currentTemp);
	}else{
	System.out.println("Maximum Temperature reached");}
    }else{
		System.out.println("Turn on AC first:");
	}
	return currentTemp;
}

static int decreaseTemp(){
	if(isOn==true){
		System.out.println("proceed to increase the Temperature");
	
	if(currentTemp>maxTemp){
	currentTemp=currentTemp-1;
	System.out.println("Temperature incraesed to:"+currentTemp);
	}else{
	System.out.println("Maximum Temperature reached");}
	}else{
		System.out.println("Turn on AC first:");
	}
	return currentTemp;
}
}
	
	 
