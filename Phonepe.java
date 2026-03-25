public class Phonepe {
    private String insuranceNames[] = new String[27];
    int index;

    public boolean addInsurance(String insurance) {
        boolean isInsurance = false;
        if (insurance != null && !insurance.isEmpty()) {
            insuranceNames[index] = insurance;
            index++;
            isInsurance = true;
        } else {
            System.out.println(insurance + " is invalid");
        }
        return isInsurance;
    }

    public void getInsurance() {
        System.out.println(" Phonepe Insurance Names ");
        for (String insurance : insuranceNames)
           System.out.println(insurance);
    }
}
