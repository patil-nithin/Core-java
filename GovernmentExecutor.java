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
        government.getExams();
    }
}
