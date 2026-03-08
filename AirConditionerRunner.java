
class AirConditionerRunner {

    public static void main(String[] args) {

        AirConditioner ac1=new AirConditioner();
        ac1.brand="LG";
        ac1.model="DualCool";
        ac1.price=45000;
        ac1.type="Split";
        ac1.weight=30;
        ac1.warranty=5;
        ac1.working=true;
        String[] c1={"White","Silver","Grey"};
        ac1.colors=c1;

        AirConditioner ac2=new AirConditioner();
        ac2.brand="Samsung";
        ac2.model="WindFree";
        ac2.price=48000;
        ac2.type="Split";
        ac2.weight=32;
        ac2.warranty=4;
        ac2.working=true;
        String[] c2={"White","Black","Blue"};
        ac2.colors=c2;

        System.out.println("AC brand is "+ac1.brand+" model is "+ac1.model);
        for(String color:ac1.colors){
            System.out.println("Available color: "+color);
        }

        System.out.println("AC brand is "+ac2.brand+" model is "+ac2.model);
        for(String color:ac2.colors){
            System.out.println("Available color: "+color);
        }
    }
}
