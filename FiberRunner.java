
class FiberRunner {

    public static void main(String[] args) {

        Fiber f1 = new Fiber();
        f1.name = "Optic Fiber";
        f1.length = 100;
        String[] v1 = {"Cisco","Nokia","Huawei"};
        f1.vendors = v1;

        Fiber f2 = new Fiber();
        f2.name = "Glass Fiber";
        f2.length = 200;
        String[] v2 = {"Ericsson","Samsung","Intel"};
        f2.vendors = v2;

        Fiber f3 = new Fiber();
        f3.name = "Plastic Fiber";
        f3.length = 150;
        String[] v3 = {"Dell","HP","Lenovo"};
        f3.vendors = v3;

        Fiber f4 = new Fiber();
        f4.name = "Single Mode Fiber";
        f4.length = 300;
        String[] v4 = {"IBM","AMD","Qualcomm"};
        f4.vendors = v4;

        System.out.println("Fiber name is " + f1.name + " and its length is " + f1.length);
        for(String vendor : f1.vendors){
            System.out.println("Vendor supplying this fiber: " + vendor);
        }

        System.out.println("Fiber name is " + f2.name + " and its length is " + f2.length);
        for(String vendor : f2.vendors){
            System.out.println("Vendor supplying this fiber: " + vendor);
        }

        System.out.println("Fiber name is " + f3.name + " and its length is " + f3.length);
        for(String vendor : f3.vendors){
            System.out.println("Vendor supplying this fiber: " + vendor);
        }

        System.out.println("Fiber name is " + f4.name + " and its length is " + f4.length);
        for(String vendor : f4.vendors){
            System.out.println("Vendor supplying this fiber: " + vendor);
        }
    }
}
