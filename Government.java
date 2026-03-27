public class Government {
    public String competitiveExamNames[] = new String[9];
    int index;

    public boolean addExam(String exam) {
        boolean isAdded = false;
        if (index < competitiveExamNames.length) {
            if (exam != null && !exam.isEmpty()) {
                competitiveExamNames[index++] = exam;
                isAdded = true;
            } else System.out.println(exam + " is invalid");
        } else
            System.out.println("exam index is full");
        return isAdded;
    }

    public void getExamDetails() {
        System.out.println("The exams are : \n");
        for (String item : competitiveExamNames)
            if (item != null) System.out.println(item);
    }

    public String getExamByIndex(int index) {
        String exam = null;
        if (index < competitiveExamNames.length)
            exam = competitiveExamNames[index];
        else
            System.out.println("Invalid index value: " + index);
        return exam;
    }

    public int getIndexByExam(String exam) {
        int idx = 0;
        if (exam != null) {
            for (String item : competitiveExamNames) {
                if (item != null && item.equals(exam)) {
                    return idx;
                }
                idx++;
            }
        } else System.out.println("exam name not found: " + exam);
        return -1;
    }
}
