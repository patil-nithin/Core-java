
class HappyDentRunner {
public static void main(String[] args) {

        HappyDent h1=new HappyDent();

        h1.brand="HappyDent";
        h1.flavor="Mint";
        h1.price=10;
        h1.quantity=5;
        h1.sugarFree=true;
        h1.color="White";

        String[] ing={"Mint","Sweetener","Flavor"};
        String[] out={"Reliance","DMart","More"};

        h1.ingredients=ing;
        h1.outlets=out;

        System.out.println("Chewing gum brand is "+h1.brand+" and flavor is "+h1.flavor);

        for(String item:h1.ingredients){
            System.out.println("Ingredient: "+item);
        }

        for(String outlet:h1.outlets){
            System.out.println("Available at: "+outlet);
        }
    }
}
