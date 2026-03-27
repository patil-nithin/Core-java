public class PhonepeExecutor {
    public static void main(String[] args) {
        Phonepe phonepe = new Phonepe();
        phonepe.addInsurance("Health Insurance");
        phonepe.addInsurance("Life Insurance");
        phonepe.addInsurance("Car Insurance");
        phonepe.addInsurance("Bike Insurance");
        phonepe.addInsurance("Home Insurance");
        phonepe.addInsurance("Travel Insurance");
        phonepe.addInsurance("Term Insurance");
        phonepe.addInsurance("Fire Insurance");
        phonepe.addInsurance("Marine Insurance");
        phonepe.addInsurance("Crop Insurance");
        phonepe.addInsurance("Personal Accident Insurance");
        phonepe.addInsurance("Critical Illness Insurance");
        phonepe.addInsurance("Child Insurance");
        phonepe.addInsurance("Pension Insurance");
        phonepe.addInsurance("Disability Insurance");
        phonepe.addInsurance("Liability Insurance");
        phonepe.addInsurance("Flood Insurance");
        phonepe.addInsurance("Earthquake Insurance");
        phonepe.addInsurance("Pet Insurance");
        phonepe.addInsurance("Business Insurance");
        phonepe.addInsurance("Group Health Insurance");
        phonepe.addInsurance("Cancer Insurance");
        phonepe.addInsurance("Dental Insurance");
        phonepe.addInsurance("Vision Insurance");
        phonepe.addInsurance("Student Insurance");
        phonepe.addInsurance("Senior Citizen Insurance");
        phonepe.addInsurance("Maternity Insurance");
        phonepe.getInsuranceDetails();
        int index = 4;
        String insuranceByIndex = phonepe.getInsuranceByIndex(index);
        System.out.println("Insurance at index " + index + " is: " + insuranceByIndex);
        String insuranceName = "Travel Insurance";
        int insuranceIndex = phonepe.getIndexByInsurance(insuranceName);
        System.out.println("Index of " + insuranceName + " is: " + insuranceIndex);
    }
}
