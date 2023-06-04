import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        double totalAmount = 0.0;
        List<Billing> billings = new ArrayList<>();


        lineBreak();
        Doctor doctor1 = new Doctor("Bob", new Date(12,31,1969), 34000, "Pediatrist", 10.5);
        System.out.println(doctor1);
        Doctor doctor2 = new Doctor("Susan", new Date(12,31,1969), 45000, "Surgeon", 150.5);
        System.out.println(doctor2);
        Doctor doctor3 = new Doctor("Lilly", new Date(12,31,1969), 29000, "kidney", 95.5 );
        System.out.println(doctor3);
        spaceBreak();
        lineBreak();


        System.out.println("*Patient's Information*");
        lineBreak();
        Patient p1 = new Patient("Fred", doctor1, doctor1);
        System.out.println(p1);
        Patient p2 = new Patient("Sally", doctor2, doctor2);
        System.out.println(p2);
        Patient p3 = new Patient("John", doctor3, doctor3);
        System.out.println(p3);
        spaceBreak();
        System.out.println("*Billing Information*");
        lineBreak();
        Billing b1 = new Billing(p1,doctor1,21);
        System.out.println(b1);
        Billing b2 = new Billing(p2,doctor2,150.5);
        System.out.println(b2);
        Billing b3 = new Billing(p3,doctor3,170.0);
        System.out.println(b3);
        spaceBreak();

        billings.add(new Billing(b1.getAmountDue()));
        billings.add(new Billing(b2.getAmountDue()));
        billings.add(new Billing(b3.getAmountDue()));


        for(Billing billing: billings){
            totalAmount += billing.getAmountDue();
        }

        lineBreak();
        System.out.println("The total income from our billing records is: " + totalAmount);






    }//end main
    public static void lineBreak(){
        System.out.println("==============================\n");
    }
    public static void spaceBreak(){
        System.out.println("\n");
    }

}//end class
