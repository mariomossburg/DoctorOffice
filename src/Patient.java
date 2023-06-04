public class Patient extends Person{

    private String typeOfDoctor;
    private Doctor doctor;


    public Patient(){
        super();
        this.typeOfDoctor = typeOfDoctor;
    }

    public Patient(String name, Doctor doctor, Doctor specialty){
        super(name);
        setDoctor(doctor);
        setTypeOfDoctor(doctor.getSpecialty());

    }


    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setTypeOfDoctor(String typeOfDoctor) {
        this.typeOfDoctor = String.valueOf(typeOfDoctor);
    }

    public String getTypeOfDoctor() {
        return typeOfDoctor;
    }

    @Override
    public String toString(){
        return "Patient name: " + getName() + ". Their doctor: "+ doctor.getName()  + ", whose specialty is " + doctor.getSpecialty()  ;
    }

    public boolean equals(Patient otherPatient) {
        return super.equals(otherPatient) && getTypeOfDoctor() == otherPatient.getTypeOfDoctor() &&  getDoctor() == otherPatient.getDoctor();
    }
}//end class
