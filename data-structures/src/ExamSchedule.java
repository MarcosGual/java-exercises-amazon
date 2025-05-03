public class ExamSchedule {
    private ExamNode head;
    private ExamNode current;

    public ExamSchedule() {
        this.head = null;
        this.current = null;
    }


    public void addExam(String examDetails) {
        // TODO 2: Implement logic to add an exam to the end of the linked list
        if(head == null){
            head = new ExamNode(examDetails);
            current = head;
            System.out.println(STR."Exam added: \{examDetails}");
            return;
        }

        ExamNode newExam = new ExamNode(examDetails);
        ExamNode last = head;

        while (last.next != null){
            last = last.next;
        }

        last.next = newExam;
        newExam.prev = last;
        System.out.println(STR."Exam added: \{newExam.examDetails}");
    }


    public void viewNextExam() {
        if (current == null) {
            System.out.println("No exams available.");
        } else {
            // TODO 3: Implement the logic to move to the next exam in the list and displays it
            System.out.println(STR."Exam: \{current.examDetails}");
            if(current.next != null){
                current = current.next;
            }else{
                System.out.println("You have reached the last exam.");
            }
        }
    }


    public void viewPreviousExam() {
        if (current == null) {
            System.out.println("No exams available.");
        } else {
            // TODO 3: Implement the logic to move to the next exam in the list and displays it
            if(current.prev != null){
                current = current.prev;
                System.out.println(STR."Previous Exam: \{current.examDetails}");
            }else{
                System.out.println("There's no previous exam.");
            }
        }
    }

    public void viewAllExamSchedule() {
        ExamNode temp = head;
        if (temp == null) {
            System.out.println("No exams scheduled.");
        } else {
            System.out.println("Exam Schedule:");
            while (temp != null) {
                System.out.println(temp.examDetails);
                temp = temp.next;
            }
        }
    }
}


