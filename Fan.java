class Fan{

static boolean ison;

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
}
	
	