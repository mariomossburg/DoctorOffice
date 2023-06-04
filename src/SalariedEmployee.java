

public class SalariedEmployee extends Employee{
    private double salary;

    public SalariedEmployee(){
        super();
        this.salary = 0.0;
    }

    public SalariedEmployee(String name, Date hireDate, double salary){
        super(name,hireDate);

        //Todo: fix parameter so you can pass in hireDate into super
        setSalary(salary);
    }

//    public SalariedEmployee(String name, Date hireDate, double salary){
//        super(name, hireDate);
//        setSalary(salary);
//
//    }
//    public SalariedEmployee(SalariedEmployee salEmployee){
//
//    }

    public void setSalary(double salary) {
        if(salary > 0){
            this.salary = salary;
        }else {
            System.out.println("Error with salary");
            System.exit(0);
        }
    }

    public double getSalary() {
        return this.salary;
    }


    @Override
    public String toString(){
        return "The salaried employee" + getName() + " and was hired on " + getHireDate() + ". Their salary is: $" + getSalary();
    }

    public boolean equals(SalariedEmployee oSalariedEmployee) {
        return super.equals(oSalariedEmployee) && getSalary() == oSalariedEmployee.getSalary();
    } //bad comparison for equals




//    public boolean equals(Person otherPerson){
//        return super.equals(otherPerson);
//       // return super.equals(otherEmployee) && this.getSalary() == otherEmployee.getSalary();
//
//    }
}//end class
