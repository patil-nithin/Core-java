public class GovernmentExecutor {
    public static void main(String[] args) {
        Government government = new Government();
        government.addExam("UPSC Civil Services");
        government.addExam("SSC CGL");
        government.addExam("IBPS PO");
        government.addExam("RRB NTPC");
        government.addExam("NEET");
        government.addExam("JEE Mains");
        government.addExam("GATE");
        government.addExam("CAT");
        government.addExam("NDA");
        government.getExamDetails();
        int index = 4;
        String examByIndex = government.getExamByIndex(index);
        System.out.println("Exam at index " + index + " is: " + examByIndex);
        String examName = "GATE";
        int examIndex = government.getIndexByExam(examName);
        System.out.println("Index of " + examName + " is: " + examIndex);
    }
}
