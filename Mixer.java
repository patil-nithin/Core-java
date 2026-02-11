class Mixer{

static boolean ison;

static boolean onoroff(){
if(ison==false){
   ison=true;
System.out.println("the Mixer is turned on...");
}else{
    ison=true;
System.out.println("the Mixer is turned Off..");
}
return ison;
}
}	