class EducationRunner {
    public static void main(String[] args) {

        System.out.println("\n");

        Education e1 = new Education("Stanford University");
        System.out.println("1. The educational institution's name is " + e1.institutionName + ".");

        Education e2 = new Education(true);
        System.out.println("2. Is this institution a publicly funded university? " + e2.isPublic + ".");

        Education e3 = new Education(35000);
        System.out.println("3. The campus currently supports " + e3.studentCount + " enrolled students.");

        Education e4 = new Education(45000.50);
        System.out.println("4. The average annual tuition fee is $" + e4.annualTuition + ".");

        Education e5 = new Education(92.5f);
        System.out.println("5. The university boasts an impressive graduation rate of " + e5.graduationRate + "%.");

        Education e6 = new Education(15000000000L);
        System.out.println("6. The institution's financial endowment fund sits at $" + e6.endowmentFund + ".");

        Education e7 = new Education((short)1885);
        System.out.println("7. This historic college was founded in the year " + e7.foundingYear + ".");

        Education e8 = new Education((byte)5);
        System.out.println("8. The school holds a prestigious national ranking of number " + e8.ranking + ".");

        Education e9 = new Education('A');
        System.out.println("9. The national board awarded this program an accreditation grade of '" + e9.accreditationGrade + "'.");

        Education e10 = new Education("MIT", "Massachusetts");
        System.out.println("10. " + e10.institutionName + " is proudly located in the state of " + e10.stateLocation + ".");

        Education e11 = new Education(12000, 3500);
        System.out.println("11. The campus serves " + e11.studentCount + " students with a dedicated staff of " + e11.staffCount + " professionals.");

        Education e12 = new Education(false, true);
        System.out.println("12. Public funding status: " + e12.isPublic + ". Does the school offer online degree programs? " + e12.offersOnline + ".");
    }
}