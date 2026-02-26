class PharmaceuticalCompany {

    static String companyName;
    static String medicineName;
    static String category;
    static String dosage;
    static String form;
    static int quantity;
    static double price;
    static boolean prescriptionRequired;

    static boolean createMedicine(
            String cCompanyName,
            String mName,
            String mCategory,
            String mDosage,
            String mForm,
            int mQuantity,
            double mPrice,
            boolean mPrescriptionRequired) {

        boolean isMedicineCreated = false;

        boolean isCompanyName = false;
        boolean isMedicineName = false;
        boolean isCategory = false;
        boolean isDosage = false;
        boolean isForm = false;
        boolean isQuantity = false;
        boolean isPrice = false;
        boolean isPrescription = false;

        if (cCompanyName != null && !cCompanyName.isEmpty()) {
            isCompanyName = true;
            companyName = cCompanyName;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (mName != null && !mName.isEmpty()) {
            isMedicineName = true;
            medicineName = mName;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (mCategory != null && !mCategory.isEmpty()) {
            isCategory = true;
            category = mCategory;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (mDosage != null && !mDosage.isEmpty()) {
            isDosage = true;
            dosage = mDosage;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (mForm != null && !mForm.isEmpty()) {
            isForm = true;
            form = mForm;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (mQuantity > 0) {
            isQuantity = true;
            quantity = mQuantity;
        } else {
            System.out.println("The input is either Zero or Negative");
        }

        if (mPrice > 0) {
            isPrice = true;
            price = mPrice;
        } else {
            System.out.println("The input is either Zero or Negative");
        }

        if (mPrescriptionRequired == true) {
            isPrescription = true;
            prescriptionRequired = mPrescriptionRequired;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (isCompanyName == true && isMedicineName == true &&
            isCategory == true && isDosage == true &&
            isForm == true && isQuantity == true &&
            isPrice == true && isPrescription == true) {

            isMedicineCreated = true;
        }

        return isMedicineCreated;
    }

    static void getMedicine() {

        System.out.println("fetching details......");
        System.out.println("Company Name is:" + companyName);
        System.out.println("Medicine Name is:" + medicineName);
        System.out.println("Category is:" + category);
        System.out.println("Dosage is:" + dosage);
        System.out.println("Form is:" + form);
        System.out.println("Quantity is:" + quantity);
        System.out.println("Price is:" + price);
        System.out.println("Prescription Required is:" + prescriptionRequired);
    }
}