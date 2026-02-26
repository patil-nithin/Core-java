class forever24Cloth {

    static String brand;
    static String category;
    static String gender;
    static String material;
    static String color;
    static String size;
    static String fit;
    static String pattern;
    static String season;
    static double price;
    static boolean washable;
    static boolean inStock;

    static boolean getClothDetails(
            String cBrand,
            String cCategory,
            String cGender,
            String cMaterial,
            String cColor,
            String cSize,
            String cFit,
            String cPattern,
            String cSeason,
            double cPrice,
            boolean cWashable,
            boolean cInStock) {

        boolean isClothCreated = false;
        boolean isBrand = false;
        boolean isCategory = false;
        boolean isGenderValid = false;
        boolean isMaterial = false;
        boolean isColor = false;
        boolean isSize = false;
        boolean isFitValid = false;
        boolean isPatternValid = false;
        boolean isSeason = false;
        boolean isPrice = false;
        boolean isWashableValid = false;
        boolean isStockValid = false;

        if (cBrand != null && !cBrand.isEmpty()) {
            isBrand = true;
            brand = cBrand;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (cCategory != null && !cCategory.isEmpty()) {
            isCategory = true;
            category = cCategory;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (cGender != null && !cGender.isEmpty()) {
            isGenderValid = true;
            gender = cGender;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (cMaterial != null && !cMaterial.isEmpty()) {
            isMaterial = true;
            material = cMaterial;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (cColor != null && !cColor.isEmpty()) {
            isColor = true;
            color = cColor;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (cSize != null && !cSize.isEmpty()) {
            isSize = true;
            size = cSize;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (cFit != null && !cFit.isEmpty()) {
            isFitValid = true;
            fit = cFit;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (cPattern != null && !cPattern.isEmpty()) {
            isPatternValid = true;
            pattern = cPattern;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (cSeason != null && !cSeason.isEmpty()) {
            isSeason = true;
            season = cSeason;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (cPrice > 0) {
            isPrice = true;
            price = cPrice;
        } else {
            System.out.println("The input is either Zero or Negative");
        }

        if (cWashable == true) {
            isWashableValid = true;
            washable = cWashable;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (cInStock == true) {
            isStockValid = true;
            inStock = cInStock;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (isBrand == true && isCategory == true && isGenderValid == true &&
            isMaterial == true && isColor == true && isSize == true &&
            isFitValid == true && isPatternValid == true &&
            isSeason == true && isPrice == true &&
            isWashableValid == true && isStockValid == true) {

            isClothCreated = true;
        }

        return isClothCreated;
    }

    static void fetchDetails() {

        System.out.println("fetching details......");
        System.out.println("Brand is:" + brand);
        System.out.println("Category is:" + category);
        System.out.println("Gender is:" + gender);
        System.out.println("Material is:" + material);
        System.out.println("Color is:" + color);
        System.out.println("Size is:" + size);
        System.out.println("Fit is:" + fit);
        System.out.println("Pattern is:" + pattern);
        System.out.println("Season is:" + season);
        System.out.println("Price is:" + price);
        System.out.println("Washable is:" + washable);
        System.out.println("In Stock is:" + inStock);
    }
}