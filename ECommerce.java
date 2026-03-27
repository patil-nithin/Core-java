public class ECommerce {
    public String productNames[] = new String[26];
    int index;

    public boolean addProduct(String product) {
        boolean isAdded = false;
        if (index < productNames.length) {
            if (product != null && !product.isEmpty()) {
                productNames[index++] = product;
                isAdded = true;
            } else System.out.println(product + " is invalid");
        } else
            System.out.println("product index is full");
        return isAdded;
    }

    public void getProductDetails() {
        System.out.println("The products are : \n");
        for (String item : productNames)
            if (item != null) System.out.println(item);
    }

    public String getProductByIndex(int index) {
        String product = null;
        if (index < productNames.length)
            product = productNames[index];
        else
            System.out.println("Invalid index value: " + index);
        return product;
    }

    public int getIndexByProduct(String product) {
        int idx = 0;
        if (product != null) {
            for (String item : productNames) {
                if (item != null && item.equals(product)) {
                    return idx;
                }
                idx++;
            }
        } else System.out.println("product name not found: " + product);
        return -1;
    }
}
