import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Doctor extends SalariedEmployee{


    LocalDateTime hireTime = LocalDateTime.now();

    private String specialty;
    private double visitFee;

    public Doctor(){
        super();
        specialty = "";
        visitFee = 0.0;
    }

    public Doctor(String name, Date hireDate, double salary, String specialty, double visitFee){
        super(name,hireDate,salary);
        setSpecialty(specialty);
        setVisitFee(visitFee);
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    public void setVisitFee(double visitFee) {
        this.visitFee = visitFee;
    }
    public String getSpecialty() {
        return specialty;
    }
    public double getVisitFee() {
        return visitFee;
    }


    public String toString(){
        return "The doctor " + getName() + " was hired on " + getHireDate() + " at: " + hireTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"))
                +". Their salary is: $" + getSalary() + "\nTheir speciality is " + getSpecialty() + " and the visit fee is $" + getVisitFee();
    }
    public boolean equals(Doctor otherDoctor){
        return super.equals(otherDoctor) && getSpecialty() == otherDoctor.getSpecialty() && getVisitFee() == otherDoctor.getVisitFee();
        // return super.equals(otherEmployee) && this.getSalary() == otherEmployee.getSalary();

    }
}//end class
