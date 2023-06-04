

public class Employee extends Person{
     private Date hireDate;

     public Employee(){
          super();
          this.hireDate = new Date(hireDate);

     }

     public Employee(String name, Date hireDate){
          super(name);
          this.hireDate = new Date(hireDate);
     }

     public Employee(Employee otherEmployee) {
          super(otherEmployee.getName());
          if (otherEmployee == null) {
               System.out.println("Error making new Employee");
               System.exit(0);
          }

          this.hireDate = new Date();

     }


     public void setName(String name) {
          super.setName(name);
          if(name == null){
               System.out.println("Invalid name");
               System.exit(0);
          }
     }
     public void setHireDate(Date hireDate) {
          if (hireDate == null) {
               System.out.println("Invalid hiring date");
               System.exit(0);
          }
          this.hireDate = hireDate;
     }
     public String getName() {
          return super.getName();
     }
     public Date getHireDate() {
          return hireDate;
     }
     @Override
     public String toString(){
          return getName() + " was hired on " + getHireDate();
     }
     public boolean equals(Employee otherEmployee) {
          return this.getName().equals(otherEmployee.getName()) && this.getHireDate().equals(this.getHireDate());
          //bad comparison for equals
     }
}//end class
