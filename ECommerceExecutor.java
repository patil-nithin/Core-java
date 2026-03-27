public class ECommerceExecutor {
    public static void main(String[] args) {
        ECommerce eCommerce = new ECommerce();
        eCommerce.addProduct("Laptop");
        eCommerce.addProduct("Mobile Phone");
        eCommerce.addProduct("Headphones");
        eCommerce.addProduct("Smartwatch");
        eCommerce.addProduct("Tablet");
        eCommerce.addProduct("Keyboard");
        eCommerce.addProduct("Mouse");
        eCommerce.addProduct("Monitor");
        eCommerce.addProduct("Printer");
        eCommerce.addProduct("Camera");
        eCommerce.addProduct("Speaker");
        eCommerce.addProduct("TV");
        eCommerce.addProduct("Refrigerator");
        eCommerce.addProduct("Washing Machine");
        eCommerce.addProduct("Air Conditioner");
        eCommerce.addProduct("Microwave");
        eCommerce.addProduct("Trimmer");
        eCommerce.addProduct("Iron Box");
        eCommerce.addProduct("Vacuum Cleaner");
        eCommerce.addProduct("Water Purifier");
        eCommerce.addProduct("Electric Kettle");
        eCommerce.addProduct("Mixer Grinder");
        eCommerce.addProduct("Toaster");
        eCommerce.addProduct("Fan");
        eCommerce.addProduct("Air Purifier");
        eCommerce.addProduct("Juicer");
        eCommerce.getProductDetails();
        int index = 7;
        String productByIndex = eCommerce.getProductByIndex(index);
        System.out.println("Product at index " + index + " is: " + productByIndex);
        String productName = "Camera";
        int productIndex = eCommerce.getIndexByProduct(productName);
        System.out.println("Index of " + productName + " is: " + productIndex);
    }
}
