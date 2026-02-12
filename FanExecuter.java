class FanExecuter{

public static void main(String [] args){

boolean ref=Fan.onoroff();
System.out.println("Fan is running status "+ref);

int volumeRef=Fan.increaseVolume();
System.out.println("Fan volume is "+ volumeRef);

volumeRef=Fan.decreaseVolume();
System.out.println("Fan is volume is "+ref);


}
}
