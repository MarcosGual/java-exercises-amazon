public class Student extends Person{
    String subject;
    Teacher teacher;
    Date date;

    Student(String name, Date date, Teacher teacher, String subject){
        this.name = name;
        this.date = date;
        this.teacher = teacher;
        this.subject = subject;
    }

    @Override
    void getDetails(){
        System.out.println("Name of Student: " + this.name);
        System.out.println("Date of Birth: " + this.date.getDate());
        System.out.println("Subject: " + this.subject);
        System.out.println("Teacher: " + this.teacher.name);
    }
}
