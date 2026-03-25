public class Government {
    private String competitiveExamNames[] = new String[9];
    int index;

    public boolean addExam(String exam) {
        boolean isExam = false;
        if (exam != null && !exam.isEmpty()) {
            competitiveExamNames[index] = exam;
            index++;
            isExam = true;
        } else {
            System.out.println(exam + " is invalid");
        }
        return isExam;
    }

    public void getExams() {
        System.out.println(" Government Competitive Exams ");
        for (String exam : competitiveExamNames)
            System.out.println(exam);
    }
}
