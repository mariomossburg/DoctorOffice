public class Person {
    private String name;
    public Person(){
        name = "No name";
    }
    public Person(String name){
        setName(name);
    }
    public Person(Person object){
        if(object == null){
            System.out.println("Error Making Person");
            System.exit(0);
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name == null) {
            System.out.println("Error Making Person");
            System.exit(0);
        }
        this.name = name;
    }
    public String toString(){
        return "The Person's name is " + getName();
    }
    public boolean equals(Person otherPerson){
        return getName().equals(otherPerson.getName());
    }

}//end class
