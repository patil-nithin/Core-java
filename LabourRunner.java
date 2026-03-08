
class LabourRunner {

    public static void main(String[] args) {

        Labour l1 = new Labour();
        l1.name="Ramesh";
        l1.salary=15000;
        String[] id1={"Aadhar","PAN","VoterID"};
        l1.idProofs=id1;

        Labour l2 = new Labour();
        l2.name="Suresh";
        l2.salary=18000;
        String[] id2={"Passport","DrivingLicense","Aadhar"};
        l2.idProofs=id2;

        Labour l3 = new Labour();
        l3.name="Mahesh";
        l3.salary=17000;
        String[] id3={"PAN","VoterID","Passport"};
        l3.idProofs=id3;

        Labour l4 = new Labour();
        l4.name="Rajesh";
        l4.salary=16000;
        String[] id4={"DrivingLicense","Aadhar","PAN"};
        l4.idProofs=id4;

        System.out.println("Labour name is "+l1.name+" and salary is "+l1.salary);
        for(String id:l1.idProofs){
            System.out.println("ID proof: "+id);
        }

        System.out.println("Labour name is "+l2.name+" and salary is "+l2.salary);
        for(String id:l2.idProofs){
            System.out.println("ID proof: "+id);
        }

        System.out.println("Labour name is "+l3.name+" and salary is "+l3.salary);
        for(String id:l3.idProofs){
            System.out.println("ID proof: "+id);
        }

        System.out.println("Labour name is "+l4.name+" and salary is "+l4.salary);
        for(String id:l4.idProofs){
            System.out.println("ID proof: "+id);
        }
    }
}
