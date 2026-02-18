class ACExecuter{

public static void main(String []args){

boolean ref=AC.onoroff();
System.out.println("AC running status:"+ref);

int tempref=AC.increaseTemp();
System.out.println("AC Temperature is:"+tempref);

 tempref=AC.decreaseTemp();
System.out.println("AC Temperature is:"+tempref);

}
}
