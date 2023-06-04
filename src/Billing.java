import java.util.ArrayList;
import java.util.List;

public class Billing extends Patient{

    private Patient patient;
    private Doctor doctor;
    private double amountDue;




    public Billing(){
        super();
        amountDue = 0.0;

    }
    public Billing(double amountDue){
        super();
        setAmountDue(amountDue);

    }

    public Billing(Patient patient, Doctor doctor, double amountDue){
        super();
        setPatient(patient);
        setDoctor(doctor);
        setAmountDue(amountDue);
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    @Override
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }

    public String toString() {
        return "Patient: " + getPatient().getName() + "\nDoctor: " + getDoctor().getName() + "\nAmountDue: $" + getAmountDue() ;
    }

    public boolean equals(Billing otherBilling) {
        return super.equals(otherBilling);
        // && getDoctor() == otherBilling.getDoctor() &&  getPatient() == otherBilling.getPatient()
    }




}//end class
