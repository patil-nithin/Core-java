public class Phonepe {
    public String insuranceNames[] = new String[27];
    int index;

    public boolean addInsurance(String insurance) {
        boolean isAdded = false;
        if (index < insuranceNames.length) {
            if (insurance != null && !insurance.isEmpty()) {
                insuranceNames[index++] = insurance;
                isAdded = true;
            } else System.out.println(insurance + " is invalid");
        } else
            System.out.println("insurance index is full");
        return isAdded;
    }

    public void getInsuranceDetails() {
        System.out.println("The insurances are : \n");
        for (String item : insuranceNames)
            if (item != null) System.out.println(item);
    }

    public String getInsuranceByIndex(int index) {
        String insurance = null;
        if (index < insuranceNames.length)
            insurance = insuranceNames[index];
        else
            System.out.println("Invalid index value: " + index);
        return insurance;
    }

    public int getIndexByInsurance(String insurance) {
        int idx = 0;
        if (insurance != null) {
            for (String item : insuranceNames) {
                if (item != null && item.equals(insurance)) {
                    return idx;
                }
                idx++;
            }
        } else System.out.println("insurance name not found: " + insurance);
        return -1;
    }
}
