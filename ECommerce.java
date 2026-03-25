public class ECommerce {
    private String productNames[] = new String[26];
    int index;

    public boolean addProduct(String product) {
        boolean isProduct = false;
        if (product != null && !product.isEmpty()) {
            productNames[index] = product;
            index++;
            isProduct = true;
        } else {
            System.out.println(product + " is invalid");
        }
        return isProduct;
    }

    public void getProducts() {
        System.out.println(" ECommerce Products ");
        for (String product : productNames)
          System.out.println(product);
    }
}
