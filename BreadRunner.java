
class BreadRunner {

    public static void main(String[] args) {

        Bread b1=new Bread();
        b1.type="Wheat Bread";
        b1.shape="Rectangle";
        String[] o1={"Reliance","DMart","More"};
        String[] i1={"Flour","Salt","Water"};
        b1.outletNames=o1;
        b1.ingredients=i1;

        Bread b2=new Bread();
        b2.type="Brown Bread";
        b2.shape="Square";
        String[] o2={"Reliance","Spencer","More"};
        String[] i2={"Flour","Yeast","Salt"};
        b2.outletNames=o2;
        b2.ingredients=i2;

        System.out.println("Bread type is "+b1.type+" and shape is "+b1.shape);
        for(String outlet:b1.outletNames){
            System.out.println("Available outlet: "+outlet);
        }

        for(String ing:b1.ingredients){
            System.out.println("Ingredient: "+ing);
        }

        System.out.println("Bread type is "+b2.type+" and shape is "+b2.shape);
        for(String outlet:b2.outletNames){
            System.out.println("Available outlet: "+outlet);
        }

        for(String ing:b2.ingredients){
            System.out.println("Ingredient: "+ing);
        }
    }
}
