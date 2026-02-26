class forever24ClothExecutor {

    public static void main(String[] args) {

        boolean isCloth1  = forever24Cloth.getClothDetails("Forever24","T-Shirt","Men","Cotton","Black","M","Regular","Solid","Summer",999,true,true);
        boolean isCloth2  = forever24Cloth.getClothDetails("Forever24","Jeans","Men","Denim","Blue","32","Slim","Solid","All",1999,true,true);
        boolean isCloth3  = forever24Cloth.getClothDetails("Forever24","Dress","Women","Polyester","Red","S","Regular","Printed","Summer",2499,true,true);
        boolean isCloth4  = forever24Cloth.getClothDetails("Forever24","Top","Women","Cotton","White","M","Regular","Solid","Summer",1299,true,true);
        boolean isCloth5  = forever24Cloth.getClothDetails("Forever24","Shirt","Men","Cotton","Blue","L","Slim","Checks","All",1599,true,true);
        boolean isCloth6  = forever24Cloth.getClothDetails("Forever24","Kurti","Women","Rayon","Green","M","Regular","Printed","All",1799,true,true);
        boolean isCloth7  = forever24Cloth.getClothDetails("Forever24","Jacket","Men","Leather","Brown","L","Regular","Solid","Winter",3999,true,true);
        boolean isCloth8  = forever24Cloth.getClothDetails("Forever24","Hoodie","Unisex","Fleece","Grey","XL","Loose","Solid","Winter",2299,true,true);
        boolean isCloth9  = forever24Cloth.getClothDetails("Forever24","Skirt","Women","Cotton","Pink","M","Regular","Floral","Summer",1499,true,true);
        boolean isCloth10 = forever24Cloth.getClothDetails("Forever24","Shorts","Men","Cotton","Black","M","Regular","Solid","Summer",899,true,true);
        boolean isCloth11 = forever24Cloth.getClothDetails("Forever24","Sweater","Men","Wool","Navy","L","Regular","Solid","Winter",2599,true,true);
        boolean isCloth12 = forever24Cloth.getClothDetails("Forever24","Blazer","Women","Polyester","Beige","M","Slim","Solid","All",3499,true,true);
        boolean isCloth13 = forever24Cloth.getClothDetails("Forever24","Track Pant","Men","Polyester","Black","L","Regular","Solid","All",1299,true,true);
        boolean isCloth14 = forever24Cloth.getClothDetails("Forever24","Saree","Women","Silk","Maroon","Free","Regular","Traditional","Festive",5999,true,true);
        boolean isCloth15 = forever24Cloth.getClothDetails("Forever24","Kurta","Men","Cotton","White","M","Regular","Solid","Festive",1999,true,true);
        boolean isCloth16 = forever24Cloth.getClothDetails("","Shirt","Men","Cotton","Blue","L","Slim","Solid","All",1499,true,true);
        boolean isCloth17 = forever24Cloth.getClothDetails("Forever24","","Men","Cotton","Blue","L","Slim","Solid","All",1499,true,true);
        boolean isCloth18 = forever24Cloth.getClothDetails("Forever24","Shirt","","Cotton","Blue","L","Slim","Solid","All",1499,true,true);
        boolean isCloth19 = forever24Cloth.getClothDetails("Forever24","Shirt","Men","","Blue","L","Slim","Solid","All",1499,true,true);
        boolean isCloth20 = forever24Cloth.getClothDetails("Forever24","Shirt","Men","Cotton","","L","Slim","Solid","All",1499,true,true);
        boolean isCloth21 = forever24Cloth.getClothDetails("Forever24","Shirt","Men","Cotton","Blue","","Slim","Solid","All",1499,true,true);
        boolean isCloth22 = forever24Cloth.getClothDetails("Forever24","Shirt","Men","Cotton","Blue","L","","Solid","All",1499,true,true);
        boolean isCloth23 = forever24Cloth.getClothDetails("Forever24","Shirt","Men","Cotton","Blue","L","Slim","","All",1499,true,true);
        boolean isCloth24 = forever24Cloth.getClothDetails("Forever24","Shirt","Men","Cotton","Blue","L","Slim","Solid","",1499,true,true);
        boolean isCloth25 = forever24Cloth.getClothDetails("Forever24","Shirt","Men","Cotton","Blue","L","Slim","Solid","All",-100,true,true);
        boolean isCloth26 = forever24Cloth.getClothDetails("Forever24","Shirt","Men","Cotton","Blue","L","Slim","Solid","All",1499,false,true);
        boolean isCloth27 = forever24Cloth.getClothDetails("Forever24","Shirt","Men","Cotton","Blue","L","Slim","Solid","All",1499,true,false);
        boolean isCloth28 = forever24Cloth.getClothDetails("Forever24","Dress","Women","Georgette","Yellow","S","Regular","Printed","Summer",2799,true,true);
        boolean isCloth29 = forever24Cloth.getClothDetails("Forever24","Top","Women","Cotton","Lavender","M","Regular","Solid","Summer",1199,true,true);
        boolean isCloth30 = forever24Cloth.getClothDetails("Forever24","Jumpsuit","Women","Polyester","Black","M","Slim","Solid","All",2899,true,true);
        boolean isCloth31 = forever24Cloth.getClothDetails("Forever24","Coat","Men","Wool","Grey","L","Regular","Solid","Winter",4999,true,true);
        boolean isCloth32 = forever24Cloth.getClothDetails("Forever24","Sweatshirt","Unisex","Fleece","Olive","XL","Loose","Solid","Winter",1999,true,true);
        boolean isCloth33 = forever24Cloth.getClothDetails("Forever24","Palazzo","Women","Rayon","Cream","M","Loose","Printed","Summer",1699,true,true);
        boolean isCloth34 = forever24Cloth.getClothDetails("Forever24","Leggings","Women","Cotton","Black","M","Slim","Solid","All",799,true,true);
        boolean isCloth35 = forever24Cloth.getClothDetails("Forever24","Dungaree","Women","Denim","Blue","M","Regular","Solid","All",2599,true,true);
        boolean isCloth36 = forever24Cloth.getClothDetails("Forever24","Cargo Pants","Men","Cotton","Olive","32","Regular","Solid","All",2299,true,true);
        boolean isCloth37 = forever24Cloth.getClothDetails("Forever24","Overshirt","Men","Cotton","Brown","L","Loose","Checks","Winter",1899,true,true);

        if (isCloth1 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth2 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth3 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth4 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth5 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth6 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth7 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth8 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth9 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth10 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth11 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth12 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth13 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth14 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth15 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth16 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth17 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth18 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth19 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth20 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth21 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth22 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth23 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth24 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth25 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth26 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth27 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth28 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth29 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth30 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth31 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth32 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth33 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth34 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth35 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth36 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else if (isCloth37 == true) {
            forever24Cloth.fetchDetails();
            System.out.println("----------------------------------------");
        } else {
            System.out.println("No valid cloth details found");
        }
    }
}