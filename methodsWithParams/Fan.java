class Fan{

static boolean ison;
 static int currentVolume=10;
 static int maxVolume=30;
 static int minVolume=5;

static boolean onoroff(){
if (ison==false){
    ison=true;
System.out.println("the Fan is turned on...");
}
else{
    ison=false;
System.out.println("the Fan is turned off....");
}
return ison;
}


static int increaseVolume(){
	if(ison==true){
	if(currentVolume<maxVolume){
		currentVolume=currentVolume+1;
		System.out.println("increase the Volume:"+currentVolume);
	}else{
		System.out.println("maximum volume is reached:");
	}
	}else{
		System.out.println("turn on Fan first...");
	}
	return currentVolume;
}
static int decreaseVolume(){
	if(ison==true){
	if(currentVolume<maxVolume){
		currentVolume=currentVolume-1;
		System.out.println("increase the Volume:"+currentVolume);
	}else{
		System.out.println("maximum volume is reached:");
	}
	}else{
		System.out.println("turn on Fan first...");
	}
	return currentVolume;
}
}
	
	