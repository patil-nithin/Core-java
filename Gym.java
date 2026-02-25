class Gym {

    public static void main(String[] args) {

        String gymTitle = "ROCK Fitness";
        String headTrainer = "Ajay";
        String gymLocation = "Kollegal";

        String equipmentList[] = {"Treadmill", "Dumbbells", "Bench Press", "Cycling"};
        String gymMembers[] = {"Rohit", "Manoj", "Karthik", "Lalu"};

        System.out.println("The Gym Name is : " + gymTitle);
        System.out.println("The Trainer Name is : " + headTrainer);
        System.out.println("The Address is : " + gymLocation);

        System.out.println("The Number of Equipments is " + equipmentList.length);
        for (String equipment : equipmentList) {
            System.out.println(equipment);
        }

        System.out.println("The Number of Members are " + gymMembers.length);
        for (String memberName : gymMembers) {
            System.out.println(memberName);
        }
    }
}
