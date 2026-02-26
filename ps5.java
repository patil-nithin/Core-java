class ps5 {

    static String brand;
    static String model;
    static int storageGB;
    static String cpu;
    static String gpu;
    static boolean discEdition;
    static boolean supports4K;
    static boolean onlineSupport;

    static boolean getPS5Details(
            String psBrand,
            String psModel,
            int psStorageGB,
            String psCPU,
            String psGPU,
            boolean psDiscEdition,
            boolean psSupports4K,
            boolean psOnlineSupport) {

        boolean isPSCreated = false;

        boolean isBrand = false;
        boolean isModel = false;
        boolean isStorage = false;
        boolean isCPU = false;
        boolean isGPU = false;
        boolean isDisc = false;
        boolean is4K = false;
        boolean isOnline = false;

        if (psBrand != null && !psBrand.isEmpty()) {
            brand = psBrand;
            isBrand = true;
        } else {
            System.out.println("Brand is null or empty");
        }

        if (psModel != null && !psModel.isEmpty()) {
            model = psModel;
            isModel = true;
        } else {
            System.out.println("Model is null or empty");
        }

        if (psStorageGB > 0) {
            storageGB = psStorageGB;
            isStorage = true;
        } else {
            System.out.println("Storage is zero or negative");
        }

        if (psCPU != null && !psCPU.isEmpty()) {
            cpu = psCPU;
            isCPU = true;
        } else {
            System.out.println("CPU is null or empty");
        }

        if (psGPU != null && !psGPU.isEmpty()) {
            gpu = psGPU;
            isGPU = true;
        } else {
            System.out.println("GPU is null or empty");
        }

        if (psDiscEdition) {
            discEdition = psDiscEdition;
            isDisc = true;
        } else {
            System.out.println("Disc edition not supported");
        }

        if (psSupports4K) {
            supports4K = psSupports4K;
            is4K = true;
        } else {
            System.out.println("4K not supported");
        }

        if (psOnlineSupport) {
            onlineSupport = psOnlineSupport;
            isOnline = true;
        } else {
            System.out.println("Online support not available");
        }

        if (isBrand && isModel && isStorage && isCPU &&
            isGPU && isDisc && is4K && isOnline) {

            isPSCreated = true;
        }

        return isPSCreated;
    }

    static void fetchDetails() {

        System.out.println("fetching PS5 details......");
        System.out.println("Brand is:" + brand);
        System.out.println("Model is:" + model);
        System.out.println("Storage (GB) is:" + storageGB);
        System.out.println("CPU is:" + cpu);
        System.out.println("GPU is:" + gpu);
        System.out.println("Disc Edition is:" + discEdition);
        System.out.println("4K Support is:" + supports4K);
        System.out.println("Online Support is:" + onlineSupport);
    }
}