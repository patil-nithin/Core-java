
class BunRunner {

    public static void main(String[] args) {

        Bun bun1=new Bun();
        bun1.name="Sweet Bun";
        bun1.price=20;
        bun1.brand="Britannia";
        bun1.flavor="Sweet";
        bun1.weight=50;
        bun1.shape="Round";
        bun1.color="Brown";
        bun1.bakery="Iyengar Bakery";
        bun1.quantity=10;
        bun1.fresh=true;

        String[] ing1={"Flour","Sugar","Milk"};
        String[] out1={"Reliance","DMart","More"};

        bun1.ingredients=ing1;
        bun1.outlets=out1;

        System.out.println("The bun name is "+bun1.name+" and price is "+bun1.price);

        for(String ing:bun1.ingredients){
            System.out.println("Ingredient: "+ing);
        }

        for(String outlet:bun1.outlets){
            System.out.println("Available at: "+outlet);
        }
    }
}
