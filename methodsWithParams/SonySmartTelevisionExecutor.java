class SonySmartTelevisionExecutor {

    public static void main(String[] args) {

        System.out.println("Brand Name: " + SonySmartTelevision.getBrandName());
        System.out.println("Model Name: " + SonySmartTelevision.getModelName());
        System.out.println("Screen Size: " + SonySmartTelevision.getScreenSizeInInches() + " Inches");
        System.out.println("Refresh Rate: " + SonySmartTelevision.getRefreshRate() + " Hz");
        System.out.println("Price: Rs " + SonySmartTelevision.getPrice());
        System.out.println("Serial Number: " + SonySmartTelevision.getSerialNumber());
        System.out.println("Is Smart TV: " + SonySmartTelevision.getIsSmartTv());
        System.out.println("Resolution: " + SonySmartTelevision.getResolution());
        System.out.println("Warranty: " + SonySmartTelevision.getWarrantyInYears() + " Years");
        System.out.println("Weight: " + SonySmartTelevision.getWeightInKg() + " Kg");
    }
}
