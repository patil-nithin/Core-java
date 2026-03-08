
class PenDriveRunner {

    public static void main(String[] args) {

        PenDrive p1=new PenDrive();

        p1.brand="Sandisk";
        p1.capacity=64;
        p1.price=700;
        p1.type="USB 3.0";
        p1.working=true;

        String[] c={"Black","Red","Blue"};
        String[] v={"Amazon","Flipkart","Reliance"};
        String[] d={"Laptop","TV","Mobile"};

        p1.colors=c;
        p1.vendors=v;
        p1.devices=d;

        System.out.println("PenDrive brand is "+p1.brand+" and capacity is "+p1.capacity+"GB");

        for(String color:p1.colors){
            System.out.println("Color available: "+color);
        }

        for(String vendor:p1.vendors){
            System.out.println("Vendor selling it: "+vendor);
        }
    }
}
