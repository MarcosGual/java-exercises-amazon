public class Teacher extends Employee{
    String qualification;
    Date dateOfAppointment;
    String subject;

    public Teacher(String name, Date dob, Date doa, String subject, String qualification){
        super.name = name;
        super.dob = dob;
        this.dateOfAppointment = doa;
        this.subject = subject;
        this.qualification = qualification;
    }

    @Override
    int getSalary() {
        return this.salary;
    }

    @Override
    void setSalary(int sal) {
        this.salary = sal;
    }

    @Override
    void getDetails(){
        System.out.println("Name of Teacher: " + this.name);
        System.out.println("Date of Birth: " + this.dob.getDate());
        System.out.println("Date of Appointment: " + this.dateOfAppointment.getDate());
        System.out.println("Subject: " + this.subject);
        System.out.println("Qualifications: " + this.subject);
        System.out.println("Salary: " + this.getSalary());
    }
}
