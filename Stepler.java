class Stepler {

    int id;
    String brand;
    String color;
	
	 public Stepler(){
	
	 }

   public Stepler(int id, String brand, String color) {
        this.id = id;
        this.brand = brand;
        this.color = color;
    }

    public void DisplaySteplerDetails() {

        System.out.println("The stepler id is : " + this.id);
        System.out.println("The stepler brand is : " + this.brand);
        System.out.println("The stepler color is : " + this.color);

    }
}