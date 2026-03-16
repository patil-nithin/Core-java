class DiabetesRunner {
    public static void main(String[] args) {

        System.out.println("\n");

        Diabetes d1 = new Diabetes("Type 2");
        System.out.println("1. The diabetes classification is " + d1.type + ".");

        Diabetes d2 = new Diabetes(true);
        System.out.println("2. Is this diagnosed as Type 1 diabetes? " + d2.isType1 + ".");

        Diabetes d3 = new Diabetes(422);
        System.out.println("3. The global patient count is estimated at " + d3.patientCountMillions + " million people.");

        Diabetes d4 = new Diabetes(135.5);
        System.out.println("4. The recorded average blood sugar level is " + d4.averageBloodSugar + " mg/dL.");

        Diabetes d5 = new Diabetes(6.4f);
        System.out.println("5. The patient's HbA1c test reveals a level of " + d5.hba1cLevel + "%.");

        Diabetes d6 = new Diabetes(760000000000L);
        System.out.println("6. The global health expenditure for this condition is $" + d6.globalExpenditureUsd + ".");

        Diabetes d7 = new Diabetes((short)45);
        System.out.println("7. The typical onset age for this specific patient profile is " + d7.onsetAge + " years old.");

        Diabetes d8 = new Diabetes((byte)8);
        System.out.println("8. The calculated risk level for complications is " + d8.riskLevel + " out of 10.");

        Diabetes d9 = new Diabetes('E');
        System.out.println("9. The medical diagnostic category code is '" + d9.diagnosticCode + "'.");

        Diabetes d10 = new Diabetes("Gestational", "Metformin");
        System.out.println("10. The condition is " + d10.type + " and the prescribed medication is " + d10.medication + ".");

        Diabetes d11 = new Diabetes(30, 4);
        System.out.println("11. Affecting " + d11.patientCountMillions + " million locally, it requires " + d11.dailyCheckups + " daily glucose checkups.");

        Diabetes d12 = new Diabetes(true, true);
        System.out.println("12. Diagnosed as Type 1: " + d12.isType1 + ". Does the patient require insulin? " + d12.requiresInsulin + ".");
    }
}